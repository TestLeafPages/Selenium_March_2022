package testcase;

import org.testng.annotations.Test;

public class LearnAttributes {

	@Test//(enabled = false)
	public void mergeLead() {
		System.out.println("Merge Lead");
		throw new RuntimeException();
	}
	
	@Test
	public void createLead() {
		System.out.println("Create Lead");
	}
	
	@Test(dependsOnMethods = {"testcase.CreateLead.mergeLead", "createLead"})
	public void editLead() {
		System.out.println("Edit Lead");
	}
}
