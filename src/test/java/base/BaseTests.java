package base;

import Pages.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTests {




    private WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void SetUp() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");

        //driver.findElement(By.linkText("Inputs"));
       // driver.findElement(By.cssSelector("a[href*=\"inputs\"]"));
        homePage = new HomePage(driver);

    }

    public static void main(String args[])
    {
        BaseTests test = new BaseTests();


    }
        /*
        Test 1: LoginTests
        Test 2: DropDownPage
         */

    @AfterClass
    public void tearDown()
    {
        driver.quit();
    }



}

