import java.util.Scanner;

class Friends12{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age of Friend 1: ");
        int f1 = sc.nextInt();

        System.out.print("Enter age of Friend 2: ");
        int f2 = sc.nextInt();

        System.out.print("Enter age of Friend 3: ");
        int f3 = sc.nextInt();

        if (f1 > f2 && f1 > f3) {
            System.out.println("Oldest: Friend 1");
        } else if (f2 > f1 && f2 > f3) {
            System.out.println("Oldest: Friend 2");
        } else{
            System.out.println("Oldest: Friend 3");
        }

        if (f1 < f2 && f1 < f3) {
            System.out.println("Youngest: Friend 1");
        } else if (f2 < f1 && f2 < f3) {
            System.out.println("Youngest: Friend 2");
        } else{
            System.out.println("Youngest: Friend 3");
        }
    }
}
