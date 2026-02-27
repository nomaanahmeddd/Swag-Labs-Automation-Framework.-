package com.automation.tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.automation.base.BaseTest;
import com.automation.pages.CartPage;
import com.automation.pages.CheckoutPage;
import com.automation.pages.LoginPage;
import com.automation.pages.ProductsPage;
import com.automation.utils.ScreenshotUtils;


public class EndToEndTest extends BaseTest{
	

    @Test
    public void completePurchaseFlow() throws Exception{
        test = extent.createTest("End to End Purchase Flow");

        LoginPage login = new LoginPage(driver);
        login.login("standard_user", "secret_sauce");

        ProductsPage product = new ProductsPage(driver);
        Thread.sleep(2000);
        product.addProductToCart();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        By cartIconBadge = By.xpath("//span[@class='shopping_cart_badge']");
        wait.until(ExpectedConditions.elementToBeClickable(cartIconBadge)).click();

        CartPage cart = new CartPage(driver);
        Assert.assertTrue(cart.isProductDisplayed("Sauce Labs Backpack"));
        cart.clickCheckout();

        CheckoutPage checkout = new CheckoutPage(driver);
        checkout.enterDetails("John", "Cena", "500001");
        checkout.clickFinish();

        Assert.assertTrue(checkout.isOrderSuccessful());
        String screenshotPath = ScreenshotUtils.captureScreenshot(driver, "Checkout_Success");
        test.addScreenCaptureFromPath(screenshotPath, "Checkout Completed Successfully");
    }}