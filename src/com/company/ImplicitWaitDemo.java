package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class ImplicitWaitDemo {
    /*global wait :- because it is applied on all the web elements present
      in a web page whether they are being used in the test script or not.*/
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.setBinary("C:\\Users\\LENOVO\\Downloads\\chrome-win32\\chrome-win32\\chrome.exe");
        options.addArguments("--remote-allow-origin=*");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        //applying implicit wait to all the web-elements
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //creating a existing web-element
        WebElement footer = driver.findElement(By.xpath("//a[text()='Disclaimer']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();",footer);
        Thread.sleep(3000);
        //creating a non-existing web-element
        WebElement textBox = driver.findElement(By.id("login"));
        textBox.sendKeys("abc");
        Thread.sleep(3000);
        driver.quit();
    }
}
