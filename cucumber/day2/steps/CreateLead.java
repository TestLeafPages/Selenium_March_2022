package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLead extends BaseClass{
	
	@When("Click on CRMSFA link")
	public void clickCRMSFALink() {
		driver.findElement(By.linkText("CRM/SFA")).click();

	}

	@Then("MyHome page should be displayed")
	public void verifyMyHomePage() {
		System.out.println("My Home page is displayed");

	}
}
