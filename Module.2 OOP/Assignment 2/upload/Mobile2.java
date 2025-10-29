class Mobile{
	String model;
	static int totalModel = 0;
	
	    Mobile(String model){
		this.model = model;
		totalModel++;
	}
	
	static void showTotalModel(){
		System.out.println("Total mobiles in stock: " +totalModel);
	}
}

class Mobile2{
	public static void main(String args[]){
		Mobile model1 = new Mobile("Realme 7");
		Mobile model2 = new Mobile("Samsung M32");
		Mobile model3 = new Mobile("Redmi Note 12");
		
		System.out.println("Mobile1: model= " + model1.model);
		System.out.println("Mobile2: model= " + model2.model);
		System.out.println("Mobile3: model= " + model3.model);
		
		Mobile.showTotalModel();
		
	} 
}