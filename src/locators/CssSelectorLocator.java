package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorLocator {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        WebElement cssId1 = driver.findElement(By.cssSelector("input[id='login1']"));
        cssId1.sendKeys("abc");
        Thread.sleep(3000);
        WebElement cssId2 = driver.findElement(By.cssSelector("input#login1"));
        cssId2.sendKeys("tommy");

        WebElement cssClass1 = driver.findElement(By.cssSelector("em[class='eye-icon']"));
        cssClass1.click();
        Thread.sleep(3000);
        WebElement cssClass2 = driver.findElement(By.cssSelector("em.eye-icon"));
        cssClass2.click();
        Thread.sleep(3000);
        driver.close();
    }
}
