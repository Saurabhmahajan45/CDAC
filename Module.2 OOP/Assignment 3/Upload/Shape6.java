class Shape{
	public void area(){}
}
class Rectangle extends Shape{
	public void area(int length, int breadth){
		System.out.println("Area Of Rectangle : " + length * breadth);
	}
}

class Circle extends Shape{
	public void area(int radius){
		System.out.println("Area Of Circle : " +  Math.PI * radius * radius);
	}
}

class Shape6{
	public static void main(String args[]){
		Circle c1 = new Circle();
		Rectangle r1 = new Rectangle();
		
		r1.area(5,10);
		c1.area(7);
		
	}
}