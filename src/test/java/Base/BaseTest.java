package Base;

import Utils.ConfigReader;
import Utils.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseTest {

    protected WebDriver driver;
    protected ConfigReader config;

    @BeforeMethod
    public void setup () {
        config = new ConfigReader();
        driver = DriverFactory.getDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Integer.parseInt(config.getProperty("timeout"))));

        driver.get(config.getProperty("url"));

    }

    @AfterMethod
    public void teardown () {
        if(driver != null){
            driver.quit();
        }
    }
}
