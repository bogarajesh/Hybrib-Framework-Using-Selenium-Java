package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    By Username = By.id("user-name");
    By Password = By.id("password");
    By LoginBtn = By.id("login-button");

    public void enterusername(String user){
        driver.findElement(Username).sendKeys(user);
    }

    public void enterpassword(String pass){
        driver.findElement(Password).sendKeys(pass);
    }

    public void clickloginbtn(){
        driver.findElement(LoginBtn).click();
    }

    public void login(String user, String pass){
        enterusername(user);
        enterpassword(pass);
        clickloginbtn();
    }
}
