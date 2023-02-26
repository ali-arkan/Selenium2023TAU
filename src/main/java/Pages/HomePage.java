package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;

    private By formAuthLink = By.linkText("Form Authentication");
    public HomePage(WebDriver driver)
    {
        this.driver = driver;
    }
    public LoginPage ClickformAuth() {
        driver.findElement(formAuthLink).click();
        return new LoginPage(driver);

    }


}
