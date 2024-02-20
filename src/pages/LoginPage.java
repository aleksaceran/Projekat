package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{
    
    public LoginPage(WebDriver driver){
        super(driver);
    }

    By passwordInput = By.xpath("//input[@id='pass']");
    By emailInput = By.xpath("//input[@id='email']");
    By signInButtonLoginPage = By.cssSelector("button.login > span:nth-child(1)");

    String firstNameAccountCreation = "Aleksa";
    String lastNameAccountCreation = "Ceran";
    String emailAccountCreation = "aleksaceran123@gmail.com";
    String passwordAccountCreation = "Comtradeispit1";
    String passwordConfirmAccountCreation = "Comtradeispit1";                                                      // da li zakucam vrednost istu ili ima neki drugi nacin   ????
    String errorMessageLoginFailed = "The account sign-in was incorrect or your account is disabled temporarily. Please wait and try again later.";
    By incorrectSignInCredentials = By.xpath("//div[@class='message-error error message']");

    By errorRequiredFieldEmail = By.xpath("//*[@id='email-error']");
    By errorRequiredFieldPassword = By.xpath("//*[@id='pass-error']");
    String errorRequiredFieldMessage = "This is a required field.";

    By expectedPageTitleBy = By.xpath("//span[@class='logged-in']");                                  

    public LoginPage login(String email, String password){
        enterText(emailInput, email);
        enterText(passwordInput, password);
        clickElement(signInButtonLoginPage);


        return this;
    }
    public LoginPage verifyUnsuccessfulLogin(String expectedError){
        String actualErrorMessage = readText(incorrectSignInCredentials);
        verifyTextIsTheSame(expectedError, actualErrorMessage);
        return this;
    }

    public LoginPage verifyEmptyRequiredEmailField(String expectedError){
        String actualErrorMessage = readText(errorRequiredFieldEmail);
        verifyTextIsTheSame(expectedError, actualErrorMessage);
        return this;
    }
    public LoginPage verifyEmptyRequiredPasswordField(String expectedError){
        String actualErrorMessage = readText(errorRequiredFieldPassword);
        verifyTextIsTheSame(expectedError, actualErrorMessage);
        return this;
}
    public LoginPage verifyloginWithMissingEmail(){
        verifyElementIsVisible(errorRequiredFieldEmail);
        return this;
    }
    public LoginPage verifyloginWithMissingPass(){
        verifyElementIsVisible(errorRequiredFieldPassword);
        return this;
    }


}