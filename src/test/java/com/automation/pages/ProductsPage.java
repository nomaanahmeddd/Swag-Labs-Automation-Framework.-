package com.automation.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductsPage {

    WebDriver driver;
    WebDriverWait wait;


    public ProductsPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    By addToCartBtn = By.xpath("//button[@name='add-to-cart-sauce-labs-backpack']");
    By cartIcon = By.xpath("//a[@class='shopping_cart_link']");
    By filterDropdown = By.className("product_sort_container");

    public void addProductToCart() throws Exception{
    	Thread.sleep(2000);
    	driver.findElement(addToCartBtn).click();
    }

    public void clickCart() {
        wait.until(ExpectedConditions.elementToBeClickable(cartIcon)).click();
    }

}