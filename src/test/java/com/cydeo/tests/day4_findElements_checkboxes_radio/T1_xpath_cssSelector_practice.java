package com.cydeo.tests.day4_findElements_checkboxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_xpath_cssSelector_practice {

    public static void main(String[] args) {
        //TC #1: XPATH and cssSelector Practices
        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2. Go to https://practice.cydeo.com/forgot_password
        driver.get("https://practice.cydeo.com/forgot_password");

        //3. Locate all the WebElements on the page using XPATH and/or CSS
        //locator only (total of 6)
        //a. “Home” link
        WebElement homeLink = driver.findElement(By.cssSelector("a[class='nav-link']"));
        WebElement homeLink2 = driver.findElement(By.cssSelector("a.nav-link"));
        WebElement homeLink3 = driver.findElement(By.cssSelector("a[href='/']"));
        WebElement homeLink4 = driver.findElement(By.cssSelector("a[href='/']"));

        //b. “Forgot password” header
        WebElement header = driver.findElement(By.cssSelector("div.example > h2"));

        //WebElement header2 = driver.findElement(By.xpath("//h2[text()='Forgot Password']"));
        WebElement header2 = driver.findElement(By.xpath("//h2[text()='Forgot Password']"));

        //c. “E-mail” text
        WebElement emailLabel = driver.findElement(By.xpath("//label[@for='email']"));

        //d. E-mail input box
        WebElement inputBox = driver.findElement(By.xpath("//input[@name='email']"));

        //e. “Retrieve password” button
        WebElement retrievePassword = driver.findElement(By.xpath("//button[@id='form_submit']"));

        //f. “Powered by Cydeo text
        WebElement powerByCydeo = driver.findElement(By.xpath("//div[@style='text-align: center;']"));

        //4. Verify all web elements are displayed.

        System.out.println("homeLink.isDisplayed() = " + homeLink.isDisplayed());
        System.out.println("header.isDisplayed() = " + header.isDisplayed());
        System.out.println("emailLabel.isDisplayed() = " + emailLabel.isDisplayed());
        System.out.println("inputBox.isDisplayed() = " + inputBox.isDisplayed());
        System.out.println("retrievePassword.isDisplayed() = " + retrievePassword.isDisplayed());
        System.out.println("powerByCydeo.isDisplayed() = " + powerByCydeo.isDisplayed());



        driver.quit();

        //First solve the task with using cssSelector only. Try to create 2 different
        //cssSelector if possible

        //Then solve the task using XPATH only. Try to create 2 different
        //XPATH locator if possible
        //
    }
}
