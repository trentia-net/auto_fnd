package pageobject.registerpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class RegisterPageImplementation {

    private WebDriver driver;
    private RegisterPage registerPage;

    public RegisterPageImplementation(WebDriver driver){
        this.driver = driver;
        this.registerPage = PageFactory.initElements(driver, RegisterPage.class);
    }

    public boolean titleAccountInformationIsDisplayed(){
        return this.registerPage.getTitleAccountInformation().isDisplayed();
    }
}
