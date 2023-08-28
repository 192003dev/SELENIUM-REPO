package statusmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedDemo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.letskodeit.com/practice");
        WebElement textBox = driver.findElement(By.id("displayed-text"));
        System.out.println("by default status for displayed method:"+textBox.isDisplayed());
        textBox.sendKeys("abcd");
        Thread.sleep(3000);
        driver.findElement(By.id("hide-textbox")).click();
        System.out.println("status for displayed method after clicking on hide button:"+textBox.isDisplayed());
        Thread.sleep(3000);
        driver.close();
    }
    }
