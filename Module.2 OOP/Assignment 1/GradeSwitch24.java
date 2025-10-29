import java.util.Scanner;

class GradeSwitch24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        String grade;

        switch (marks / 10) {
            case 10: // for 100
            case 9:  // 90–99
            case 8:  // 80–89
                grade = "A";
                break;
            case 7:  // 70–79
                grade = "B";
                break;
            case 6:  // 60–69
            case 5:  // 50–59
                grade = (marks >= 55) ? "C" : "D"; 
                break;
            case 4:  // 40–49
                grade = (marks >= 45) ? "D" : "E";
                break;
            case 3:  // 30–39
            case 2:  // 20–29
            case 1:  // 10–19
            case 0:  // 0–9
                grade = (marks >= 25) ? "E" : "F";
                break;
            default:
                grade = "Invalid Marks!";
        }

        System.out.println("Grade: " + grade);
    }
}