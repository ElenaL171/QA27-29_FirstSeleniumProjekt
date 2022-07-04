package com.telran.qa;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HALogin extends HATestBase {
    @Test
    public void loginUserPositiveTest() {
        //click on Login link
        login();
        //    wd.findElement(By.xpath("//*[@id='email']"));
        Assert.assertTrue(isElementPresent(By.xpath("//*[@id='userName']")));
    }
}
