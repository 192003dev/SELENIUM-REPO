package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TagNameLocator {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        List<WebElement> links = driver.findElements(By.tagName("a"));
        for (WebElement e : links){
           // System.out.println(e.getSize());
            System.out.println(e);
        }
        System.out.println("total no.of anchor tags:"+links.size());

        List<WebElement> divisions = driver.findElements(By.tagName("div"));
        for (WebElement e : divisions){
            System.out.println(e);
        }
        System.out.println("total no.of div tags:"+divisions.size());

        List<WebElement> inputs = driver.findElements(By.tagName("input"));
        for (WebElement e : inputs){
            System.out.println(e);
        }
        System.out.println("total no.of input tags:"+inputs.size());
        Thread.sleep(3000);
        driver.close();
    }
}
