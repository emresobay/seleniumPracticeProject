package com.cydeo.tests.practicePackage;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PracticeClass {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://www.google.com");

        WebElement luckyText = driver.findElement(By.className("RNmpXc"));

        String text = luckyText.getAttribute("value");

        if (text.equals("Kendimi Şanslı Hissediyorum")){
            System.out.println("Test PASSED! ");
        }else {
            System.out.println("Test FAILED! ");
        }



        driver.quit();
    }
}
