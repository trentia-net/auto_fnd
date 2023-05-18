package Steps;

import PageObject.ProductDetailPageImplementation;
import io.cucumber.java.en.When;

public class ProductDetailPageSteps {
    @When("^the user adds the product to the cart$")
    public void theUserAddsTheProductToTheCart() {

        ProductDetailPageImplementation productDetailPageImplementation = new ProductDetailPageImplementation();
        productDetailPageImplementation.validateTitle(HomePageSteps.productNames.get(0));
        productDetailPageImplementation.clickOnAddToCartButton();
        productDetailPageImplementation.AcceptAlert();

    }
}
