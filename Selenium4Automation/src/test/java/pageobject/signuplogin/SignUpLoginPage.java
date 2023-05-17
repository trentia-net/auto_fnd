package pageobject.signuplogin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpLoginPage {

    @FindBy(css = "input[data-qa='login-email']")
    private WebElement loginEmail;

    @FindBy(name = "password")
    private WebElement password;

    @FindBy(css = "button[data-qa='login-button']")
    private WebElement loginButton;

    @FindBy(css = "div.login-form p")
    private WebElement message;

    @FindBy(css = "input[data-qa='signup-email']")
    private WebElement signUpEmail;

    @FindBy(css = "input[data-qa='signup-name']")
    private WebElement name;

    @FindBy(css = "button[data-qa='signup-button']")
    private WebElement signUpButton;

    public WebElement getLoginEmail() {
        return loginEmail;
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
    public WebElement getName() {
        return name;
    }
    public WebElement getSignUpEmail() {
        return signUpEmail;
    }

    public WebElement getSignUpButton(){
        return signUpButton;
    }
}
