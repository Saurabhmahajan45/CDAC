import java.util.Scanner;

class MonthName22{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month number: ");
        int month = sc.nextInt();

        String monthName;

        if (month >= 1 && month <= 12) {
            monthName = (month == 1) ? "January" :
                        (month == 2) ? "February" :
                        (month == 3) ? "March" :
                        (month == 4) ? "April" :
                        (month == 5) ? "May" :
                        (month == 6) ? "June" :
                        (month == 7) ? "July" :
                        (month == 8) ? "August" :
                        (month == 9) ? "September" :
                        (month == 10) ? "October" :
                        (month == 11) ? "November" : "December";
            System.out.println("Month is " + monthName);
        } else {
            System.out.println("Invalid month number!");
        }
    }
}
