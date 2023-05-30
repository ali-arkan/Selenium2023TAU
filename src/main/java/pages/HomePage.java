package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {


    private WebDriver driver; // create new driver
   // private By formAuthLink = By.linkText();// Linktexti "Form Authentication" olan linki yakalayıp BY altına store ettik

    public HomePage(WebDriver driver)
    {
      this.driver = driver;
    }
    public LoginPage clickFormAuth() // Click butonuna tıklandıgında yeni bir sayfa açarız
    {
       // driver.findElement(formAuthLink).click();
        clickLink("Form Authentication");// elementi yakaladık ve tıkladık
        return new LoginPage(driver); // Click yapıldıgında yeni bir sayfa acılacak, bu sayfayı geri dondurecez,bu metod driver parametresi alacak cunku butun sayfalar driver ihtiyac duyar
    }

    private void clickLink(String linkText)
    {
        driver.findElement(By.linkText(linkText)).click();
    }

    public DropDownPage clickDropDown()
    {
        clickLink("Dropdown");
        return new DropDownPage(driver);
    }

    public ForgotPassWord clickForgotPassword()
    {
        clickLink("Forgot Password");
        return new ForgotPassWord(driver);
    }


}
