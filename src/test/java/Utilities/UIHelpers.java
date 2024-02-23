package Utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class UIHelpers {
    public static void waitInSeconds(int sec) {
        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException();
        }
    }

    public void screenShot(WebDriver driver) {
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        LocalDateTime timeOfBug = LocalDateTime.now();
        DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("MMddyyyyhhmmss");
        String date = timeOfBug.format(timeFormat);
        String filePath = "src/screenshots/image_" + date + ".jpeg";
        File fullPage = new File(filePath);
        File tempFile = screenshot.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(tempFile, fullPage);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void scrollToElementJsExecutor(WebElement element) {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) WebDriverFactory.getDriver();
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    //        uiHelpers.scrollToElementJsExecutor(exercisePage.createAccountSignUpButton);
    public static void clickOnElementJsExecutor(WebElement element) {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) WebDriverFactory.getDriver();
        jsExecutor.executeScript("arguments[0].click();", element);
    }

    //        UIHelpers.clickOnElementJsExecutor(DemoMRS.OpenMRS2DemoButton);
    public WebElement waitForClickAblitiy(WebElement element, int timeout) {
        WebDriverWait wait = new WebDriverWait(WebDriverFactory.getDriver(), Duration.ofSeconds(timeout));
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    //commonmethod
    public WebDriverWait wait = new WebDriverWait(WebDriverFactory.getDriver(), Duration.ofSeconds(10));

    public void waitUntilVisible(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitUntilClickable(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void clickMethod(WebElement element) {
        waitUntilClickable(element);
        scrollToElement(element);
        element.click();
    }

    public void sendKeysMethod(WebElement element, String text) {
        waitUntilVisible(element);
        scrollToElement(element);
        element.sendKeys(text);
    }

    public void scrollToElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) WebDriverFactory.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void assertTrueMethod(boolean assertion) {
        Assert.assertTrue(assertion);
    }

    public void assertEqualMethod(String actual, String expected) {
        Assert.assertEquals(actual, expected);
    }

    public void assertEqualMethod(int actual, int expected) {
        Assert.assertEquals(actual, expected);
    }

    public void assertFalseMethod(boolean assertion) {
        Assert.assertFalse(assertion);
    }

    public void assertNotEqualMethod(String actual, String expected) {
        Assert.assertNotEquals(actual, expected);
    }

    public void assertNotEqualMethod(int actual, int expected) {
        Assert.assertNotEquals(actual, expected);

    }
}