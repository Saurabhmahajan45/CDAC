class EmployeeId{
	private int id;
	private String name;
	private double salary;
	
	private static int counter = 1001;
	
	EmployeeId(){
		this.id = counter++;
        this.name = "Unknown";
        this.salary = 20000;
	}
	EmployeeId(String name, double salary){
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
	public void employeeDetails(){
		System.out.println("IDs= "+ getId() + ", Name = " + getName() + ", Salary = " +getSalary());
	}
}
class EmployeeId15{
	public static void main(String args[]){
	EmployeeId e1 = new EmployeeId("Saurabh" ,25000);
	EmployeeId e2 = new EmployeeId("Shankar" ,35000);
	EmployeeId e3 = new EmployeeId();
	
	e1.employeeDetails();
	e2.employeeDetails();
	e3.employeeDetails();
	
}
}