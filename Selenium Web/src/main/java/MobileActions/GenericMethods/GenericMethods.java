package MobileActions.GenericMethods;

import DriverManager.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class GenericMethods extends DriverManager {

    private static final Duration DEFAULT_WAIT_TIME = Duration.ofSeconds(35);

    public static WebElement waitForElementReadiness(By by) {
        WebDriverWait wait = new WebDriverWait(driver, DEFAULT_WAIT_TIME);
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public static void type(By by, String str) {
//
        driver.findElement(by).sendKeys(str);
    }

    public static void click(By by) {
        waitForElementReadiness(by);
        driver.findElement(by).click();
    }

    public static void submit(By by) {
        driver.findElement(by).submit();
    }

    public static void scrollDown(By by) {

        while (!elementDisplayed(by)) {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,360)");
        }
    }

    public static String getElementText(By by) {
        WebElement element = waitForElementReadiness(by);
        return element.getText();
    }

    public static boolean elementDisplayed(By by) {
        waitForElementReadiness(by);
        return DriverManager.driver.findElement(by).isDisplayed();
    }

    public static void assertTrue(Boolean condition) {
        assertTrue(condition);
    }


}
