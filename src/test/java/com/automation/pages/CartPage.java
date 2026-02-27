package com.automation.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartPage {

    WebDriver driver;
    WebDriverWait wait;

    public CartPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    }

    By productName = By.className("inventory_item_name");
    By checkoutBtn = By.id("checkout");

    public boolean isProductDisplayed(String expectedProduct) {
        return driver.findElement(productName).getText().equals(expectedProduct);
    }

    public void clickCheckout() {
        WebElement checkout = wait.until(ExpectedConditions.visibilityOfElementLocated(checkoutBtn));
        wait.until(ExpectedConditions.elementToBeClickable(checkout)).click();
    }
}