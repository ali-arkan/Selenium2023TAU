package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import pages.HomePage;

public class BaseTests {

    private WebDriver driver;
    protected HomePage homePage; // New Homepage is initializing...


    @BeforeClass
    public void SetUp() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");

        homePage = new HomePage(driver); // chrome driver is passing to HomePage
    }


    @AfterClass
    public void tearDown()
    {
        driver.quit();
    }



}

