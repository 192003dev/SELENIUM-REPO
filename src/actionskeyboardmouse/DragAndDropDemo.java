package actionskeyboardmouse;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropDemo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://selenium08.blogspot.com/2020/01/drag-drop.html");
        Actions actions = new Actions(driver);
        WebElement drag = driver.findElement(By.id("draggable"));
        WebElement drop =driver.findElement(By.id("droppable"));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView();",drag);
        actions.dragAndDrop(drag,drop).perform();
        Thread.sleep(5000);
        driver.close();
    }
}
