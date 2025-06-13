package com.mydreams.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    private By loader = By.id("loader");
    private By mainContent = By.id("main-content");
    private By myDreamsBtn = By.id("my-dreams-btn");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public boolean isContentVisible() {
        return driver.findElement(mainContent).isDisplayed();
    }

    public void clickMyDreams() {
        driver.findElement(myDreamsBtn).click();
    }
}
