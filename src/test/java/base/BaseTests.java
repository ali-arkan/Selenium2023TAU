package base;

import Pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTests {

    /*
           Login Test Steps:
           1. Click the Form Authentication url on the page
           2. Fill username, pw on the page, then click login button
           3. Verify the warning message on the opened page

           Page Design:
           MAIN
              1. HomePage: find and click the url, login page will be opened
              2. Login Page: set username, pw and click the login button, Secure page will be opened
              3. SecureAreaPage: Text message will be verified
           TEST
              1. BaseTests : Webdriver defining and base url is opened
              2. LoginTests: Click the url (homepage), set usrname,pw, click the button (Login Page) and Verify the text (SecureAreaPage)


            DrowDown Test
              1. Click the Dropdown page (click link on HomePage)
              2. Select an option from dropdown and make sure we have selected
            */





    private WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void SetUp() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");

        homePage = new HomePage(driver);

    }



    @AfterClass
    public void tearDown()
    {
        driver.quit();
    }



}

