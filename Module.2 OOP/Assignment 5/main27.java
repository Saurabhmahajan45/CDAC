import java.util.*;

class employee implements Comparable<employee>{
	private String name;
	private int salary;
	
	employee(String name, int salary){
		this.name = name;
		this.salary = salary;
	}
	public String toString(){
		return name + ":" +salary;
	}
	public int compareTo(employee s){
		return this.salary - s.salary;
	}
}

class main27{
	public static void main(String args[]){
		List<employee> e = new ArrayList<>();
		e.add(new employee("Amit", 50000));
		e.add(new employee("Priya", 60000));
		e.add(new employee("Rohan", 45000));
		
		Collections.sort(e);
		System.out.print("Sorted by salary: ");
		int count = 0;
		for(employee e1 : e){
			System.out.print(e1);
			if(++count < e.size()){
				System.out.print(", ");
			}
		}
	}
}