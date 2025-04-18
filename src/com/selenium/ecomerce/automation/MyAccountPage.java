package com.selenium.ecomerce.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MyAccountPage {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:/Selenium JARS and Drivers/chromedriver-win64/chromedriver-win64/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //max the chrome browser
        driver.manage().window().maximize();

        //navigate to the url
        driver.get("http://www.automationpractice.pl/index.php?controller=authentication&back=my-account");

        //TestCase-1 If Already registered?
        //enter Email Adress
        driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
        //Enter Password
        driver.findElement(By.id("passwd")).sendKeys("222222");
        //Click submit button
        driver.findElement(By.id("SubmitLogin")).click();

        //TestCase-2 Create My Account
        //Add My First Address
        driver.findElement(By.cssSelector("a[title='Add my first address'] span")).click();
        driver.findElement(By.id("company")).sendKeys("Daraz");
        driver.findElement(By.id("address1")).sendKeys("23 Main Street, Apt 4B");
        driver.findElement(By.id("address2")).sendKeys("Up Town");
        driver.findElement(By.id("city")).sendKeys("Chicago");

        //Select State From Drop Down Menu
        WebElement stateDropdown = driver.findElement(By.id("id_state"));
        Select selectState = new Select(stateDropdown);
        selectState.selectByVisibleText("Ohio");

        driver.findElement(By.id("postcode")).sendKeys("90087");

        //Select Country From Drop Down Menu
        WebElement countryDropdown = driver.findElement(By.id("id_country"));
        Select selectCountry = new Select(countryDropdown);
        selectCountry.selectByVisibleText("United States");

        driver.findElement(By.id("phone")).sendKeys("09978352437");
        driver.findElement(By.id("phone_mobile")).sendKeys("07978351837");
        driver.findElement(By.id("other")).sendKeys("Use Primary Address");
        driver.findElement(By.id("alias")).sendKeys("12A, DT, LA");

        driver.findElement(By.id("submitAddress")).click();

        driver.quit();
    }
}