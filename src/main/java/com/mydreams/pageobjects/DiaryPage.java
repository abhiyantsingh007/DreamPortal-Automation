package com.mydreams.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DiaryPage extends BasePage {

    private By tableRows = By.cssSelector("#diary-table tbody tr");

    public DiaryPage(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> getDreamRows() {
        return driver.findElements(tableRows);
    }

    public int getDreamCount() {
        return getDreamRows().size();
    }
}
