package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {
    private WebDriver driver;
    private By addToCartButton = By.id("addToCart");

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    public void addToCart() {
        driver.findElement(addToCartButton).click();
    }

    public boolean isProductDisplayed() {
        // Implement logic to verify product is displayed
        return true; // placeholder
    }

    public CartPage goToCart() {
        // Implement logic to navigate to the cart page
        return new CartPage(driver);
    }
}
