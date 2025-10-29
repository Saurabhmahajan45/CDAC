class Grade{
	int rollNo;
	String name;
	private int mark;
	
	Grade(int rollNo, String name, int mark){
		this.rollNo = rollNo;
		this.name = name;
		this.mark = mark;
	}
	
	public int getMark(){
		return mark;
	}
	
	public void setMark(int mark){
		this.mark = mark;
	}
	
    public String calculateGrade(){
		return (mark >= 80) ? "A"
         : (mark >= 60) ? "B"
         : (mark >= 40) ? "C"
         : "Fail";
	}
	
	public void StudentMarks(){
		System.out.println("Roll No. " +rollNo + ", Name: " + name +", Marks: " + mark + ", Grade: " + calculateGrade());
	}

}
class Grade11{
	public static void main (String args[]){
		Grade s1 = new Grade(23, "Rahul" , 65);
		Grade s2 = new Grade(25, "Shivam" , 91);
		s1.StudentMarks();
		s2.StudentMarks();
	}
}