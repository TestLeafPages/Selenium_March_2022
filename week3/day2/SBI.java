package week3.day2;

public class SBI implements RBI{
	
	public void minimumBalance() {
		System.out.println(1000);
	}

	public void maxLoanAmount() {
		System.out.println(500000);
	}
	
	public void agriLoan() {
		System.out.println(200000);
	}
	
	public static void main(String[] args) {
		SBI sbi = new SBI();
		sbi.agriLoan();
		sbi.maxLoanAmount();
	}

}
