class Example1{
	int x=10;
	
	public static void main(String args[]){
		int x1=10;
	
		
	Example1 e = new Example1();
	Example1 e1 = new Example1();
	Example1 e2 = new Example1();
	System.out.println(e);
	Example1 e3;// Only reference created
	e3=e;
	//e3	= new Example1();
	System.out.println(e3);
	System.out.println(e1);
	e = e1;
	System.out.println(e);
	e1 = e2;
	System.out.println(e2);
	e2 = null; //reference is pointing to nulll; no object associated with it
	System.out.println(e2);

		
		
		
	
	}
}