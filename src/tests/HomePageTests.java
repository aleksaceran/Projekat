package tests;

import org.junit.Test;

import pages.HomePage;
import pages.LoginPage;

public class HomePageTests extends BaseTests{
    
    String validEmail = "aleksaceran123@gmail.com";
    String validPassword = "Comtradeispit1";

        

    @Test
    public void navToWhatsNewPage(){
        HomePage homepage = new HomePage(driver);
        homepage.goToHomePage();                           
        homepage.navToWhatsNewPage();              

    }

    @Test                                                   //SREDITI
    public void logoutFromHomePage(){
        HomePage homepage = new HomePage(driver);                       //  STAVKA 4
        LoginPage loginPage = new LoginPage(driver);                    //  RADI!            

        homepage.goToHomePage();
        homepage.navToSignIn();
        loginPage.login(validEmail,validPassword);
        homepage.waitElementToBeVisible(homepage.getWelcomeMessageDropdownMenu());

        homepage.logout();

    }

    @Test                   
    public void hotSellersCount(){                                      //STAVKA BROJ 2 SA ZADATKA
        HomePage homepage = new HomePage(driver);
        homepage.goToHomePage();
        homepage.countProducts();
    }
    
}
