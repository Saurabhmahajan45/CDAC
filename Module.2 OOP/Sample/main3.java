import java.util.*;

class employee{
	private static String name;
	private static int salary;
	
	public employee(String name, int salary){
		this.name = name;
		this.salary = salary;
	}
	
	public String getN(){
		return name;
	}
	public int getS(){
		return salary;
	}
	
	@Override
	public String toString(){
		return name + ":" +salary;
	}
		
}		
class main3{		
	public static void main(String args[]){

		List<employee> ls = new LinkedList<>();
		
		ls.add(employee("Amit", 50000));
		ls.add(employee("Priya", 60000));
		ls.add(employee("Rahul", 55000));
		ls.add(employee("Neha", 45000));
		ls.add(employee("Vikram", 70000));
		ls.add(employee("Sanya" , 65000));
		ls.add(employee("Karan" , 48000));
		
		System.out.println("Employee List: ");
		for(employee e : ls){
			System.out.println(e);
		}
	}
}
