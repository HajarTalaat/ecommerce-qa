package com.hagar.automation.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class ProductSearchTest extends BaseTest {

    @Test
    public void validProductSearchReturnsResults() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // 1. Go to home page
        driver.get("https://magento.softwaretestingboard.com");

        // 2. Search for "hoodie"
        WebElement searchBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));
        searchBox.sendKeys("hoodie");
        searchBox.submit();

        // 3. Wait for results to load
        List<WebElement> results = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(
                By.cssSelector("ol.products.list.items.product-items li")));

        // 4. Validate that results are not empty
        Assert.assertTrue(results.size() > 0, "Expected search results for 'hoodie', but found none.");

        // 5. Optionally: Validate some results contain "hoodie"
        boolean hoodieFound = results.stream()
                .map(el -> el.getText().toLowerCase())
                .anyMatch(text -> text.contains("hoodie"));

        Assert.assertTrue(hoodieFound, "Search results do not contain the keyword 'hoodie'.");
    }
}
