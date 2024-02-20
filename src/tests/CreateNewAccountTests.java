package tests;

import org.junit.Test;

import pages.CreateNewAccountPage;
import pages.HomePage;

public class CreateNewAccountTests extends BaseTests{
    
    @Test
    public void  createNewAccountTest(){                                        //   STAVKA 3 SA PROJEKTA
        HomePage homepage = new HomePage(driver);
        CreateNewAccountPage createNewAccountPage = new CreateNewAccountPage(driver);
        homepage.goToHomePage();
        homepage.navToCreateAccountPage();
        createNewAccountPage.createAccount();
    }

    




    
}
