class BankDeposit{

	String accountHolder;
	private double balance;
	
	BankDeposit(String accountHolder, double balance){
		this.accountHolder = accountHolder;
		this.balance = balance;
	}

	public double getBalance(){
		return balance; 
	}
	
	public void setBalance(double balance){
		this.balance = balance; 
	}
    
	public void deposit(double amount){
		if (amount > 0){
			balance += amount;
		}
	}
	
	public void withdraw(double amount){
		if (amount > 0 && amount <= balance){
			balance -= amount;
		}
	}
	
	public void accountDetails(){
		System.out.println("Account Holder= "+ accountHolder + ", Balance= " + getBalance());
	}
}

class BankDeposit13{
	public static void main(String args[]){
		BankDeposit A1 = new BankDeposit("Rohit Shahu", 50800);
		BankDeposit A2 = new BankDeposit("Shiva kadam", 45000);
		
		A1.accountDetails();
		A2.accountDetails();
		A1.deposit(5600.00);
		A1.accountDetails();
		A2.withdraw(5600.00);
		A2.accountDetails();
	}
}