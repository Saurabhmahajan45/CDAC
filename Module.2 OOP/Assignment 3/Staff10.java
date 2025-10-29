class Staff{
	String name;
	int salary;
	Staff(String name, int salary){
		this.name = name;
		this.salary = salary;
	}
	public void displayInfo(){}

}
class TeachingStaff extends Staff{
	String subject;
	TeachingStaff(String name, int salary, String subject){
		super(name, salary);
		this.subject = subject;
	}
	public void displayInfo(){
		System.out.println(name + "-->" + subject + "," + salary);
	}
}

class NonTeachingStaff extends Staff{
	String department;
	NonTeachingStaff(String name, int salary, String department){
		super(name, salary);
		this.department = department;
	}
	
	public void displayInfo(){
		System.out.println(name + "-->" + department + "," + salary);
	}
}


class Staff10{
	public static void main(String args[]){
		Staff s1 = new TeachingStaff("Anita" , 50000, "Math");
		Staff s2 = new NonTeachingStaff("Ramesh" , 40000,"Admin");
		s1.displayInfo();
		s2.displayInfo();
	}
}