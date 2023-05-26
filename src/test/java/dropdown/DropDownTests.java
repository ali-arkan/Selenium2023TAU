package dropdown;

import base.BaseTests;
import com.fasterxml.jackson.databind.ser.Serializers;
import org.testng.annotations.Test;
import pages.DropDownPage;

import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DropDownTests  extends BaseTests {

/*
    Test Steps
-------------------------------
1- Visit Homepage, Click Dropdown, return DropDownpage
	Already have Basetests.java
	already have in HomePage.java
		clickLink()
			click any link by linktext
		clickDropDown()
			click dropdown
			return dropdownpage
2- select one option from dropdown, make sure it is selected
	Create a new Page : DropDownpage.java
		Fields:
			WEbdriver
			Dropwdown Option
		Constructor
			Webdriver
		Metods
			ClickDropDown
			SelectFromDropDown
				verifySelected One
	Create New Test: DropDownTest.java-
 */
    @Test
    public void testSelectOption()
    {
       String option = "Option 2";
       DropDownPage dropDownPage = homePage.clickDropDown(); // Click the dropdown from homepage
       dropDownPage.SelectFromDropDown(option); // select an option from dropdown page

      List<String> selectedOptions = dropDownPage.getSelectedOptions();
      assertEquals(selectedOptions.size(),1,"Incorrect number of selections");
      assertTrue(selectedOptions.contains(option),"Option not selected");



    }
}

