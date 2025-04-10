package com.selenium.ecomerce.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SignInPage {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:/Selenium JARS and Drivers/chromedriver-win64/chromedriver-win64/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //max the chrome browser
        driver.manage().window().maximize();

        //navigate to the url
        driver.get("http://www.automationpractice.pl/index.php?controller=authentication&back=my-account");

        //TestCase-1 Create an account
        //enter Email Adress
        driver.findElement(By.id("email_create")).sendKeys("abc@gmail.com");
        //Click submit button
        driver.findElement(By.id("SubmitCreate")).click();

        driver.quit();

    }}