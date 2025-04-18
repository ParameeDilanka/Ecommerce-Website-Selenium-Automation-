package com.selenium.ecomerce.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ContactUsPage {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:/Selenium JARS and Drivers/chromedriver-win64/chromedriver-win64/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //max the chrome browser
        driver.manage().window().maximize();

        //navigate to the url
        driver.get("http://www.automationpractice.pl/index.php?controller=contact");

        //selectsubject heading from drop down menu
        WebElement heading = driver.findElement(By.id("id_contact"));
        // Create Select objects
        Select selectheading = new Select(heading);
        //Select values
        selectheading.selectByVisibleText("Webmaster");

        //enter Email Adress
        driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
        //Enter OrderReference
        driver.findElement(By.id("id_order")).sendKeys("778912");
        //Enter Message
        driver.findElement(By.id("message")).sendKeys("This order is invalid");
        //Click send button
        driver.findElement(By.id("submitMessage")).click();

        driver.quit();
    }
}