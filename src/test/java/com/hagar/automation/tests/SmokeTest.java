package com.hagar.automation.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SmokeTest extends BaseTest {

    @Test
    public void homePageTitleTest() {
        // Navigate to the site under test
        driver.get("https://automationexercise.com");

        // Get the page title
        String title = driver.getTitle();

        // Assert it contains expected text
        Assert.assertTrue(
                title.contains("Automation Exercise"),
                "Expected title to contain 'Automation Exercise' but got: " + title
        );
    }
}
