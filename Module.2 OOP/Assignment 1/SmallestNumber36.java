import java.util.Scanner;

class SmallestNumber36{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int n1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int n2 = sc.nextInt();

        System.out.print("Enter third number: ");
        int n3 = sc.nextInt();
		
		int result = (n1 < n2) ? ((n1 < n3)? n1 : n3) : ((n2 < n1) ? n2 : n3);
		System.out.println("Smallest number: " + result);
		
	}
}
