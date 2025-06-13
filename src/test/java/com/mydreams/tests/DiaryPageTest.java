package com.mydreams.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

import static org.testng.Assert.assertTrue;

public class DiaryPageTest extends BaseTest {

    @Test
    public void testDiaryPageEntryCount() {
        driver.get("https://arjitnigam.github.io/myDreams/dreams-diary.html");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("dreamsDiary")));

        // DEBUG: page snapshot
        System.out.println(driver.getPageSource());

        WebElement diarySection = driver.findElement(By.id("dreamsDiary"));
        List<WebElement> rows = diarySection.findElements(By.tagName("tr"));
        assertTrue(rows.size() > 0, "Diary should contain at least one dream entry");
    }
}
