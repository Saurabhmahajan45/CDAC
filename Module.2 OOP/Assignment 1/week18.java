import java.util.Scanner;

class week18{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter day number: ");
	int day = sc.nextInt();
	 
	if (day == 1) {
            System.out.println("Day is Monday");
        } else if (day == 2) {
            System.out.println("Day is Tuesday");
        } else if (day == 3) {
            System.out.println("Day is Wednesday");
        } else if (day == 4) {
            System.out.println("Day is Thursday");
        } else if (day == 5) {
            System.out.println("Day is Friday");
        } else if (day == 6) {
            System.out.println("Day is Saturday");
        } else if (day == 7) {
            System.out.println("Day is Sunday");
        } else {
            System.out.println("Invalid day number! Please enter between 1 and 7.");
        }
	}
}