class Employee{
	String name;
	double basicSalary;
	public void Salary(String name, double basicSalary){
		this.name = name;
		this.basicSalary = basicSalary;
	}
} 

class RegularEmployee extends Employee{
	public double calculateSalary(){
		return basicSalary + (basicSalary * 0.1);
	}
}
 class ContractEmployee extends Employee{
	public double calculateSalary(){
		return basicSalary + (basicSalary * 0.05);
	}
}

class Employee7{
	public static void main (String args[]){
		RegularEmployee r1 = new RegularEmployee();
		r1.Salary("Rahul" ,20000);
		System.out.println(r1.name + " Net Salary " + r1.calculateSalary());
		
		ContractEmployee c1 = new ContractEmployee();
		c1.Salary("Riya" , 15000);
		System.out.println(c1.name + " Net Salary " + c1.calculateSalary());
	}
}