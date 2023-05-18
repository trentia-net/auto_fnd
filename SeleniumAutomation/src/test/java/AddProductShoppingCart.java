import PageObject.*;
import com.codeborne.selenide.SelenideElement;
import org.junit.Test;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.List;

public class AddProductShoppingCart {

    @Test
    public void test() throws InterruptedException {

        List<String> productNames = new ArrayList<String>();

        //Given the user is on the home page
        HomePageImplementation homePageImplementation = new HomePageImplementation();
        homePageImplementation.goToHomePage();
        //And the user opens a product on the home page
        ProductCardImplementation card = homePageImplementation.getProductCard(1);
        String productName = card.getLinkNameText();
        productNames.add(productName);

        card.clickOnLinkName();
        //When the user adds the product to the cart
        ProductDetailPageImplementation productDetailPageImplementation = new ProductDetailPageImplementation();
        productDetailPageImplementation.validateTitle(productName);
        productDetailPageImplementation.clickOnAddToCartButton();
        productDetailPageImplementation.AcceptAlert();

        //Then the eCommerce has the product added on the shopping cart
        homePageImplementation.goToShoppingCart();
        ShoppingCartImplementation shoppingCartImplementation = new ShoppingCartImplementation();
        Thread.sleep(2000);
        shoppingCartImplementation.validateProductsAddedOnTheShoppingCart(productNames);

        Thread.sleep(5000);

    }

}
