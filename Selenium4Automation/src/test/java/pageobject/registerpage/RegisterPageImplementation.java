package pageobject.registerpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utils.RemoveAdvertisement;

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

    private void fillDropdownByVisibleText(WebElement element, String visibleText ){
        Select select = new Select(element);
        select.selectByVisibleText(visibleText);
    }

    public void fillsRegisterForm() throws InterruptedException {
        RemoveAdvertisement.closeBottomAdvertisement(this.driver);
        this.registerPage.getTitleMrs().click();
        this.registerPage.getPassword().sendKeys("12345678");
        this.fillDropdownByVisibleText(this.registerPage.getDateOfBirthDay(),"1");
        this.fillDropdownByVisibleText(this.registerPage.getDateOfBirthMonth(),"January");
        this.fillDropdownByVisibleText(this.registerPage.getDateOfBirthYear(),"2000");
        this.registerPage.getReceiveSpecialOffers().click();
        this.registerPage.getFirstName().sendKeys("Name");
        this.registerPage.getLastName().sendKeys("LastName");
        this.registerPage.getAddress().sendKeys("Address");
        this.registerPage.getAddress2().sendKeys("Address2");
        this.fillDropdownByVisibleText(this.registerPage.getCountry(),"New Zealand");
        this.registerPage.getState().sendKeys("state");
        this.registerPage.getCity().sendKeys("city");
        this.registerPage.getZipCode().sendKeys("00000");
        this.registerPage.getMobileNumber().sendKeys("1234567890");
    }

    public void clickOnCreateAccountButton(){
        this.registerPage.getCreateAccountButton().click();
    }
}
