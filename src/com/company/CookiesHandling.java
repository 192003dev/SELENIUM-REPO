package com.company;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Set;

public class CookiesHandling {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.setBinary("C:\\Users\\LENOVO\\Downloads\\chrome-win32\\chrome-win32\\chrome.exe");
        options.addArguments("--remote-allow-origin=*");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        System.out.println("step1:fetching all the cookies from browser for amazon site");
        Set<Cookie> allCookies = driver.manage().getCookies();
        for (Object o : allCookies){
            System.out.println(o);//printing all cookies
        }
        System.out.println("--------------------------------------------------");

        //adding a new cookie:-
        Cookie cookie = new Cookie("Digital","Partners");
        Cookie cookie1 = new Cookie("Software","Testing");
        driver.manage().addCookie(cookie);
        driver.manage().addCookie(cookie1);

        System.out.println("step2:creating and adding two cookies");
        Set<Cookie> allCookiess = driver.manage().getCookies();
        for (Object o : allCookiess){
            System.out.println(o);//printing all cookies
        }

        System.out.println("step3:fetching specific cookies by their name ");
        //fetching cookie by name:-
        Cookie getCookieByName1 = driver.manage().getCookieNamed("Digital");
        System.out.println("-------------------------------"+getCookieByName1);

        Cookie getCookieByName2 = driver.manage().getCookieNamed("Software");
        System.out.println("-------------------------------"+getCookieByName2);

        System.out.println("step4:deleting specific cookies by name");
        //deleting a specific cookie
        driver.manage().deleteCookie(cookie);
        Set<Cookie> allCookiess1 = driver.manage().getCookies();
        for (Object o : allCookiess1){
            System.out.println(o);//printing all cookies
        }
        System.out.println("--------------------------------------------------");

        driver.manage().deleteCookieNamed("Software");
        Set<Cookie> allCookiess2 = driver.manage().getCookies();
        for (Object o : allCookiess2){
            System.out.println(o);//printing all cookies
        }
        System.out.println("--------------------------------------------------");

        System.out.println("step5:deleting all the cookies");
        driver.manage().deleteAllCookies();
        Set<Cookie> allCookiess3 = driver.manage().getCookies();
        for (Object o : allCookiess3){
            System.out.println(o);//printing all cookies
        }
        System.out.println("--------------------------------------------------");

        Thread.sleep(3000);
        driver.close();
    }
}
