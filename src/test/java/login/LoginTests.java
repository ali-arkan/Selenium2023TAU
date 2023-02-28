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

          /*
           Page Design:
           MAIN
              1. HomePage: find and click the url, login page will be opened
              2. Login Page: set username, pw and click the login button, Secure page will be opened
              3. SecureAreaPage: Text message will be verified
           TEST
              1. BaseTests : Webdriver defining and base url is opened
              2. LoginTests: Click the url (homepage), set usrname,pw, click the button (Login Page) and Verify the text (SecureAreaPage)
            */


         //1. Click the Form Authentication url on the page
         LoginPage loginPage= homePage.ClickformAuth();

         // 2. Fill username, pw on the page, then click login button
         loginPage.setUsername("tomsmith");
         loginPage.setPassword("SuperSecretPassword!");
         SecureAreaPage securePages= loginPage.clickLoginButton();

         //3. Verify the test message on the opened page
         assertTrue(securePages.getAlertText()
                 .contains("You logged into a secure area!"),
                 "alert text is incorrect");

     }
}
