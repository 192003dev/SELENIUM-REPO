package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateDemo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://mail.rediff.com/cgi-bin/login.cgi");
        Thread.sleep(3000);
        driver.findElement(By.linkText("Forgot Password?")).click();
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().forward();
        Thread.sleep(3000);
        driver.navigate().refresh();
        Thread.sleep(3000);
        driver.close();
    }
}
