package statusmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledDemo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.letskodeit.com/practice");
        WebElement textBox = driver.findElement(By.id("enabled-example-input"));
        System.out.println("by default status for enabled method:"+textBox.isEnabled());
        textBox.sendKeys("abcd");
        Thread.sleep(3000);
        driver.findElement(By.id("disabled-button")).click();
        System.out.println("status for enabled method after clicking on disable button:"+textBox.isEnabled());
        Thread.sleep(3000);
        driver.close();
    }
    }
