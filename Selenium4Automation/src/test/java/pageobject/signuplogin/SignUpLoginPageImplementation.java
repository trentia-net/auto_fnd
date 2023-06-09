package pageobject.signuplogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SignUpLoginPageImplementation {

    private SignUpLoginPage signUpLoginPage;
    public WebDriver driver;
    public SignUpLoginPageImplementation(WebDriver driver){
        this.driver = driver;
        this.signUpLoginPage = PageFactory.initElements(driver,SignUpLoginPage.class);
    }

    public void fillLoginFields(String email,String password){
        this.signUpLoginPage.getEmail().sendKeys(email);
        this.signUpLoginPage.getPassword().sendKeys(password);
    }

    public void clickOnLoginButton(){
        this.signUpLoginPage.getLoginButton().click();
    }

    public String getTextMessage(){
        return this.signUpLoginPage.getMessage().getText();
    }

}
