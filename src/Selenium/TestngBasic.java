package Selenium;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestngBasic {
    @Test
    public void test1(){
        String testExpected = "cao";
        //dohvatanje podataka
        String testActual = "cao";

        Assert.assertEquals(testActual, testExpected);
    }
}
