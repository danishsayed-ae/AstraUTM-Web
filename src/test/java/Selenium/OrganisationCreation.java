package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.time.Duration;

public class OrganisationCreation {
    public static void main(String[] args) throws IOException, InterruptedException {
//        Initialisation
        WebDriver driver = new ChromeDriver();
        driver.get("https://eu.astrautm.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@href='/up/commercialsignup']")).click();
        Thread.sleep(2000);

//        Organisation Details
        driver.findElement(By.xpath("//a[normalize-space()='Commercial (Local)']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='orgName']")).sendKeys("Tabby");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class=' css-19bb58m']")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("react-select-2-option-6")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='address1']")).sendKeys("Sharjah, UAE.");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='tradeLicenseNo']")).sendKeys("TR-Tabby");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='establishmentCardNo']")).sendKeys("EST-Tabby");

//        To scroll down
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");

//        Document Upload
        Thread.sleep(2000);
        driver.findElement(By.xpath("//label[@for='uploadTradeLicence']")).click();
        Thread.sleep(2000);
        Runtime.getRuntime().exec("D:\\Office\\Automation\\TradeLicense.exe");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//label[@for='establishmentCardNoUrl']")).click();
        Thread.sleep(2000);
        Runtime.getRuntime().exec("D:\\Office\\Automation\\EstablishmentCard.exe");
        Thread.sleep(2000);

//        To scroll down
        js.executeScript("window.scrollBy(0,500)");

//        Authorised Personal Information
        driver.findElement(By.xpath("//input[@id='authorisedPerson']")).sendKeys("Danish Sayed");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='mobileNo']")).sendKeys("569662541");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='emailId']")).sendKeys("danish.tabby@yopmail.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='emiratesIDNo']")).sendKeys("784-1995-6544872-1");
        Thread.sleep(2000);

//        To scroll down
        js.executeScript("window.scrollBy(0,500)");

//        Document Upload
        driver.findElement(By.xpath("//label[@for='powerofattorneyUrl']")).click();
        Thread.sleep(2000);
        Runtime.getRuntime().exec("D:\\Office\\Automation\\PowerOfAttorney.exe");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//label[@for='emiratesIDNoUrl']")).click();
        Thread.sleep(2000);
        Runtime.getRuntime().exec("D:\\Office\\Automation\\EmiratesID.exe");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.quit();

    }
}