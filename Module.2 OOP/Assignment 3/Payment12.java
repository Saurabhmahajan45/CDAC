abstract class Payment{
    abstract void Pay();
} 

class CreditCardPayment extends Payment{
	long cardNumber;
	int amount;
	
	CreditCardPayment(long cardNumber, int amount){
		this.cardNumber = cardNumber;
		this.amount = amount;
	}
	@Override
	public void Pay(){
		System.out.println("Payment via Credit Card " +cardNumber + "--> Rs." + amount + " Paid");
	}
	
}

class UPICardPayment extends Payment{
	String upiId;
	int amount;
	
	UPICardPayment(String upiId, int amount){
		this.upiId = upiId;
		this.amount = amount;
	}
	@Override
	public void Pay(){
		System.out.println("Payment via UPI " + upiId + "--> Rs." + amount + " Paid");
	}
	
}

class Payment12{
	public static void main (String args[]){
		Payment a1 = new CreditCardPayment(1234567890123456L, 4500);
       Payment b1 = new UPICardPayment("rahul@upi" , 2000);
	   a1.Pay();
	   b1.Pay();
	   
		}
}