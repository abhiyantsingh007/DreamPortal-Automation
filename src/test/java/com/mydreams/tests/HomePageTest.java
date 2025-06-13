package com.mydreams.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.Assert.assertTrue;

public class HomePageTest extends BaseTest {

    @Test
    public void testHomePageButtonVisible() {
        driver.get("https://arjitnigam.github.io/myDreams/");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("dreamButton")));

        // DEBUG: page snapshot
        System.out.println(driver.getPageSource());

        assertTrue(driver.findElement(By.id("dreamButton")).isDisplayed(), 
                   "Dream button should be visible on home page");
    }
}
