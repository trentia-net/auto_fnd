package pageobject.registerpage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage {

    //cssSelector > means the next element is a direct child
    @FindBy(css = "div.login-form > h2")
    private WebElement titleAccountInformation;

    @FindBy(id = "id_gender1")
    private WebElement titleMr;

    @FindBy(id = "id_gender2")
    private WebElement titleMrs;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(id = "days")
    private WebElement dateOfBirthDay;

    @FindBy(id = "months")
    private WebElement dateOfBirthMonth;

    @FindBy(id = "years")
    private WebElement dateOfBirthYear;

    @FindBy(id = "optin")
    private WebElement receiveSpecialOffers;

    @FindBy(id = "first_name")
    private WebElement firstName;

    @FindBy(id = "last_name")
    private WebElement lastName;

    @FindBy(id = "address1")
    private WebElement address;

    @FindBy(id = "address2")
    private WebElement address2;

    @FindBy(id = "country")
    private WebElement country;

    @FindBy(id = "state")
    private WebElement state;

    @FindBy(id = "city")
    private WebElement city;

    @FindBy(id = "zipcode")
    private WebElement zipCode;

    @FindBy(id = "mobile_number")
    private WebElement mobileNumber;

    @FindBy(css = "button[data-qa='create-account']")
    private WebElement createAccountButton;

    public WebElement getTitleMr() {
        return titleMr;
    }

    public WebElement getTitleMrs() {
        return titleMrs;
    }

    public WebElement getPassword() {
        return password;
    }

    public WebElement getDateOfBirthDay() {
        return dateOfBirthDay;
    }

    public WebElement getDateOfBirthMonth() {
        return dateOfBirthMonth;
    }

    public WebElement getDateOfBirthYear() {
        return dateOfBirthYear;
    }

    public WebElement getReceiveSpecialOffers() {
        return receiveSpecialOffers;
    }

    public WebElement getFirstName() {
        return firstName;
    }

    public WebElement getLastName() {
        return lastName;
    }

    public WebElement getAddress() {
        return address;
    }

    public WebElement getAddress2() {
        return address2;
    }

    public WebElement getCountry() {
        return country;
    }

    public WebElement getState() {
        return state;
    }

    public WebElement getCity() {
        return city;
    }

    public WebElement getZipCode() {
        return zipCode;
    }

    public WebElement getMobileNumber() {
        return mobileNumber;
    }

    public WebElement getCreateAccountButton() {
        return createAccountButton;
    }

    public WebElement getTitleAccountInformation() {
        return titleAccountInformation;
    }
}
