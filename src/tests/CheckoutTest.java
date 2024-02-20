package tests;

import org.junit.Test;

import pages.CheckoutPage;
import pages.HomePage;
import pages.LoginPage;

public class CheckoutTest extends BaseTests{

    @Test
    public void verifyCheckoutPage(){                                           //   NECE RADITI UKOLIKO JE VEC KREIRAN JEDAN ORDER JER CE SLEDECI PUTPOVUCI TE PODATKE KAO SACUVANE
        HomePage homepage = new HomePage(driver);                               //   ZA PRVI PUT KOD CE RADITI I CENA CE BITI VERIFIKOVANA
        LoginPage loginPage = new LoginPage(driver);                            //   NAKON BRISANJA COOKIES I DALJE OSTAJU ZABELEZENI PODACI NA SAJTU
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        

        homepage.goToHomePage();
        homepage.navToSignIn();
        loginPage.login("aleksaceran123@gmail.com","Comtradeispit1");
        checkoutPage.verifyCheckoutPage();
        checkoutPage.verifyNavCheckoutPage();

        checkoutPage.sortValueCountry("Serbia");
        checkoutPage.informationInput("Comtrade","Palisadska 1","Beograd", "11000", "0694440604");
        checkoutPage.navToReviewAndPayments();
        checkoutPage.verifyPriceAndTax();
        }

        @Test
        public void proceedToCheckoutWithFilledInfo(){                                          // TEST ZA VERIFIKACIJU CENE U SLUCAJU DA NIJE POTREBNO POPUNITI INFO ZA ORDER
        HomePage homepage = new HomePage(driver);                                               // ZAOBILAZI INPUT INFORMACIJA(CITY,ZIPCODE,COUNTRY...)
        LoginPage loginPage = new LoginPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);                                   //RADI!

        
        homepage.goToHomePage();
        homepage.navToSignIn();
        loginPage.login("aleksaceran123@gmail.com","Comtradeispit1");
        checkoutPage.verifyCheckoutPage();    
         
        checkoutPage.navToReviewAndPayments();
        checkoutPage.verifyPriceAndTax();
            

        }
        @Test
        public void checkoutPageWithFillingInputs(){            //          STAVKA 6
            HomePage homepage = new HomePage(driver);                               
            LoginPage loginPage = new LoginPage(driver);                            
            CheckoutPage checkoutPage = new CheckoutPage(driver);
            
    
            homepage.goToHomePage();
            homepage.navToSignIn();
            loginPage.login("aleksaceran123@gmail.com","Comtradeispit1");
            checkoutPage.verifyCheckoutPage();
            checkoutPage.verifyNavCheckoutPage();
            checkoutPage.addNewAddress();
            checkoutPage.informationInput("Comtrade","Palisadska 1","Beograd", "11000", "0694440604");
            checkoutPage.popUpCountrySortValueDropdown("Serbia");

            //  SREDITI country add
            
            checkoutPage.dontSaveAddress();
            checkoutPage.navToReviewAndPayments();
            checkoutPage.verifyPriceAndTax();





        }

    }


