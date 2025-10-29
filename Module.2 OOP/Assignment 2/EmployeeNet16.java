class EmployeeNet{
	private int id;
	private String name;
	private double salary;
	
	private static int counter = 1001;
	
	EmployeeNet(){
		this.id = counter++;
        this.name = "Unknown";
        this.salary = 20000;
	}
	EmployeeNet(String name, double salary){
		this.id = counter++;
        this.name = name;
        this.salary = salary;
	}
	
	public int getId(){
		return id;
	}
	public String getName(){
		return name;
	}
	public double getSalary(){
		return salary;
	}
	public double calculateNetSalary(){
		double hra = salary * 0.1;
		double da = salary * 0.05;
		double pf = salary * 0.02;
		return salary + hra + da - pf;
	}
	public void employeeDetails(){
		System.out.println("IDs= "+ getId() + ", Name = " + getName() + ", Salary = " +getSalary() +", Net Salary = " + calculateNetSalary());
	}
}
class EmployeeNet16{
	public static void main(String args[]){
	EmployeeNet e1 = new EmployeeNet("Saurabh" ,25000);
	EmployeeNet e2 = new EmployeeNet("Shankar" ,35000);
	EmployeeNet e3 = new EmployeeNet();
	
	e1.employeeDetails();
	e2.employeeDetails();
	e3.employeeDetails();
	
}
}