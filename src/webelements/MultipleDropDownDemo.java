package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleDropDownDemo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://selenium08.blogspot.com/2019/11/dropdown.html");
        WebElement multipleDropDown = driver.findElement(By.name("Month"));
        Select select = new Select(multipleDropDown);
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView();",multipleDropDown);

        select.selectByVisibleText("February");
        select.selectByVisibleText("March");
        select.selectByVisibleText("April");
        select.selectByVisibleText("May");
        Thread.sleep(3000);
        select.deselectByVisibleText("February");
        Thread.sleep(3000);
        select.selectByValue("Oct");
        select.deselectByValue("Oct");
        Thread.sleep(3000);
        select.selectByIndex(9);
        select.deselectByIndex(9);
        Thread.sleep(3000);
        select.deselectAll();
        driver.close();
    }
}
