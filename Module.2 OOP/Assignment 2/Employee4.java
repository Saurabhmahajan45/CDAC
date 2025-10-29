class Employee {
	private String name;
	private double salary;
	private int yearsOfService;
	
	private static int totalEmployees;
	
	Employee(String name, double salary, int yearsOfService){
		this.name = name;
		this.salary = salary;
		this.yearsOfService = yearsOfService;
		totalEmployees++;
	}
	
	public String getName(){
		return name;
	}
	
	public double getSalary(){
		return salary;
	}
	
	public int getYearsOfService(){
		return yearsOfService;
	}
	
	public static int getTotalEmployees(){
		return totalEmployees;
		
	}
	
	public void setName(){
		this.name = name;
	}
	
	public void setSalary(){
		this.salary = salary;
	}
	
	public void setYearsOfService(){
		this.yearsOfService = yearsOfService;
		}
	
	public double calculateBonus(){
		if(yearsOfService > 5){
			return salary * 0.05;
		}else{
			return 0;
		}
	}
	
	public static void TotalEmployees(){
		System.out.println("Total employess: " +totalEmployees);
	}
	}
	
class Employee4{
	public static void main(String args[]){
		Employee E1 = new Employee("Ravi", 150000, 6);
		Employee E2 = new Employee("Anita", 120000, 3);
		Employee E3 = new Employee("Suresh", 100000, 5);
		
		System.out.println("Employee " +E1.getName() +" Bonus: " +E1.calculateBonus());
		System.out.println("Employee " +E2.getName() +" Bonus: " +E2.calculateBonus());
		System.out.println("Employee " +E3.getName() +" Bonus: " +E3.calculateBonus());
		
		Employee.TotalEmployees();
		
	}
}