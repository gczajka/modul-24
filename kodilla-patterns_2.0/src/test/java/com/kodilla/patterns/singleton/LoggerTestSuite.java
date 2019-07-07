package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {
    @Test
    public void getLastLog() {
        //Given
        Logger logger = Logger.getInstance();

        //When
        logger.log("first");
        String log1 = logger.getLastLog();

        //Then
        Assert.assertEquals("first", log1);
    }
}
