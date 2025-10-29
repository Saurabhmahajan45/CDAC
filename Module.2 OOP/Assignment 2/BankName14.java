class BankName{
    static String bankName = "CDAC Bank";
	String accountHolder;
	private double balance;
	
	BankName(String accountHolder, double balance){
		this.accountHolder = accountHolder;
		this.balance = balance;
	}

	public double getBalance(){
		return balance; 
	}
	
	public void setBalance(double balance){
		this.balance = balance; 
	}
	
	public static void displayBankName(){
		System.out.println("Bank Name: " +bankName);
	}

	public void accountDetails(){
		System.out.println("Account Holder= "+ accountHolder + ", Balance= " + getBalance());
	}
}

class BankName14{
	public static void main(String args[]){
		BankName A1 = new BankName("Rohit Shahu", 5000);
		A1.displayBankName();
		A1.accountDetails();
		
	}
}