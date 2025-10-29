class One{
	public static void print(){
		System.out.println("1");
	}
}

class Two extends One{
	public static void print(){
		System.out.println("2");
	}
}

public class Test{
	public static void main(String args[]){
		One one = new Two();
		one.print();
		
	}
}