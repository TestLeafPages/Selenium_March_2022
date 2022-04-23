package week6.day1;

import org.testng.annotations.Test;

public class LearnAttributes {
	
	@Test(invocationCount = 2, priority = -1)
	public void createLead() {
		System.out.println("CreateLead");

	}

	@Test(enabled = false)
	public void editLead() {
		System.out.println("EditLead");

	}

	@Test
	public void deleteLead() {
		System.out.println("DeleteLead");

	}

}
