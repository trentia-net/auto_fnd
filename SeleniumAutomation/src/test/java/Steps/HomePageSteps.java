package Steps;

import PageObject.HomePageImplementation;
import PageObject.ProductCardImplementation;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

import java.util.ArrayList;
import java.util.List;

public class HomePageSteps {

    public static List<String> productNames = new ArrayList<String>();

    private HomePageImplementation homePageImplementation;

    public HomePageSteps(){
        this.homePageImplementation = new HomePageImplementation();
    }

    @Given("^the user is on the home page$")
    public void theUserIsOnTheHomePage() {
        this.homePageImplementation.goToHomePage();
    }

    @And("^the user opens a product on the home page$")
    public void theUserOpensAProductOnTheHomePage() {
        ProductCardImplementation card = homePageImplementation.getProductCard(1);
        String productName = card.getLinkNameText();
        HomePageSteps.productNames.add(productName);
        card.clickOnLinkName();
    }
}
