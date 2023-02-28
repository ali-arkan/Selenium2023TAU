package dropdown;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


public class DropdownTests  extends BaseTests {

    @Test
    public void testSelectOption()
    {

        //Click the dropdown link, use existing HomePage for click another link
        var dropDownPage = homePage.ClickDropDown();

        // Select any option from the list, Create new DropDownPage under main
        String option = "Option 2";
        dropDownPage.selectFromDropDown(option);

        // Verify Option Size is =1 and selected option is true
        var selectedOptions = dropDownPage.getSelectedOptions();
        assertEquals(selectedOptions.size(), 1, "Incorrect number of selections");
        assertTrue(selectedOptions.contains(option), "Option is not selected");


    }
}
