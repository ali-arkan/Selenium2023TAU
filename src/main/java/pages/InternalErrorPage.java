package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InternalErrorPage {

    private WebDriver driver;
    private By getTitle= By.tagName("h1");




    public InternalErrorPage(WebDriver driver)
    {
        this.driver = driver;
    }


    public String VerifyTitle()
    {
        return driver.findElement(getTitle).getText();
    }

}
