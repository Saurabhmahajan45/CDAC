class Employee{
	String name;
	int salary;
	Employee(String name, int salary){
		this.name = name;
		this.salary = salary;
	}
	public void displaySalary(){
      System.out.println(salary);		
	}
}

class Manager extends Employee{
	Manager(String name, int salary){
		super(name,salary);
	}
	@Override
	public void displaySalary(){
		double s = salary + (salary * 0.2);
		System.out.println(name + " Total Salary = " + s);	
	}
}

class Developer extends Manager{
	Developer(String name, int salary){
		super(name,salary);
	}
	@Override
	public void displaySalary(){
		double s = salary + (salary * 0.1);
		System.out.println(name + " Total Salary = " + s);	
	}
}

class Employee16{
	public static void main (String args[]){
		Employee m1 = new Manager("Anita" , 50000);
		Employee d1 = new Developer("Rohit" ,40000);
		m1.displaySalary();
		d1.displaySalary();
	}
}