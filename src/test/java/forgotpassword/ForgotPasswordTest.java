package forgotpassword;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ForgotPassWord;
import pages.HomePage;
import pages.InternalErrorPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


public class ForgotPasswordTest extends BaseTests {

    @Test
    public void testForgotPassword()
    {
       ForgotPassWord forgotPassWord = homePage.clickForgotPassword(); // click link in homepage, return forgotpassword page

       forgotPassWord.setEmail("ali@test.com"); // input email address
       InternalErrorPage internalErrorPage =  forgotPassWord.clickRetrieveButton(); // click button in page, return InternalErrorPage

        //assertTrue(internalErrorPage.VerifyTitle().contains("Internal Server Error"),"Message is incorrect");
        assertEquals(internalErrorPage.VerifyTitle(),"Internal Server Error","Message is incorrect"); // verify the mesaage

    }

    /*
    Test Steps
-------------------------------
1- Visit Homepage, Click Forgot password -- HomePage.java
		methods
			clickForgotPassword()
				click the link
				return ForgotPassWord
2- input email adress, click Retrive Password -- ForgotPassWord.java
		fields:
			Driver
			emailField
			clickRetrieveButton
		constructor:
			Driver
		metods:
			setEmail()
				email alanınına yolladıgımız parametreyi girecek
			clickRetrieve()
				buton yakalanıp, clicklenecek
				return InternalErrorPage olacak
3- acılan InternalErrorPage sayfasında text yakalacak ve String olarak geri dondurulecek -- InternalErrorPage.java
		Fields
			ekranı yazı
			webdriver
		constructor
			Webdriver
		MEtods:
			VerifyTitle(String title)
				Ekrandaki yazı yalanacak
				geri String dondurulecek
4- aldıgımız mesajı verify edeceğiz -- ForgotPasswordTest.java
		extents from BaseTests
		@Test
     */
}
