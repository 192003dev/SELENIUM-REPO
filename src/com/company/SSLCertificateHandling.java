package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SSLCertificateHandling {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.setBinary("C:\\Users\\LENOVO\\Downloads\\chrome-win32\\chrome-win32\\chrome.exe");
        options.addArguments("--remote-allow-origin=*");
        //options.setHeadless(true);//it does not show the ui while executing script and runs actions background
        //handling ssl certificate:-
        options.setAcceptInsecureCerts(true);
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://expired.badssl.com/");
        String name = driver.findElement(By.id("content")).getText();
        System.out.println(name);
        Thread.sleep(3000);
        driver.close();
    }
}
