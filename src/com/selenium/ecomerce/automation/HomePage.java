package com.selenium.ecomerce.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HomePage {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:/Selenium JARS and Drivers/chromedriver-win64/chromedriver-win64/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //max the chrome browser
        driver.manage().window().maximize();

        //navigate to the url
        driver.get("http://www.automationpractice.pl/index.php");

        //TestCase-1
        //enter dresses on search bar
        driver.findElement(By.id("search_query_top")).sendKeys("dresses");
        driver.findElement(By.name("submit_search")).click();

        //TestCase-2
        //Newsletter automation
        driver.findElement(By.id("newsletter-input")).sendKeys("abc@gmail.com");
        driver.findElement(By.name("submitNewsletter")).click();

        //TestCase-3
        //No of Links in the home page
        List<WebElement> link = driver.findElements(By.tagName("a"));
        System.out.println(link.size());

        //name of links in the home page
        for (WebElement l : link) {
            System.out.println(l.getText());
        }

        //TestCase-4
        //verify the Title
        //getTitle()
        String act_title = driver.getTitle();
        System.out.println(act_title);
        String desierd_title = "My Shop";
        //verify
        if (act_title.equals(desierd_title)) {
            System.out.println("pass");
        } else {
            System.out.println("fail");
        }

        String page_source=driver.getPageSource();
        System.out.println(page_source);


         driver.quit();
    }
}