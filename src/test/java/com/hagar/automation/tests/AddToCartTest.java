package com.hagar.automation.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class AddToCartTest extends BaseTest {

    @Test
    public void addToCartAndModifyQuantity() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // 1) Go to home page & search for "hoodie"
        driver.get("https://magento.softwaretestingboard.com");
        WebElement search = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.name("q")));
        search.sendKeys("hoodie", Keys.ENTER);

        // 2) Click the first product (use JS-click to avoid the ad iframe)
        WebElement firstHoodie = wait.until(ExpectedConditions.presenceOfElementLocated(
                By.cssSelector("ol.products.list li.product-item a.product-item-photo")
        ));
        js.executeScript(
                "arguments[0].scrollIntoView({block:'center'}); arguments[0].click();",
                firstHoodie
        );

        // 3) Select the first available size
        List<WebElement> sizeSwatches = wait.until(
                ExpectedConditions.presenceOfAllElementsLocatedBy(
                        By.cssSelector(".swatch-option.text"))
        );
        js.executeScript("arguments[0].click();", sizeSwatches.get(0));

        // 4) Select the first available color
        List<WebElement> colorSwatches = driver.findElements(
                By.cssSelector(".swatch-option.color"));
        if (!colorSwatches.isEmpty()) {
            js.executeScript("arguments[0].click();", colorSwatches.get(0));
        }

        // 5) Click "Add to Cart"
        WebElement addToCartBtn = wait.until(ExpectedConditions.elementToBeClickable(
                By.cssSelector("button.tocart.primary")));
        js.executeScript("arguments[0].click();", addToCartBtn);

        // 6) Wait for the success toast
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.cssSelector(".message-success.success.message")));

    }
}
