package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWaitDemo {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.setBinary("C:\\Users\\LENOVO\\Downloads\\chrome-win32\\chrome-win32\\chrome.exe");
        options.addArguments("--remote-allow-origin=*");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        //implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement forgotPassword = driver.findElement(By.linkText("Forgot Password?"));
       //explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(forgotPassword)).click();
        Thread.sleep(3000);
        WebElement textBox = driver.findElement(By.id("login1"));
        textBox.sendKeys("abc");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@name='proceed']")).click();
        Thread.sleep(3000);
        driver.quit();

        //fluent wait
        Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(50)).pollingEvery(Duration.ofSeconds(5))
                .ignoring(Exception.class);
    }
}
