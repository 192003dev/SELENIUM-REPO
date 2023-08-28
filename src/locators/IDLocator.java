package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IDLocator {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        WebElement userName = driver.findElement(By.id("login1"));
        WebElement password = driver.findElement(By.id("password"));
        WebElement eyeButton = driver.findElement(By.id("eyeicon"));
        userName.sendKeys("sara");
        password.sendKeys("1234");
        eyeButton.click();
        Thread.sleep(3000);
        driver.close();
    }
}
