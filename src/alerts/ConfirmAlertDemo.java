package alerts;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmAlertDemo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.letskodeit.com/practice");
        WebElement textfield = driver.findElement(By.id("name"));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView();",textfield);
        textfield.sendKeys("1234");
        Thread.sleep(2000);
        WebElement confirmBtn = driver.findElement(By.id("confirmbtn"));
        confirmBtn.click();
        Thread.sleep(2000);
        Alert alert = driver.switchTo().alert();
       // alert.accept();
        alert.dismiss();
        Thread.sleep(2000);
        driver.close();
    }
}
