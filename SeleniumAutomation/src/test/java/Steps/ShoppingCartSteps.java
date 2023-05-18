package Steps;

import PageObject.HomePageImplementation;
import PageObject.ShoppingCartImplementation;
import io.cucumber.java.en.Then;

public class ShoppingCartSteps {

    private HomePageImplementation homePageImplementation;
    private ShoppingCartImplementation shoppingCartImplementation;
    public ShoppingCartSteps(){
        this.homePageImplementation = new HomePageImplementation();
        this.shoppingCartImplementation = new ShoppingCartImplementation();
    }
    @Then("^the eCommerce has the product added on the shopping cart$")
    public void theECommerceHasTheProductAddedOnTheShoppingCart() {
        this.homePageImplementation.goToShoppingCart();
        this.shoppingCartImplementation.waitForProductList();
        this.shoppingCartImplementation.validateProductsAddedOnTheShoppingCart(HomePageSteps.productNames);
    }
}
