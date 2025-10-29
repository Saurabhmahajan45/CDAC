class Teacher{
	String name;
	
	Teacher(String name){
		this.name = name;
	}
	
}

class Student{
	String name;
	
	Student(String name){
		this.name = name;
	}
	
}
public class AssociationDemo{
	
	public static void main(String args[]){
		//Association : one to one mapping
		Teacher t1 = new Teacher("Aditya Sir");
		Student s1 = new Student("Sanket");
		
		//Association : one to many mapping
		Teacher t11 = new Teacher("Aditya Sir");
		Student s11 = new Student("Sanket");
		Student s12 = new Student("Sanket1");
		
		//Association : many to one mapping
		Teacher t111 = new Teacher("Aditya Sir");
		Teacher t112 = new Teacher("AniketSir");
		Student s111 = new Student("Sanket");
		
		//Association : many to many mapping
		Teacher t1111 = new Teacher("Aditya Sir");
		Teacher t1112 = new Teacher("AniketSir");
		Student s1111 = new Student("Sanket");
		Student s1112 = new Student("Sanket1");
		Student s1113 = new Student("Sanket2");
		Student s1114 = new Student("Sanket3");
		
		
		
		
	}
}

	
