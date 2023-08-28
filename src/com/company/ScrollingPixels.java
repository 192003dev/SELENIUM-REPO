package com.company;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingPixels {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
       /* driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        Thread.sleep(3000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        //for scrolling the page up and down only:-
        js.executeScript("window.scrollBy(0,750)");//scroll down
        Thread.sleep(3000);
        js.executeScript("window.scrollBy(0,-750)");//scroll up
        Thread.sleep(3000);*/

        //for scrolling the page left and right only:-
        driver.get("https://www.selenium.dev/");
        Thread.sleep(3000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(300,0)");//scroll right
        Thread.sleep(3000);
        js.executeScript("window.scrollBy(-300,0)");//scroll left
        Thread.sleep(3000);
        driver.close();
    }
}
