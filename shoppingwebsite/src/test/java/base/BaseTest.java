package base;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    protected WebDriver driver;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Admin/Documents/workspace-spring-tool-suite-4-4.21.0.RELEASE/shoppingwebsite/src/test/resources/drivers/chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--remote-debugging-port=0");

        driver = new ChromeDriver(options);

        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        driver.get("https://bstackdemo.com/");
    }

    @AfterMethod
    public void tearDown() {
        // Quit the browser session after each test
        if (driver != null) {
            driver.quit();
        }
    }
}
