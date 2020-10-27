package com.weborders.oh;

import com.weborders.utils.Driver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class October27WaitsPractice {

    @Test
    public void test(){
        WebDriver driver = Driver.getDriver();
        driver.get("http://practice.cybertekschool.com/dynamic_loading/3");
        //click on submit button without waiting
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement checkbox = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector("input[type='checkbox']"))));
        checkbox.click();
        driver.quit();
    }

}
