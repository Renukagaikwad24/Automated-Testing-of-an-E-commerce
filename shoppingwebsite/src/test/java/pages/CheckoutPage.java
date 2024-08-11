package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {
    private WebDriver driver;
    private By nameField = By.id("name");
    private By addressField = By.id("address");
    private By cityField = By.id("city");
    private By zipCodeField = By.id("zipCode");
    private By paymentMethod = By.id("paymentMethod");
    private By placeOrderButton = By.id("placeOrder");

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterShippingDetails(String name, String address, String city, String zipCode) {
        driver.findElement(nameField).sendKeys(name);
        driver.findElement(addressField).sendKeys(address);
        driver.findElement(cityField).sendKeys(city);
        driver.findElement(zipCodeField).sendKeys(zipCode);
    }

    public void selectPaymentMethod(String method) {
        driver.findElement(paymentMethod).sendKeys(method);
    }

    public void placeOrder() {
        driver.findElement(placeOrderButton).click();
    }

    public boolean isOrderSuccessful() {
        // Implement logic to verify the order was successful
        return true; // placeholder
    }

}
