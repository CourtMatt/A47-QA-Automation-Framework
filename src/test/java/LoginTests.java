import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


public class LoginTests extends BaseTest {

    @Test (enabled = true, priority = 0, description = "Login with invalid email and valid password")
    public void loginInvalidEmailValidPasswordTest(){
        LOGIN LOGIN = new LOGIN(driver);
        HOME HOME = new HOME(driver);

       LOGIN.provideEmail("invalid@class.com"). providePassword("te$t$tudent").clickSubmit();

        Assert.assertEquals(driver.getCurrentUrl(), url); // https://qa.koel.app/
    }

    @Test (enabled = true, priority = 1, description = "Login with valid email and valid password")
    public void loginValidEmailPasswordTest(){
        LOGIN LOGIN = new LOGIN(driver);
        HOME HOME = new HOME(driver);

        LOGIN.provideEmail("demo@class.com"). providePassword("te$t$tudent").clickSubmit();

        isAvatarDisplayed();
    }

    @Test (enabled = true, priority = 3, description = "Login with valid email and empty password")
    public static void loginValidEmailEmptyPasswordTest() {

        LOGIN LOGIN = new LOGIN(driver);
        HOME HOME = new HOME(driver);

        LOGIN.provideEmail("demo@class.com").providePassword("").clickSubmit();

        Assert.assertEquals(driver.getCurrentUrl(), url); // https://qa.koel.app/
    }



    public static void isAvatarDisplayed() {
        WebElement avatarIcon = driver.findElement(By.cssSelector("img[class='avatar']"));
        Assert.assertTrue(avatarIcon.isDisplayed());
    }
}