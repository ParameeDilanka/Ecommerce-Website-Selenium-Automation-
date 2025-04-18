package com.selenium.ecomerce.automation;

import org.openqa.selenium.By;
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

        //Navigate to the url of the available product
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //Add to the cart
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='layer_cart']//h2")));
       //Proceed to checkout
        driver.findElement(By.xpath("//span[contains(text(),'Proceed to checkout')]")).click();

        //Summary page proceed to checkout
        driver.findElement(By.xpath("//span[text()='Proceed to checkout']")).click();

        //Sign in page login
        driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
        driver.findElement(By.id("passwd")).sendKeys("222222");
        driver.findElement(By.id("SubmitLogin")).click();

        //Address page proceed to checkout
        driver.findElement(By.xpath("//span[text()='Proceed to checkout']")).click();

        //Shipping page check box click and proceed to checkout
        // Locate the checkbox
        WebElement termsCheckbox = driver.findElement(By.id("cgv"));
        // Check if it's not already selected
        if (!termsCheckbox.isSelected()) {
            termsCheckbox.click(); // Click to check it
        }
        driver.findElement(By.xpath("//button/span[contains(text(),'Proceed to checkout')]")).click();

        //Payment page - select the payment method and confirm the order
        driver.findElement(By.xpath("//a[contains(text(),'Pay by bank wire')]")).click();
        driver.findElement(By.xpath("//span[contains(text(),'I confirm my order')]")).click();

        //View order history
        driver.findElement(By.xpath("//a[contains(text(),'View your order history')]")).click();
        driver.findElement(By.xpath("//a[contains(text(),'FTIELWDYR')]")).click();

        driver.quit();

    }
}
