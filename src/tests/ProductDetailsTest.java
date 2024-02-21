package tests;

import org.junit.Test;

import pages.CartPage;
import pages.HomePage;
import pages.LoginPage;
import pages.ProductDetailsPage;
import pages.WhatsNewPage;

public class ProductDetailsTest extends BaseTests{
    


        @Test
        public void addingAnItemToCart(){

        HomePage homepage = new HomePage(driver);               
        LoginPage loginPage = new LoginPage(driver);
        WhatsNewPage whatsNewPage = new WhatsNewPage(driver);
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(driver);
        CartPage cartPage = new CartPage(driver);

        homepage.goToHomePage();
        homepage.navToSignIn();
        loginPage.login("aleksaceran123@gmail.com","Comtradeispit1");
        homepage.navToWhatsNewPage();
        homepage.waitElementToBeVisible(cartPage.getWhatsNewElements());
        whatsNewPage.countNumberOfElements(cartPage.getWhatsNewElements());
        whatsNewPage.clickOnRandomElementFromList(cartPage.getWhatsNewElements());                                         
        productDetailsPage.addToCartFromDetailPageFunction();
        productDetailsPage.clickOnRandomSizeOnProductDetailsPage(cartPage.getRandomSizeOfItem());
        productDetailsPage.clickOnRandomColorOnProductDetailsPage(cartPage.getRandomSizeOfItem());
        productDetailsPage.enterQuantityOnDetailsPage();
        productDetailsPage.addingAnItemToCart();


    }




}
