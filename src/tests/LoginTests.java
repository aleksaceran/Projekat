package tests;

import org.junit.Test;

import pages.HomePage;
import pages.LoginPage;

public class LoginTests extends BaseTests{
    
    String validEmail = "aleksaceran123@gmail.com";
    String validPassword = "Comtradeispit1";
    //By welcomeNameOnHomePage = By.xpath("//span[@class='logged-in']");                                      // KORISTICEMO ZA VERIFIKACIJU LOGOVANJA

    
    String errorMessageLoginFailed = "The account sign-in was incorrect or your account is disabled temporarily. Please wait and try again later.";

    String errorRequiredFieldMessage = "This is a required field.";

    @Test
    public void loginWithValidCredentials(){
        HomePage homepage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);                                

        homepage.goToHomePage();
        homepage.navToSignIn();
        loginPage.login(validEmail,validPassword);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        homepage.verifySuccessfulLogin();  
    }          

    @Test
    public void loginWithInvalidPassword(){
        HomePage homepage = new HomePage(driver);               
        LoginPage loginPage = new LoginPage(driver);                                

        homepage.goToHomePage();                                                    // RADIII!
        homepage.navToSignIn();
        loginPage.login("aleksaceran123@gmail.com","123");
        loginPage.verifyUnsuccessfulLogin(errorMessageLoginFailed);

}
@Test
    public void loginWithInvalidEmail(){
        HomePage homepage = new HomePage(driver);               
        LoginPage loginPage = new LoginPage(driver);                                

        homepage.goToHomePage();                                                    // RADIII!
        homepage.navToSignIn();
        loginPage.login("aleksaceran12@gmail.com","Comtradeispit1");
        loginPage.verifyUnsuccessfulLogin(errorMessageLoginFailed);


    }

@Test
public void loginWithNoCredentials(){
    HomePage homepage = new HomePage(driver);               
    LoginPage loginPage = new LoginPage(driver);                                

    homepage.goToHomePage();
    homepage.navToSignIn();
    loginPage.login("","");
    loginPage.verifyEmptyRequiredEmailField(errorRequiredFieldMessage);
    loginPage.verifyEmptyRequiredPasswordField(errorRequiredFieldMessage);
    
}





    @Test                                               //  RADI!
    public void loginWithMissingEmail(){
        HomePage homepage = new HomePage(driver);               
        LoginPage loginPage = new LoginPage(driver);                                

        homepage.goToHomePage();
        homepage.navToSignIn();
        loginPage.login("", validPassword);
        loginPage.verifyloginWithMissingEmail();

    }
    @Test                                               //  RADI!
    public void loginWithMissingPassword(){
        HomePage homepage = new HomePage(driver);               
        LoginPage loginPage = new LoginPage(driver);                                

        homepage.goToHomePage();
        homepage.navToSignIn();
        loginPage.login("aleksaceran123@gmail.com", "");
        loginPage.verifyloginWithMissingPass();


    }
    


}