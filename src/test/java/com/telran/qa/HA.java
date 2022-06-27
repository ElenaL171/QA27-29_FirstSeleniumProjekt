package com.telran.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class HA {
    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver=new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Test
    public void startFindLocators()
    {
        driver.findElement(By.cssSelector("title"));//tagName
        driver.findElement(By.xpath("//title"));

        driver.findElement(By.cssSelector("#columns"));//id
        driver.findElement(By.cssSelector("//*[@id='columns']"));

        driver.findElement(By.cssSelector(".header-container"));//class
        driver.findElement(By.xpath("//*[@class='header-container']"));

        driver.findElement(By.cssSelector("#header"));//id
        driver.findElement(By.xpath("//*[@id='header']"));

        driver.findElement(By.cssSelector("#page"));//id
        driver.findElement(By.xpath("//*[@id='page']"));

        driver.findElement(By.cssSelector(".nav"));//class
        driver.findElement(By.xpath("//*[@class='nav']"));

        driver.findElement(By.cssSelector("[title='sample-1']"));//attribute
        driver.findElement(By.xpath("//*[title='sample-1']"));//attribute

        driver.findElement(By.cssSelector("#homepage-slider"));//id
        driver.findElement(By.xpath("//*[@id='homepage-slider']"));

        driver.findElement(By.cssSelector(".bx-wrapper"));//class
        driver.findElement(By.xpath("//*[@class='bx-wrapper']"));

        driver.findElement(By.cssSelector(".row"));//class
        driver.findElement(By.xpath("//*[@class='row']"));
    }

    @AfterMethod
    public void tearDown()
    {
        driver.quit();
    }
}
