package com.mydreams.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.testng.Assert.assertEquals;

public class TotalPageTest extends BaseTest {

    @Test
    public void testDreamCounts() {
        driver.get("https://arjitnigam.github.io/myDreams/dreams-total.html");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("dreamsTotal")));

        // Debug printout of the page HTML (optional)
        System.out.println(driver.getPageSource());

        WebElement table = driver.findElement(By.id("dreamsTotal"));
        List<WebElement> rows = table.findElements(By.cssSelector("tbody tr"));

        // Expected counts by label
        Map<String, Integer> expectedCounts = new HashMap<>();
        expectedCounts.put("Good Dreams", 6);
        expectedCounts.put("Bad Dreams", 4);
        expectedCounts.put("Total Dreams", 10);
        expectedCounts.put("Dreams This Week", 7);
        expectedCounts.put("Recurring Dreams", 2);

        for (WebElement row : rows) {
            List<WebElement> cells = row.findElements(By.tagName("td"));
            String type = cells.get(0).getText().trim();
            int count = Integer.parseInt(cells.get(1).getText().trim());

            System.out.println("Verifying: " + type + " = " + count);
            assertEquals(count, expectedCounts.get(type).intValue(), 
                         type + " count mismatch");
        }
    }
}
