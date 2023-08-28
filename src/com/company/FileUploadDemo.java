package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FileUploadDemo {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.setBinary("C:\\Users\\LENOVO\\Downloads\\chrome-win32\\chrome-win32\\chrome.exe");
        options.addArguments("--remote-allow-origin=*");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/upload");
        WebElement chooseFile = driver.findElement(By.id("file-upload"));
        chooseFile.sendKeys("C:\\Users\\LENOVO\\Desktop\\st\\ppts\\4th module-selenium ppts\\P10-Waits in Selenium.pptx");
        Thread.sleep(3000);
        driver.findElement(By.id("file-submit")).click();
        Thread.sleep(3000);
        WebElement upoladed = driver.findElement(By.xpath("//h3[text()='File Uploaded!']"));
        if (upoladed.getText().equals("File Uploaded!")){
            System.out.println("file uploaded successfully!!");
        }else {
            System.out.println("file not uploaded successfully!!");
        }
        driver.close();
    }
}
