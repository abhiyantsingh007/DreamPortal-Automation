package com.mydreams.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TotalPage extends BasePage {

    private By goodCount = By.id("good-count");
    private By badCount = By.id("bad-count");
    private By totalCount = By.id("total-count");
    private By recurringCount = By.id("recurring-count");

    public TotalPage(WebDriver driver) {
        super(driver);
    }

    public int getGoodCount() {
        return Integer.parseInt(driver.findElement(goodCount).getText());
    }

    public int getBadCount() {
        return Integer.parseInt(driver.findElement(badCount).getText());
    }

    public int getTotalCount() {
        return Integer.parseInt(driver.findElement(totalCount).getText());
    }

    public int getRecurringCount() {
        return Integer.parseInt(driver.findElement(recurringCount).getText());
    }
}
