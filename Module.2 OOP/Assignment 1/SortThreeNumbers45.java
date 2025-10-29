import java.util.Scanner;

class SortThreeNumbers45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.print("Enter third number: ");
        int num3 = sc.nextInt();

        int smallest, middle, largest;

        smallest = (num1 < num2 && num1 < num3) ? num1 : (num2 < num3 ? num2 : num3);

        largest = (num1 > num2 && num1 > num3) ? num1 : (num2 > num3 ? num2 : num3);

        middle = num1 + num2 + num3 - smallest - largest;

        System.out.println("Ascending order: " + smallest + ", " + middle + ", " + largest);
    }
}
