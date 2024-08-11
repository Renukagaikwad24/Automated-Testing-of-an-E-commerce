package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.CheckoutPage;
import pages.HomePage;
import pages.ProductPage;

public class CheckoutTest extends BaseTest {

    @Test
    public void testCheckoutProcess() {
        HomePage homePage = new HomePage(driver);
        ProductPage productPage = homePage.searchForProduct("Laptop");
        productPage.addToCart();
        CartPage cartPage = productPage.goToCart();
        CheckoutPage checkoutPage = cartPage.proceedToCheckout();
        checkoutPage.enterShippingDetails("John Doe", "123 Main St", "New York", "10001");
        checkoutPage.selectPaymentMethod("Credit Card");
        checkoutPage.placeOrder();
        Assert.assertTrue(checkoutPage.isOrderSuccessful(), "Order was not successfully placed");
    }
}
