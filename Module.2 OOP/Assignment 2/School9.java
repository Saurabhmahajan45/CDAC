class School{	
    private static int tutionFee;
	static{
		tutionFee = 30000;
		System.out.println("School Tuition Fee Initialized: " + tutionFee);
	}
	private String name;
	private String className;
	
	School(String name, String className){
		this.name = name;
		this.className = className;
	}
	
	public String getName(){
		return name;
	}
	public String getClassName(){
		return className;
	}
	
	public void setName(){
		this.name = name;
	}
	
	public void setClassName(){
		this.className = className;
	}
	
	public static int getTutionFee(){
		return tutionFee;
	}
	
	public void studentsDetails(int studentNum){
		System.out.println("Student" + studentNum + ": Name= " +getName()+ ", Class= " + getClassName()+ ", Tution Fee= " + getTutionFee());
	}
}

class School9{
	public static void main(String args[]){
		School s1 = new School("Anjali" , "10th");
		School s2 = new School("Vikram" , "12th");
		
		s1.studentsDetails(1);
		s2.studentsDetails(2);
	}
}