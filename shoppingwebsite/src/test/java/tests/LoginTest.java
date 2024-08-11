package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void testValidLogin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("correctUsername", "correctPassword");
        Assert.assertTrue(loginPage.isLoginSuccessful(), "Login was not successful");
    }

    @Test
    public void testInvalidLogin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("wrongUsername", "wrongPassword");
        Assert.assertFalse(loginPage.isLoginSuccessful(), "Login should not be successful with invalid credentials");
    }
}
