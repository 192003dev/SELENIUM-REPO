package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class IFrameDemo {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.setBinary("C:\\Users\\LENOVO\\Downloads\\chrome-win32\\chrome-win32\\chrome.exe");
        options.addArguments("--remote-allow-origin=*");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

       /*  driver.get("https://www.letskodeit.com/practice");
        //fetching all the iframes in the web-page.
       List<WebElement> list = driver.findElements(By.tagName("iframe"));
        System.out.println(list.size());*/

        driver.get("https://demoqa.com/frames");
        //fetching all the iframes in the web-page.
        List<WebElement> list = driver.findElements(By.tagName("iframe"));
        System.out.println(list.size());
        //switch control to that frame
        //performing operation on a frame with the help of it's index
       /* driver.switchTo().frame(2);
        String s = driver.findElement(By.id("sampleHeading")).getText();
        System.out.println(s);*/

        //switch control to that frame
        //performing operation on a frame with the help of it's id
       /* driver.switchTo().frame("frame2");
        String s1 = driver.findElement(By.id("sampleHeading")).getText();
        System.out.println(s1);*/

        //switch control to that frame
        //performing operation on a frame with the help of it's xpath
        WebElement element = driver.findElement(By.xpath("//iframe[@id='frame1']"));
        driver.switchTo().frame(element);
        String s2 = driver.findElement(By.id("sampleHeading")).getText();
        System.out.println(s2);
        Thread.sleep(3000);
        driver.close();
    }
}
