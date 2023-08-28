package alerts;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class SinpleAlertDemo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.letskodeit.com/practice");
        WebElement alertBtn = driver.findElement(By.id("alertbtn"));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView();",alertBtn);
        alertBtn.click();
        Thread.sleep(2000);
        Alert alert = driver.switchTo().alert();
        alert.accept();
        Thread.sleep(2000);
        driver.close();
    }
}
