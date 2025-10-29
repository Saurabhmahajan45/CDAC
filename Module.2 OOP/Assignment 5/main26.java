import java.util.*;

class employee{
	private String name;
	private int salary;
	employee(String name, int salary){
		this.name = name;
		this.salary = salary;
	}
	
	public String toString(){
		return name + ":" +salary;
	}
}

class main26{
	public static void main (String args[]){
		ArrayList<employee> employeeRecord = new ArrayList<>();
		
		employeeRecord.add(new employee("Amit",50000));
		employeeRecord.add(new employee("Priya",60000));
		
				int count = 0;
		System.out.print("Employee List: ");
		for(employee list : employeeRecord){
			System.out.print(list);
				if(++count < employeeRecord.size()){
			System.out.print(", ");
				}
		}
		
	}
}