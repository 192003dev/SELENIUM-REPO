package actionskeyboardmouse;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActions {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        Actions actions = new Actions(driver);
        WebElement userName = driver.findElement(By.id("login1"));
        actions.moveToElement(userName);
        actions.keyDown(Keys.SHIFT).sendKeys("software").keyUp(Keys.SHIFT).build().perform();
        Thread.sleep(3000);
        driver.close();
    }
}
