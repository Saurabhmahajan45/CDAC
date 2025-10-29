abstract class Shape{
	abstract void draw();
}

class Circle extends Shape{
	int radius;
	Circle(int radius){
		this.radius = radius;
	}
	@Override
	public void draw(){
		System.out.println("Drawing circle of radius "+ radius);
	}
}

class Rectangle extends Shape{
	int length;
	int breadth;
	Rectangle(int length, int breadth){
		this.length = length;
		this.breadth = breadth;
	}
	@Override
	public void draw(){
		System.out.println("Drawing rectangle of length "+ length + " and breadth " + breadth);
	}
}
class Shape13{
	public static void main(String args[]){
		Shape s1 = new Circle(7);
		Shape s2 = new Rectangle(5,7);
		s1.draw();
		s2.draw();
	}
}