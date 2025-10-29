class Student{
	private int marks;
	
	public int getMarks(){
		return marks;
	}
	
	public void setMarks(int marks){
		if (marks >= 0 && marks <= 100){
			this.marks = marks;
		}else{
			System.out.println("Invalids Marks");
		}
	}

}

class Students2{
	public static void main(String args[]){
		Student s1 = new Student();
		Student s2 = new Student();
		s1.setMarks(90);
		s2.setMarks(60);
		System.out.println("Marks of s1 = " +s1.getMarks());
		System.out.println("Marks of s2 = " +s2.getMarks());
	}
}