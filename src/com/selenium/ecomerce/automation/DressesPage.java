package com.selenium.ecomerce.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DressesPage {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:/Selenium JARS and Drivers/chromedriver-win64/chromedriver-win64/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //max the chrome browser
        driver.manage().window().maximize();

        //navigate to the url
        driver.get("http://www.automationpractice.pl/index.php?id_category=8&controller=category");

        //TestCase-1 autosuggestions
        WebElement from =  driver.findElement(By.id("selectProductSort"));
       from.click();
       from.sendKeys("In Stock");
        Thread.sleep(2000);
        from.sendKeys(Keys.ARROW_UP);
        from.sendKeys(Keys.ENTER);



    }}