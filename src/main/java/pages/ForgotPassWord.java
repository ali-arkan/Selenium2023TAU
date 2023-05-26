package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.security.PublicKey;

public class ForgotPassWord {

    private WebDriver driver;

    private By emailField = By.id("email");
    private By clickRetrieveButton = By.id("form_submit");

    public ForgotPassWord(WebDriver driver)
    {
        this.driver = driver;
    }

    public void setEmail(String email)
    {
        driver.findElement(emailField).sendKeys(email);
    }

    public InternalErrorPage clickRetrieveButton()
    {
        driver.findElement(clickRetrieveButton).click();
        return new InternalErrorPage(driver);
    }



}
