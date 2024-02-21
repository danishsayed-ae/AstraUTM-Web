package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class RecreationalSignUpInsideUAE {
    public static void main(String[] args) throws InterruptedException, AWTException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://uae.astrautm.com/up/pilot-register");
        Thread.sleep(1000);
        String firstName = "Test";
        String lastName = "Pilot";
        int pilotNumber = 52;
        driver.findElement(By.id("firstName")).sendKeys(firstName);
        Thread.sleep(1000);
        driver.findElement(By.id("lastName")).sendKeys(lastName+" "+pilotNumber);
        Thread.sleep(1000);
        driver.findElement(By.id("arabicFullName")).sendKeys("دانيش سيد");
        Thread.sleep(1000);
        driver.findElement(By.id("arabicFamilyName")).sendKeys("السيد");
        Thread.sleep(1000);
        driver.findElement(By.id("arabicAlias")).sendKeys("دانيش");
        Thread.sleep(1000);
//        DOB
        driver.findElement(By.xpath("//input[@name='dateOfBirth']")).click();
        Thread.sleep(1000);

//        To scroll down
        Thread.sleep(500);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,300)");
        Thread.sleep(1000);

//        Place of birth
        driver.findElement(By.id("placeOfBirth")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[text()='Algeria']")).click();
        Thread.sleep(1000);
//        Gender
        driver.findElement(By.id("gender")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[text()='Male']")).click();
        Thread.sleep(1000);
//        Nationality
        driver.findElement(By.id("nationality")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[text()='Afghanistan']")).click();
        Thread.sleep(3000);

//        Identification Information
//        Passport Number
        driver.findElement(By.id("passportNo")).sendKeys("N876327845");
        Thread.sleep(1000);
//        Passport Place Of Issue
        driver.findElement(By.xpath("//div[@id='passportIssuePlace']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[text()='Albania']")).click();
        Thread.sleep(1000);
//        Passport Issue Date
        driver.findElement(By.xpath("//input[@name='passportIssueDate']")).click();
        Thread.sleep(1000);
//        Passport Expiry Date
        driver.findElement(By.xpath("//input[@name='passportExpiryDate']")).click();
        Thread.sleep(1000);
//        EID Number
        WebElement EID = driver.findElement(By.id("emiratesIDNo"));
        EID.click();
        Thread.sleep(1000);
        EID.sendKeys("199615415970");
        Thread.sleep(1000);
//        EID Issue Date
        driver.findElement(By.xpath("//input[@name='emiratesIdIssueDate']")).click();
        Thread.sleep(1000);
//        EID Expiry Date
        driver.findElement(By.xpath("//input[@name='emiratesIdExpiryDate']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//h3[normalize-space()='Account Information']")).click();

//        To scroll down
        Thread.sleep(1000);
        js.executeScript("window.scrollBy(0,300)");
        Thread.sleep(1000);

//        Account Information
//        Email
        String emailAddress = firstName+lastName+pilotNumber+"@yopmail.com";
        driver.findElement(By.id("emailId")).sendKeys(emailAddress);
        Thread.sleep(1000);
//        Mobile Number
        driver.findElement(By.xpath("//input[@name='mobileNo']")).sendKeys("569885623");
        Thread.sleep(1000);
//        Phone Number
        driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("569885623");
        Thread.sleep(1000);
//        Password
        String password = "Test@1234";
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
        Thread.sleep(1000);
//        Confirm Password
        driver.findElement(By.xpath("//input[@id='cpassword']")).sendKeys(password);
        Thread.sleep(1000);

//        To scroll down
        js.executeScript("window.scrollBy(0,300)");
        Thread.sleep(2000);

//        Declaration of Information
//        Topic
        driver.findElement(By.id("purposeCode")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[text()='Recreational Hobby']")).click();
        Thread.sleep(1000);
//        State
        driver.findElement(By.id("stateCode")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[text()='Dubai']")).click();
        Thread.sleep(1000);
//        City cityCode
        driver.findElement(By.id("cityCode")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[text()='DELMA ']")).click();
        Thread.sleep(1000);

//        To scroll down
        js.executeScript("window.scrollBy(0,500)");
        Thread.sleep(2000);

//        Attachment Uploads
//        Passport
        WebElement uploadPassport = driver.findElement(By.xpath("//label[@for='passportFrontSide']"));
        uploadPassport.click();
        Thread.sleep(2000);
        Robot rb = new Robot();
        StringSelection uploadPassportDocument = new StringSelection("C:\\Users\\danis\\OneDrive\\Desktop\\Documents\\Passport.pdf");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(uploadPassportDocument, null);
        rb.keyPress(KeyEvent.VK_CONTROL);
        rb.keyPress(KeyEvent.VK_V);
        rb.keyPress(KeyEvent.VK_ENTER);
        rb.keyRelease(KeyEvent.VK_ENTER);

//        Visa Copy
        WebElement uploadVisa = driver.findElement(By.xpath("//label[@for='visaCopy']"));
        uploadVisa.click();
        StringSelection uploadVisaDocument = new StringSelection("C:\\Users\\danis\\OneDrive\\Desktop\\Documents\\Visa Copy.pdf");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(uploadVisaDocument, null);
        rb.keyPress(KeyEvent.VK_CONTROL);
        rb.keyPress(KeyEvent.VK_V);
        rb.keyPress(KeyEvent.VK_ENTER);
        rb.keyRelease(KeyEvent.VK_ENTER);

//        Applicant Photo
        WebElement uploadApplicantPhoto = driver.findElement(By.xpath("//label[@for='applicantPhotograph']"));
        uploadApplicantPhoto.click();
        StringSelection uploadApplicantDocument = new StringSelection("C:\\Users\\danis\\OneDrive\\Desktop\\Documents\\Danish.jpg");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(uploadApplicantDocument, null);
        rb.keyPress(KeyEvent.VK_CONTROL);
        rb.keyPress(KeyEvent.VK_V);
        rb.keyPress(KeyEvent.VK_ENTER);
        rb.keyRelease(KeyEvent.VK_ENTER);


//        Terms and Condition
        driver.findElement(By.id("checkbox")).click();
        Thread.sleep(1000);












    }
}
