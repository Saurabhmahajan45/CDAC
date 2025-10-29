//toString(): providing a string representation of an object

class Employee{
	String name;
	int id;
	
	public Employee(String name, int id){
		this.name = name;
		this.id = id;
	}
	
	//@Override //Overriding toString()
	public String toString(){
		
		return name+" "+id;
	}
	
}
public class ToStringDemo {
	public static void main(String args[]) {
		
		System.out.println("start");
		Employee e1 = new Employee("Amit", 111);
		System.out.println(e1); //call to toString()
	}

}

