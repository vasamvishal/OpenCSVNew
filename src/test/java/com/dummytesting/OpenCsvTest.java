package com.dummytesting;


import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class OpenCsvTest {

    @Test
    public void Shouldreturnhappy() throws IOException {
        OPencsv oPencsv = new OPencsv();
        Assert.assertEquals(37,oPencsv.numberOfRecord());

    }

}



