package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class HoversPage {

    private WebDriver driver;
    private By figureBox = By.className("figure");

    public HoversPage (WebDriver driver)
    {
        this.driver = driver;
    }

    /**
     *
     * @param index starts at 1
     */
    public void hoverOverFigure(int index)
    {

        WebElement figures = driver.findElements(figureBox).get(index-1);
        Actions actions = new Actions(driver);
        actions.moveToElement(figures).perform();

    }

    public class FigureCaption
    {
        private WebElement caption;
        public FigureCaption(WebElement caption)
        {
            this.caption = caption;
        }
    }



}
