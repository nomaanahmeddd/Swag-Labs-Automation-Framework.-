package com.automation.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.automation.base.BaseTest;
import com.automation.pages.LoginPage;
import com.automation.utils.ExcelUtils;

public class LoginTest extends BaseTest {

    @DataProvider(name = "loginData")
    public Object[][] getLoginData() {
        return ExcelUtils.getTestData("Sheet1");
    }

    @Test(dataProvider = "loginData")
    public void loginTest(String username, String password) throws Exception {

        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername(username);
        Thread.sleep(2000);
        loginPage.enterPassword(password);
        Thread.sleep(2000);
        loginPage.clickLogin();
        Thread.sleep(2000);
        Assert.assertTrue(driver.getTitle().contains("Swag Labs"));
        
    }
}
