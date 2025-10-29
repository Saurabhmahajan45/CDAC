class OnlineShopping2{
	static double[] price;
	static int quantity;
	static int unit;
	
	public void orders(double[] price, int quantity, int unit){
	    this.price = price;
		this.quantity = quantity;
		this.unit = unit;
	}
	
	public static void orders(){
		int totalPrice;
		
	try{
		if(quantity == 0){
			throw new ArithmeticException("Arithmetic Exception Caught"); 
		}else{
			totalPrice = quantity * unit;
			System.out.println(totalPrice);
		}
		  try{
			double[] price;
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e.getMessage());
		}
	}catch(ArithmeticException e){
		System.out.println(e.getMessage());
	}
	}
	public static void main(String args[]){
		OnlineShopping2 shop = new OnlineShopping2();
		double[] price ={299.99, 499.99, 199.99};
		shop.orders(price, 0, 3);
		shop.orders(price, 2, 0);
		shop.orders(price, 2, 5);
		
		shop.orders();
	}
}