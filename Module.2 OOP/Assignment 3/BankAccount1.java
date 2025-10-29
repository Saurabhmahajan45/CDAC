class BankAccount{
	private double balance = 1200;
	
	public void deposit(double amount){
		balance = balance + amount;
	}
	public void withdraw(double amount){
		if(amount <= balance){
		balance = balance - amount;
		}else{
			System.out.println("Insufficient Balance");
		}		
	}
	
    public double getBalance(){
		return balance;
	}
}
class BankAccount1{
	public static void main(String args[]){
		BankAccount e1 = new BankAccount();
		e1.deposit(5000);
		e1.withdraw(2000);
		System.out.println("Updated Balance: " + e1.getBalance());
	}
}