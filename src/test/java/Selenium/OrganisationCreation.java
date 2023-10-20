package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.time.Duration;

public class OrganisationCreation {
    public static void main(String[] args) throws IOException, InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://eu.astrautm.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.xpath("//a[@href='/up/commercialsignup']")).click();
        driver.findElement(By.xpath("//input[@id='orgName']")).sendKeys("Laraix");
        driver.findElement(By.xpath("//div[@class=' css-19bb58m']")).click();
//        driver.findElement(By.linkText("Commercial (Local)")).click();
        driver.findElement(By.name("orgName")).sendKeys("FANS");
        driver.findElement(By.xpath("//div[@class=' css-hlgwow']")).click();
        driver.findElement(By.id("react-select-2-option-6")).click();
        driver.findElement(By.xpath("//input[@id='address1']")).sendKeys("Sharjah, UAE.");
        driver.findElement(By.xpath("//input[@id='tradeLicenseNo']")).sendKeys("TR554433");
        driver.findElement(By.xpath("//input[@id='establishmentCardNo']")).sendKeys("EST554433");
        driver.findElement(By.xpath("//label[@for='establishmentCardNoUrl']")).click();

        /*
        driver.findElement(By.xpath("//label[@for='uploadTradeLicence']")).click();
        Thread.sleep(2000);
        Runtime.getRuntime().exec("D:\\Danish\\Automation\\TradeLicense.exe");
        driver.findElement(By.xpath("//label[@for='establishmentCardNoUrl']//p[@class='required']")).click();
        Thread.sleep(2000);
        Runtime.getRuntime().exec("D:\\Danish\\Automation\\EstablishmentCard.exe");
        driver.findElement(By.xpath("//input[@id='authorisedPerson']")).sendKeys("Aqsa Khurram");
        driver.findElement(By.xpath("//input[@name='mobileNo']")).sendKeys("569662541");
        driver.findElement(By.xpath("//input[@id='emailId']")).sendKeys("manager.laraix@yopmail.com");
        driver.findElement(By.xpath("//input[@id='emiratesIDNo']")).sendKeys("784-1996-6548972-2");
//        To scroll down
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)", "");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//label[@for='powerofattorneyUrl']")).click();
        Thread.sleep(2000);
        Runtime.getRuntime().exec("D:\\Danish\\Automation\\PowerOfAttorney.exe");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//label[@for='emiratesIDNoUrl']")).click();
        Thread.sleep(2000);
        Runtime.getRuntime().exec("D:\\Danish\\Automation\\EmiratesID.exe");
//        driver.findElement(By.xpath("//button[@type='submit']")).click();
        */

        //li[@class='dropdown-icon down active menuupbutton']//ul[@class='dropdown-part']//li//a[contains(text(),'List All')]

    }
}