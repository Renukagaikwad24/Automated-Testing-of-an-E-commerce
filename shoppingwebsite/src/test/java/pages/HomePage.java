package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    private By searchBox = By.id("searchBox");
    private By searchButton = By.id("searchButton");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public ProductPage searchForProduct(String productName) {
        driver.findElement(searchBox).sendKeys(productName);
        driver.findElement(searchButton).click();
        return new ProductPage(driver);
    }
}
