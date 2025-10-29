class BankAccount{

	String accountHolder;
	private double balance;
	
	BankAccount(String accountHolder, double balance){
		this.accountHolder = accountHolder;
		this.balance = balance;
	}

	public double getBalance(){
		return balance; 
	}
	
	public void setBalance(double balance){
		this.balance = balance; 
	}

	public void accountDetails(){
		System.out.println("Account Holder= "+ accountHolder + ", Balance= " + getBalance());
	}
}

class BankAccount12{
	public static void main(String args[]){
		BankAccount A1 = new BankAccount("Rohit Shahu", 5000);
		
		A1.accountDetails();
		A1.setBalance(7500);
		A1.accountDetails();
	}
}