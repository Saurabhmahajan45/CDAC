class Bank{
	private static double interest;
	static{
		interest = 4.0;
		System.out.println("Bank Interest Rate Initialzed: " +interest + "%" );
	}
	
	private String name;
	private double balance;
	
	Bank(String name, double balance){
		this.name = name;
		this.balance = balance;
	}

    public String getName(){
		return name;
	}
	
	public double getBalance(){
		return balance; 
	}
	
	public void setName(){
		this.name = name;
	}
	
	public void setBalance(){
		this.balance = balance; 
	}
	
	public static double getInterest(){
		return interest;
	}
	
	public void accountDetails(int accounts){
		System.out.println("Account" + accounts + "Name= "+ getName()+ ", Balance= " + getBalance() + ", Interest Rate = " + getInterest() + "%");
	}
}

class Bank8{
	public static void main(String args[]){
		Bank A1 = new Bank("Rohit", 5000);
		Bank A2 = new Bank("Priya", 15000);
		
		A1.accountDetails(1);
		A2.accountDetails(2);
	}
}