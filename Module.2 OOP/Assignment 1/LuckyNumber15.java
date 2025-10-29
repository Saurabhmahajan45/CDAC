import java.util.Scanner;

class LuckyNumber15 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a 4-digit number: ");
        int num = sc.nextInt();

        if (num < 1000 || num > 9999) {
            System.out.println("Please enter a valid 4-digit number!");
        } else {
          
            int A = num / 1000;            
            int B = (num / 100) % 10;    
            int C = (num / 10) % 10;      
            int D = num % 10;           

            if (A + B == C + D) {
                System.out.println("Lucky number!");
            } else {
                System.out.println("Not a lucky number");
            }
        }
    }
}
