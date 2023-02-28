package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;



    public HomePage(WebDriver driver)
    {
        this.driver = driver;
    }
    public LoginPage ClickformAuth() {
        //driver.findElement(formAuthLink).click();
        clickLink("Form Authentication");
        return new LoginPage(driver);
    }

    public DropDownPage ClickDropDown() {
        //driver.findElement(formAuthLink).click();
        clickLink("Dropdown");
        return new DropDownPage(driver);
    }

    private void clickLink(String linkText)
    {
        driver.findElement(By.linkText(linkText)).click();
    }

}
