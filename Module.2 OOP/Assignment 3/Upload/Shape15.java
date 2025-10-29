class ShapeArea{
	public int calculateArea(int side){
		return side * side;
	}
	public int calculateArea(int l, int b){
		return l * b;
	}
	public double calculateArea(double radius){
		return Math.PI * radius * radius ;
	}
}

class Shape15{
	public static void main(String args[]){
	ShapeArea s1 = new ShapeArea();	
	System.out.println("Square Area = " + s1.calculateArea(5));
	System.out.println("Rectangle Area = " + s1.calculateArea(4,6));
	System.out.println("Circle Area = " + s1.calculateArea(3.00));
	
	}
}