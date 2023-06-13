package org.example;

import com.google.common.annotations.VisibleForTesting;
import org.apache.commons.lang3.builder.ToStringExclude;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import javax.swing.*;
import java.sql.SQLOutput;

public class Sample {

    WebDriver driver;

    @BeforeTest(groups = {"regression"})
    public void test() {

        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();

    }

      @Test (groups = {"sanity"})
        public void test1(){

        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("namiranigwan@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("783256");

        driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();

    }


    @Test(groups = {"smoking"})
    public void test2(){
    driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("pyu@gmail.com");
    driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("808016@pmt");

    driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();

   }


    @Test(groups = {"smoking"})
    public void test3(){
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("xyz@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("10897@pmt");

        driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();

    }


   @AfterTest
   public void test4(){
        driver.manage().window().getPosition();

        driver.close();

    }




}
