package Utilities;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class UIHelpers {

    public static void waitInSeconds(int sec){
        try{
            Thread.sleep(sec * 1000);
        }catch (InterruptedException e){
            throw new RuntimeException();
        }
    }



    public void screenShot(WebDriver driver)  {
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        LocalDateTime timeOfBug = LocalDateTime.now();
        DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("MMddyyyyhhmmss");
        String date = timeOfBug.format(timeFormat);
        String filePath = "src/screenshots/image_"+date+".jpeg";
        File fullPage = new File(filePath);
        File tempFile =  screenshot.getScreenshotAs(OutputType.FILE);
        try {
            // Which Dependency are we use for FileUtils in Java Selenium
            FileUtils.copyFile(tempFile,fullPage);
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public void scrollToElementJsExecutor(WebElement element) {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) WebDriverFactory.getDriver();
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);",element );
    }

    public void clickOnElementJsExecutor(WebElement element){
        JavascriptExecutor jsExecutor = (JavascriptExecutor) WebDriverFactory.getDriver();
        jsExecutor.executeScript("arguments[0].click();", element);
    }


    public WebElement waitForVisibility(WebElement element, int timeout){
        WebDriverWait wait = new WebDriverWait(WebDriverFactory.getDriver(), Duration.ofSeconds(timeout));
        return wait.until(ExpectedConditions.visibilityOf(element));
    }

    public WebElement waitForClickAblitiy(WebElement element, int timeout){
        WebDriverWait wait = new WebDriverWait(WebDriverFactory.getDriver(), Duration.ofSeconds(timeout));
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }
    public void selectByVisibleText(WebElement element,String text){
        Select select = new Select(element);
        select.selectByVisibleText(text);
    }// its just fo String
    //        uiHelpers.selectByVisibleText(faceBookPage.dayDropDownList, day);-- like this is coling from methods
    public void selectByIndex(WebElement element,int index){
        Select select = new Select(element);
        select.selectByIndex(index);
    } // It's just for Integer


}
