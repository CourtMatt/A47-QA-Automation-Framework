import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.bouncycastle.cms.RecipientId.password;

public class LOGIN extends BASE {


    public LOGIN(WebDriver givenDriver) {
        super(givenDriver);
    }

    //Web Elements
    @FindBy(css ="input[type='email']" )
    private WebElement emailField;
    @FindBy(css = "input[type='password']")
    private WebElement passwordField;
    @FindBy (css = "button[type='submit']")
    private WebElement submitButton;

    public LOGIN provideEmail(String email){
        emailField.sendKeys(email);
        return this;
    }

    public LOGIN providePassword(String password) {
     passwordField.sendKeys(password);
     return this;
    }

    public LOGIN clickSubmit()
    {
        submitButton.click();
        return this;
    }

    public void login() {
        provideEmail("courtney.matthews@testpro.io");
        providePassword("Walkonby08!!");
        clickSubmit();
    }
}
