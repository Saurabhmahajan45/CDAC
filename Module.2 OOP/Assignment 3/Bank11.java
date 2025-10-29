class Bank{
	int accountNo;
	int balance;
	Bank(int accountNo, int balance){
		this.accountNo = accountNo;
		this.balance = balance;
	}
	public void displayInfo(){}

}
class SavingAccount extends Bank{
	int interestRate;
	SavingAccount(int accountNo, int balance, int interestRate){
		super(accountNo, balance);
		this.interestRate = interestRate;
	}
	public void displayInfo(){
		System.out.println("Saving-->" + accountNo + ", Balance = " + balance + ", Interest = " +interestRate + "%");
	}
}

class CurrentAccount extends Bank{
	int overdraftLimit;
	CurrentAccount(int accountNo, int balance, int overdraftLimit){
		super(accountNo, balance);
		this.overdraftLimit = overdraftLimit;
	}
	
	public void displayInfo(){
		System.out.println( "Current-->" + accountNo + ", Balance = " + balance + ", Overdraft = " + overdraftLimit);
	}
}


class Bank11{
	public static void main(String args[]){
		Bank b1 = new SavingAccount(101, 5000, 5);
		Bank b2 = new CurrentAccount(102, 10000, 2000);
		b1.displayInfo();
		b2.displayInfo();
	}
}