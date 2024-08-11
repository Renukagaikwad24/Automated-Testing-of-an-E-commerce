package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.HomePage;
import pages.ProductPage;

public class CartTest extends BaseTest {

    @Test
    public void testAddToCart() {
        HomePage homePage = new HomePage(driver);
        ProductPage productPage = homePage.searchForProduct("Laptop");
        productPage.addToCart();
        CartPage cartPage = productPage.goToCart();
        Assert.assertTrue(cartPage.isProductInCart("Laptop"), "Product was not added to the cart");
    }
}
