package com.company;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Hashtable;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.setBinary("C:\\Users\\LENOVO\\Downloads\\chrome-win32\\chrome-win32\\chrome.exe");
        options.addArguments("--remote-allow-origin=*");
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
        driver.get("http://www.facebook.com");
        Thread.sleep(3000);
        driver.close();

        Hashtable<Integer,String> table = new Hashtable<>();
        Map<Integer,String> map = new Hashtable<>();

        map.put(101,"abc");
        map.put(102,"def");

        for (Map.Entry<Integer,String> e : map.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
        }

    }
}
