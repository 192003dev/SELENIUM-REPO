package actionskeyboardmouse;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToDemo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.letskodeit.com/practice");
        Actions actions = new Actions(driver);
        WebElement moveMouse = driver.findElement(By.id("mousehover"));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView();",moveMouse);
        actions.moveToElement(moveMouse).perform();
        Thread.sleep(5000);
        driver.close();
    }
}
