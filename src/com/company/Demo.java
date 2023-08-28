package com.company;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://mail.rediff.com/cgi-bin/login.cgi");
        System.out.println(driver.getTitle());
        System.out.println(driver.getPageSource());
        System.out.println(driver.getCurrentUrl());
       // Thread.sleep(1000);
        //driver.navigate().forward();
        //Thread.sleep(1000);
        //driver.navigate().back();
        Thread.sleep(3000);
        driver.close();
    }
}
