package week3.day2;

public class MyBank {

	public static void main(String[] args) {
		SBI bank = new SBI();
		bank.minimumBalance();
		bank.maxLoanAmount();
		bank.agriLoan();
		
		Cibil bank3 = new ICICI();
		bank3.minimumBalance();
		bank3.maxLoanAmount();
		bank3.creditScore();
		
		// Scope restriction
		RBI bank2 = new SBI();
		bank2.minimumBalance();
		bank2.maxLoanAmount();
	}

}
