package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateNewAccountPage extends BasePage{

    public CreateNewAccountPage(WebDriver driver){
        super(driver);
    }

        By firstName = By.xpath("//input[@id='firstname']");
        By lastName = By.xpath("//input[@id='lastname']");
        By emailAddress = By.xpath("//*[@id='email_address']");
        By password = By.xpath("//input[@id='password']");
        By confirmPassword = By.xpath("//input[@id='password-confirmation']");
        By createAnAccountButton = By.xpath("//button[@class='action submit primary']");            //clickOnThisElement

        String firstNameAccountCreation = "Aleksa";
        String lastNameAccountCreation = "Ceran";
        String emailAccountCreation = "aleksaceran123@gmail.com";
        String passwordAccountCreation = "Comtradeispit1";
        String passwordConfirmAccountCreation = "Comtradeispit1";                   // DA LI ZAKUCAVAMO VREDNOST ?


        public CreateNewAccountPage createAccount(){
            enterText(firstName, firstNameAccountCreation);
            enterText(lastName, lastNameAccountCreation);
            enterText(emailAddress, emailAccountCreation);
            enterText(password, passwordAccountCreation);
            enterText(confirmPassword, passwordConfirmAccountCreation);
            


            return this;
        }
}
