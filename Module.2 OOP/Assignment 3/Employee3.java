class Employee{
	private int age;
	
	public void setAge(int age){
		if(age >= 18){
			this.age = age;
		}else{
			System.out.println("Invalid Age");
		}
	}
	
	public int getAge(){
		return age;
	}

}

class Employee3{
	public static void main(String args[]){
		Employee e1 = new Employee();
		e1.setAge(19);
		System.out.println("Employee age is " +e1.getAge() + " and it is valid");
	}
}