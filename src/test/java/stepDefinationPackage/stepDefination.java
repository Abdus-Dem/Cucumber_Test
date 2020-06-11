package stepDefinationPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import runnerPackage.TestRunner;

public class stepDefination extends TestRunner {
	
	
	@Given("I navigate to google homepage")
	public void i_navigate_to_google_homepage() {
	    // Write code here that turns the phrase above into concrete actions
	    
		driver.get("http://google.com");
		
	}
	
	WebElement searchBox;
	
	@When("I enter a keyword to search")
	public void i_enter_a_keyword_to_search() {
	   
	    
		searchBox = driver.findElement(By.name("q"));
		
		searchBox.sendKeys("porsche");
		
		
		
	}
	
	@And("I click on the search button")
	public void i_click_on_the_search_button() {
	   
		searchBox.sendKeys(Keys.ENTER);
		
	}
	
	@Then("I should be able to see the title contains the keyword")
	public void i_should_be_able_to_see_the_title_contains_the_keyword() {
	    
	    
		Assert.assertTrue(driver.getTitle().contains("porsche"));
		
	}
	
	
	
}
