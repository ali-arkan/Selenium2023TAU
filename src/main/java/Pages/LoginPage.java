package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private WebDriver driver;

    //1. kullanım
    //WebElement usernamefield = driver.findElement(By.id("username"));
    private By usernamefield = By.id("username");
    //2.kullanım
    private By passwordfield = By.id("password");
    private By LoginButton = By.cssSelector("#login button");

    public LoginPage(WebDriver driver)
    {
        this.driver= driver;
    }

    public void setUsername(String username)
    {
        driver.findElement(usernamefield).sendKeys(username);

    }

    public  void setPassword(String password)
    {
        driver.findElement(passwordfield).sendKeys(password);
    }

    public SecureAreaPage clickLoginButton ()
    {
        driver.findElement(LoginButton).click();
        return new SecureAreaPage (driver);
    }

}
