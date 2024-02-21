package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class UploadDocuments {
    public static void main(String[] args) throws InterruptedException, AWTException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://uae.astrautm.com/up/pilot-register");
//        To scroll down
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1500)", "");
        Thread.sleep(1000);
        WebElement uploadPassport = driver.findElement(By.xpath("//label[@for='passportFrontSide']"));
        uploadPassport.click();
        Thread.sleep(2000);
        Robot rb = new Robot();
        StringSelection uploadPassportDocument = new StringSelection("/Users/lubnish/Downloads/Upload.pdf");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(uploadPassportDocument, null);
        rb.keyPress(KeyEvent.VK_CONTROL);
        rb.keyPress(KeyEvent.VK_V);
        rb.keyPress(KeyEvent.VK_ENTER);
        rb.keyRelease(KeyEvent.VK_ENTER);
    }
}
