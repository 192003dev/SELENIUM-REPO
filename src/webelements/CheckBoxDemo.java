package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxDemo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.letskodeit.com/practice");
        WebElement checkBox1 = driver.findElement(By.id("benzcheck"));
        checkBox1.click();
        Thread.sleep(3000);
        WebElement checkBox2 = driver.findElement(By.id("hondacheck"));
        checkBox2.click();
        Thread.sleep(5000);
        driver.close();
    }
}
