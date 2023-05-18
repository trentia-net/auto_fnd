package PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.open;

public class HomePageImplementation {

    private HomePage homePage;

    public HomePageImplementation(){
        this.homePage = new HomePage();
    }

    public void goToHomePage(){
        open("https://www.demoblaze.com/");
    }

    public void goToShoppingCart(){
        this.homePage.getCartLink().click();
    }

    public ProductCardImplementation getProductCard(int index){
        return new ProductCardImplementation(this.homePage.getCards().get(index));
    }

}
