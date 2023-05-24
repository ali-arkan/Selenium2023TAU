package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {


    private WebDriver driver; // create new driver
    private By formAuthLink = By.linkText("Form Authentication");// Linktexti "Form Authentication" olan linki yakalayıp BY altına store ettik

    public HomePage(WebDriver driver)
    {
      this.driver = driver;
    }
    public LoginPage clickFormAuth() // Click butonuna tıklandıgında yeni bir sayfa açarız
    {
        driver.findElement(formAuthLink).click(); // elementi yakaladık ve tıkladık
        return new LoginPage(driver); // Click yapıldıgında yeni bir sayfa acılacak, bu sayfayı geri dondurecez,bu metod driver parametresi alacak cunku butun sayfalar driver ihtiyac duyar



    }



}
