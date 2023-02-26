package login;

import Pages.LoginPage;
import Pages.SecureAreaPage;
import base.BaseTests;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

public class LoginTests extends BaseTests {
    @Test
     public void testSuccessfulLogin()
     {

         LoginPage loginPage= homePage.ClickformAuth();
         loginPage.setUsername("tomsmith");
         loginPage.setPassword("SuperSecretPassword!");
         SecureAreaPage securePages= loginPage.clickLoginButton();
         assertTrue(securePages.getAlertText()
                 .contains("You logged into a secure area!"),
                 "alert text is incorrect");

     }
}
