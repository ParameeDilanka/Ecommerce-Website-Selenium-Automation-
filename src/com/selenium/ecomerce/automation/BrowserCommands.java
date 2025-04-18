package com.selenium.ecomerce.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:/Selenium JARS and Drivers/chromedriver-win64/chromedriver-win64/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //max the chrome browser
        driver.manage().window().maximize();

        //navigate to the url - 1
        driver.get("http://www.automationpractice.pl/index.php?controller=authentication&back=my-account");

        //navigate to the url - 2
        //Assign the url to a string variable
        //String url = "http://www.automationpractice.pl/index.php?controller=authentication&back=my-account";
        //driver.get(url);

        //url of the page
        String url = driver.getCurrentUrl();
        System.out.println("URL of the page is:" + url);

        //verify the url
            if (url.equals("http://www.automationpractice.pl/index.php?controller=authentication&back=my-account")) {
                 System.out.println("The URL is verified");
            } else {
                 System.out.println("The URL is not verified");
            }
            //getTitle()
            String title = driver.getTitle();
            System.out.println("Title of the page is:" + title);

            if (title.equals("My Shop")) {
                System.out.println("The title is verified");
            } else {
                System.out.println("The title is not verified");
            }


            // length of the title
            int titlelength = driver.getTitle().length();
            System.out.println("Length of the page is:" + titlelength);

            //pagesource
            String page_source=driver.getPageSource();
            System.out.println("The page source is: " + page_source);

            //length of page source
            int pslength = driver.getPageSource().length();
            System.out.println("The length of the page source is: " + pslength);

            //close
            Thread.sleep(5000);
            driver.close();

            //quit
            Thread.sleep(5000);
            driver.quit();
        }

    }

