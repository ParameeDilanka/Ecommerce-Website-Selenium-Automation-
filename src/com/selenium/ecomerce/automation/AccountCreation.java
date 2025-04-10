package com.selenium.ecomerce.automation;

//error

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AccountCreation {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:/Selenium JARS and Drivers/chromedriver-win64/chromedriver-win64/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //max the chrome browser
        driver.manage().window().maximize();

        //navigate to the url
        driver.get("http://www.automationpractice.pl/index.php?controller=authentication&back=my-account#account-creation");

        //fill in your personal informations
        // Locate and click the "Mrs" radio button
        WebElement femaleRadioBtn = driver.findElement(By.id("id_gender2"));

        if (!femaleRadioBtn.isSelected()) {
            femaleRadioBtn.click();
        }

        //enter Firstname
        driver.findElement(By.id("customer_firstname")).sendKeys("Kunali");
        //enter Lastname
        driver.findElement(By.id("customer_lastname")).sendKeys("Priya");
        //enter email
        driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
        //enter password
        driver.findElement(By.id("passwd")).sendKeys("222222");
        //Click submit button
        driver.findElement(By.id("SubmitCreate")).click();
        //select date of birth drop down menu
        WebElement day = driver.findElement(By.id("days"));
        WebElement month = driver.findElement(By.id("months"));
        WebElement year = driver.findElement(By.id("years"));

        // Create Select objects
        Select selectDay = new Select(day);
        Select selectMonth = new Select(month);
        Select selectYear = new Select(year);

        // Select values
        selectDay.selectByVisibleText("9");
        selectMonth.selectByVisibleText("April");
        selectYear.selectByVisibleText("1987");

        //Click submit button
        driver.findElement(By.id("submitAccount")).click();

        driver.quit();
    }
}