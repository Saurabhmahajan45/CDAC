class Marks{
	int rollNo;
	String name;
	private int mark;
	
	Marks(int rollNo, String name, int mark){
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
	
	public void StudentMarks(){
		System.out.println("Roll No. " +rollNo + ", Name: " + name +", Marks: " + mark);
	}

}
class Marks10{
	public static void main (String args[]){
		Marks s1 = new Marks(23, "Rahul" , 65);
		 System.out.println("Before updating marks:");
		s1.StudentMarks();
		System.out.println("After updating marks:");
		s1.setMark(75);
		s1.StudentMarks();
	}
}