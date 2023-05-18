package Steps;

import PageObject.HomePageImplementation;
import io.cucumber.java.en.Given;

public class HomePageSteps {

    private HomePageImplementation homePageImplementation;

    public HomePageSteps(){
        this.homePageImplementation = new HomePageImplementation();
    }

    @Given("the user is on the home page")
    public void theUserIsOnTheHomePage() {
        this.homePageImplementation.goToHomePage();
    }
}
