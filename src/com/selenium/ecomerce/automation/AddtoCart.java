package com.selenium.ecomerce.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AddtoCart {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:/Selenium JARS and Drivers/chromedriver-win64/chromedriver-win64/chromedriver.exe");
    WebDriver driver = new ChromeDriver();

    //max the chrome browser
        driver.manage().window().maximize();


    //navigate to the url
        driver.get("http://www.automationpractice.pl/index.php?id_product=4&controller=product#/2-size-m/24-color-pink");
        driver.findElement(By.xpath("//span[text()='Add to cart']")).click();
//        driver.findElement(By.name("Submit")).click();

        //navigate to the url
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='layer_cart']//h2")));
driver.findElement(By.xpath("//span[contains(text(),'Proceed to checkout')]")).click();


        driver.findElement(By.xpath("//span[text()='Proceed to checkout']")).click();

        //enter Email Adress
        driver.findElement(By.id("email")).sendKeys("prakashraj20190@gmail.com");
        //Enter Password
        driver.findElement(By.id("passwd")).sendKeys("123456");
        //Click submit button
        driver.findElement(By.id("SubmitLogin")).click();

        driver.findElement(By.xpath("//span[text()='Proceed to checkout']")).click();
// Locate the checkbox
        WebElement termsCheckbox = driver.findElement(By.id("cgv"));

// Check if it's not already selected
        if (!termsCheckbox.isSelected()) {
            termsCheckbox.click(); // Click to check it
        }
        driver.findElement(By.xpath("//button/span[contains(text(),'Proceed to checkout')]")).click();




    }
}
