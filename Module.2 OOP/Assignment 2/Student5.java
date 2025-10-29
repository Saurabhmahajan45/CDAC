class Student{
	String name;
	private int marks;
	static int totalStudents;
	
	Student(String name, int marks){
		this.name = name;
		this.marks = marks;
		totalStudents++;
	}
	public String getName(){
		return name;
	}
	
	public int getMarks(){
		return marks;
	}
	
	public void setMarks(){
		this.marks = marks;
	}
	
	public boolean isPassed(){
		if(marks >= 35){
			return true;
		}else{
			return false;
		}
	}
	
	public static void showTotalStudents(){
		System.out.println("Total Students: " +totalStudents);
	}

}

class Student5{
	public static void main(String args[]){
		Student s1 = new Student("Rahul" , 78);
		Student s2 = new Student("Pooja" , 34);
		Student s3 = new Student("Amit" , 66);
		
		System.out.println("Student " + s1.getName() + "Passed? " + s1.isPassed());
		System.out.println("Student " + s2.getName() + "Passed? " + s2.isPassed());
		System.out.println("Student " + s3.getName() + "Passed? " + s3.isPassed());
		
		Student.showTotalStudents();
		
	}
}