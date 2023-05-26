package login;

import base.BaseTests;
import pages.LoginPage;
import pages.SecureAreaPage;

import static org.testng.Assert.*;
import org.testng.annotations.*;

public class LoginTests extends BaseTests {

    @Test
    public void testSuccessfullLogin()
    {
        LoginPage loginPage =  homePage.clickFormAuth(); // click link, have to login page

        loginPage.setUsername("tomsmith"); // set username
      loginPage.setPassword("SuperSecretPassword!"); // set pw

        SecureAreaPage secureAreaPage =  loginPage.clickLoginButton();//click button, have secure area page
      assertTrue(secureAreaPage.getAlertText()
                      .contains("You logged into a secure area!"),
              "Alert text is incorrect"); //get alerttext, add verify with TestNG to ide and pom.xml for assertions
    }

}
