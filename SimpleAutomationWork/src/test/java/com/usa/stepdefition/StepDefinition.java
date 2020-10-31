package com.usa.stepdefition;

import org.openqa.selenium.support.PageFactory;

import com.usa.basepage.BasePage;
import com.usa.pagefactory.OwnPageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends BasePage {
	
	OwnPageFactory pf;
	
	@Given("^Customer can open any browser$")
	public void customer_can_open_any_browser()  {
		initialAction();
		pf=PageFactory.initElements(driver, OwnPageFactory.class);
	  
	}

	@Given("^Navigate to \"([^\"]*)\"$")
	public void navigate_to(String ur1)  {
	    driver.get(ur1);
	  
	}

	@Given("^Customer can enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void customer_can_enter_and(String userName, String Password)  {
	    
	  pf.getClickButton().click();
	  pf.getGetUName().sendKeys(userName);
	  pf.getPswd().sendKeys(Password);
	}

	@Given("^Click on Submit button$")
	public void click_on_Submit_button()  {
	    
	  
	}

	@Given("^Verify Home page title$")
	public void verify_Home_page_title()  {
	    
	  
	}

	@When("^enter in search box product name as a iPhone$")
	public void enter_in_search_box_product_name_as_a_iPhone()  {
	    
	  
	}

	@When("^Customer able to see list of the iPhone on screen$")
	public void customer_able_to_see_list_of_the_iPhone_on_screen()  {
	    
	  
	}

	@When("^Customer can print the entire price$")
	public void customer_can_print_the_entire_price()  {
	    
	  
	}

	@When("^Customer can click on third number iPhone$")
	public void customer_can_click_on_third_number_iPhone()  {
	   
	  
	}

	@Then("^Customer verify the price$")
	public void customer_verify_the_price()  {
	  
	  
	}

	

}
