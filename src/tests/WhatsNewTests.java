package tests;

import org.junit.Test;

import pages.CartPage;
import pages.HomePage;
import pages.LoginPage;
import pages.WhatsNewPage;

public class WhatsNewTests extends BaseTests{
    


    @Test
    public void navToProductDetailsPage(){

        HomePage homepage = new HomePage(driver);               
        LoginPage loginPage = new LoginPage(driver);
        WhatsNewPage whatsNewPage = new WhatsNewPage(driver);
        CartPage cartPage = new CartPage(driver);

        homepage.goToHomePage();                                                    // RADIII!
        homepage.navToSignIn();
        loginPage.login("aleksaceran123@gmail.com","Comtradeispit1");
        homepage.navToWhatsNewPage();
        homepage.waitElementToBeVisible(cartPage.getWhatsNewElements());
        whatsNewPage.clickOnRandomElementFromList(cartPage.getWhatsNewElements());
    }



}
