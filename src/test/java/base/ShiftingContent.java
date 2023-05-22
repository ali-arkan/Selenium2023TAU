package base;

import java.util.List;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class ShiftingContent {

    private WebDriver driver;

    public void setUp() {

        String chrome_path = "resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chrome_path);

        //System.setProperty("webdriver.chrome.driver", getClass().getResource(chrome_path).getPath());
        //WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/");

        WebElement inputsLink = driver.findElement(By.linkText("Shifting Content"));
        inputsLink.click();

        WebElement inputsLink2 = driver.findElement(By.linkText("Example 1: Menu Element"));
        inputsLink2.click();

        List<WebElement> menuItems = driver.findElements(By.tagName("li"));
        System.out.println("Number of menu items: " + menuItems.size());

        driver.quit();

    }

    public static void main(String args[]) {
        ShiftingContent test = new ShiftingContent();
        test.setUp();
    }

}
