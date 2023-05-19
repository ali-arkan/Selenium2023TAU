package dropdown;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


public class DropdownTests  extends BaseTests {

    @Test
    public void testSelectOption()
    {
          /*
           Page Design:
           MAIN
              1. HomePage: use existing HomePage for click link, return DropDownPage
              2. DropDownPage: Create new DropDownPage under MAIN
           TEST
              2. DropDownTests: Test cases for the Homepage and DropDownPage
            */

        //From the Home page, we’re going to click on the Dropdown link
        var dropDownPage = homePage.ClickDropDown();

        // Then we are going to select an option from the dropdown, test
        String option = "Option 2";
        dropDownPage.selectFromDropDown(option);

        // Then we're going to make sure that it's selected
        var selectedOptions = dropDownPage.getSelectedOptions();
        assertEquals(selectedOptions.size(), 1, "Incorrect number of selections");
        assertTrue(selectedOptions.contains(option), "Option is not selected");


    }
}
