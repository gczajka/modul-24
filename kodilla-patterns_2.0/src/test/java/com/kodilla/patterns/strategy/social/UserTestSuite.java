package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        Millenials mill = new Millenials("mill");
        YGeneration ygen = new YGeneration("yGen");
        ZGeneration zgen = new ZGeneration("zGen");

        //When
        String m = mill.sharePost();
        String y = ygen.sharePost();
        String z = zgen.sharePost();

        //Then
        Assert.assertEquals("Facebook", m);
        Assert.assertEquals("Snapchat", y);
        Assert.assertEquals("Twitter", z);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        Millenials mill = new Millenials("mill");

        //When
        mill.setPublisher(new SnapchatPublisher());
        String a = mill.sharePost();

                //Then
        Assert.assertEquals("Snapchat", a);
    }
}
