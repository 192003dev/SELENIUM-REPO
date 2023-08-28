package statusmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedDemo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.letskodeit.com/practice");
        WebElement radioBtn = driver.findElement(By.id("bmwradio"));
        WebElement checkBox = driver.findElement(By.id("benzcheck"));
        System.out.println("default status for selection of radio button bmw is:"+radioBtn.isSelected());
        System.out.println("default status for selection of check box benz is:"+checkBox.isSelected());
        radioBtn.click();
        checkBox.click();
        Thread.sleep(3000);
        System.out.println("status for selection of radio button bmw is after selecting:"+radioBtn.isSelected());
        System.out.println("status for selection of check box benz is after selecting:"+checkBox.isSelected());
        driver.close();
    }
    }
