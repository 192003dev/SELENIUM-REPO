package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownDemo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://selenium08.blogspot.com/2019/11/dropdown.html");
        Select select = new Select(driver.findElement(By.name("country")));

       /* select.selectByVisibleText("Albania");
        Thread.sleep(3000);

        select.selectByValue("AF");
        Thread.sleep(3000);*/

       select.selectByIndex(3);
        Thread.sleep(3000);
        driver.close();
    }
}
