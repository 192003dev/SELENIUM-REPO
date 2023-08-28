package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewsLinks {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        WebElement news1 = driver.findElement(By.linkText("Yasin Malik appears in SC without permission: 4 officials suspended"));
        WebElement news2 = driver.findElement(By.linkText("Court's verdict on Asian Games trials sparks outrage"));
        WebElement news3 = driver.findElement(By.linkText("2 more women were raped, killed in Manipur on May 4: Complaint"));
        WebElement news4 = driver.findElement(By.linkText("IT stocks log biggest gain in nearly three years as growth worries ebb"));
        WebElement news5 = driver.findElement(By.linkText("Trophy Shared! India, Bangladesh tie final ODI"));
        Thread.sleep(3000);
      //  news1.click();
        news2.click();
        news3.click();
        news4.click();
        news5.click();
        Thread.sleep(3000);
        driver.close();
    }
}
