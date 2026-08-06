package Tests;

import Base.BaseTest;
import Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    @Test
    public void verifylogin() {
        LoginPage login = new LoginPage(driver);
        login.login(
                config.getProperty("username"),
                config.getProperty("password")
        );

        Assert.assertTrue(driver.getCurrentUrl().contains("inventory"));

        System.out.println("Successfully Login");

    }

}
