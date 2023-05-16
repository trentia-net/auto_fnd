package pageobject.signuplogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpLoginPage {

    @FindBy(name = "email")
    private WebElement email;

    @FindBy(name = "password")
    private WebElement password;

    @FindBy(css="button[data-qa='login-button']")
    private WebElement loginButton;

    @FindBy(css="div.login-form p")
    private WebElement message;

    public WebElement getEmail() {
        return email;
    }
    public WebElement getPassword() {
        return password;
    }

    public WebElement getLoginButton(){
        return loginButton;
    }

    public WebElement getMessage(){
        return message;
    }
}
