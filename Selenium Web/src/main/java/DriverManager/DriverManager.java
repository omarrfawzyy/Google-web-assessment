package DriverManager;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;

public class DriverManager {

    public static WebDriver driver = new ChromeDriver();
    public static void startDriver() throws MalformedURLException {
        WebDriverManager.chromedriver().setup();
        driver.get("https://www.google.com/");

        driver.manage().window().maximize();
    }

    public static void tearDown() throws MalformedURLException {
        driver.close();
    }
}
