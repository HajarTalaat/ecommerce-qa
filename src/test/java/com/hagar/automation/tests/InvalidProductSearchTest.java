package com.hagar.automation.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class InvalidProductSearchTest extends BaseTest {

    @Test
    public void testInvalidProductSearch() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // 1. Go to homepage
        driver.get("https://magento.softwaretestingboard.com");

        // 2. Search for an invalid/non-existent product
        WebElement searchBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));
        searchBox.sendKeys("asdlkjasd123", Keys.ENTER);

        // 3. Wait for the "no results" message
        WebElement noResultsMsg = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.cssSelector("div.message.notice")));

        // 4. Assert the message is displayed
        String messageText = noResultsMsg.getText();
        Assert.assertTrue(messageText.contains("Your search returned no results."),
                "Expected 'no results' message but got: " + messageText);
    }
}
