package com.selenium.ecomerce.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignIn {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:/Selenium JARS and Drivers/chromedriver-win64/chromedriver-win64/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //max the chrome browser
        driver.manage().window().maximize();

        //navigate to the url
        driver.get("http://www.automationpractice.pl/index.php?controller=authentication&back=my-account");

        //TestCase-2 If Already registered?
        //enter Email Adress
        driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
        //Enter Password
        driver.findElement(By.id("passwd")).sendKeys("222222");
        //Click submit button
        driver.findElement(By.id("SubmitLogin")).click();

    //    driver.quit();
    }
}