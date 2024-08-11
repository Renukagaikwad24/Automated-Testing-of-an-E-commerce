package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    private WebDriver driver;
    private By checkoutButton = By.id("checkoutButton");

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isProductInCart(String productName) {
        // Implement logic to verify product is in the cart
        return true; // placeholder
    }

    public CheckoutPage proceedToCheckout() {
        driver.findElement(checkoutButton).click();
        return new CheckoutPage(driver);
    }
}
