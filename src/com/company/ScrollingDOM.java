package com.company;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingDOM {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        Thread.sleep(3000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        //Scroll down:
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        Thread.sleep(3000);
        //Scroll up:
        js.executeScript("window.scrollTo(0, -document.body.scrollHeight);");
        Thread.sleep(3000);
        driver.close();
    }
}
