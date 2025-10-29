class TeaCup{
	String teaType;
	static int totalCups = 0;
	
        TeaCup(String teaType){
		this.teaType = teaType;
		totalCups++;
	}
		
	     static void showTotalCups(){
			System.out.println("Total cups made: " +totalCups);
		}
}	
		class TeaCup1{
		public static void main(String args[]){
			TeaCup cup1 = new TeaCup("Masala Tea");
			TeaCup cup2 = new TeaCup("Green Tea");
			TeaCup cup3 = new TeaCup("Ginger Tea");
			TeaCup cup4 = new TeaCup("Black Tea");
			
			System.out.println("Cup1: teaType = " +cup1.teaType);
			System.out.println("Cup2: teaType = " +cup2.teaType);
			System.out.println("Cup3: teaType = " +cup3.teaType);
			System.out.println("Cup4: teaType = " +cup4.teaType);
			TeaCup.showTotalCups();
		}
		}
	
	
	
