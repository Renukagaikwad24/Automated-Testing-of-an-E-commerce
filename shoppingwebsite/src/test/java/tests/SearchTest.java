package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.HomePage;
import pages.ProductPage;

public class SearchTest extends BaseTest {

    @Test
    public void testProductSearch() {
        HomePage homePage = new HomePage(driver);
        ProductPage productPage = homePage.searchForProduct("Laptop");
        Assert.assertTrue(productPage.isProductDisplayed(), "Product search was not successful");
    }
}
