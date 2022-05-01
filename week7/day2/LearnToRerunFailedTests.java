package week7.day2;

import org.testng.annotations.Test;

public class LearnToRerunFailedTests {
	
	@Test(timeOut = 600)
	public void createLead() throws InterruptedException {
		int ranNum = (int) (Math.random()*1000);
		System.out.println(ranNum);
		System.out.println("createLead");
		Thread.sleep(ranNum);
	}

	@Test
	public void editLead() {
		System.out.println("editLead");
		//throw new RuntimeException();
	}

	
	@Test
	public void deleteLead() {
		System.out.println("deleteLead");
		
	}

	
	@Test
	public void duplicateLead() {
		System.out.println("duplicateLead");

	}

}
