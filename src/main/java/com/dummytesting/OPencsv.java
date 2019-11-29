package com.dummytesting;


import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;

import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.util.Iterator;

public class OPencsv {
    private static final String SAMPLE_CSV_FILE_PATH = "user/Pictures/StateCode.csv";

    public int numberOfRecord() throws IOException, CustomException {
        int noOfRecord = 0;
        try {

            Reader reader = Files.newBufferedReader(Paths.get(SAMPLE_CSV_FILE_PATH));
            CsvToBean<CSVUser> csvToBean = new CsvToBeanBuilder(reader)
                    .withType(CSVUser.class)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();
            Iterator<CSVUser> csvUserIterator = csvToBean.iterator();
            while (csvUserIterator.hasNext()) {
                CSVUser csvUser = csvUserIterator.next();
                noOfRecord++;
            }
        } catch (NoSuchFileException e) {
            throw new CustomException("Enter Proper file name ", CustomException.ExceptionType.NO_SUCHFILE);
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (IllegalStateException ex) {
            ex.printStackTrace();
        }

        return noOfRecord;
    }
}








