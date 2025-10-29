class Book {
    private int bookId;
    private String title;
    private String author;

    public Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }

    public int getBookId() { 
	return bookId; 
	}
    public String getTitle() { 
	return title; 
	}
    public String getAuthor() { 
	return author; 
	}
}
abstract class LibraryMember {
     int memberId;
     String name;
     int borrowedCount = 0;

    public LibraryMember(int memberId, String name) {
        this.memberId = memberId;
        this.name = name;
    }

    public abstract void borrowBook(Book book);
}
class StudentMember extends LibraryMember implements Notifyable {
    private static final int LIMIT = 3;

    public StudentMember(int memberId, String name) {
        super(memberId, name);
    }

    @Override
    public void borrowBook(Book book) {
        if (borrowedCount < LIMIT) {
            borrowedCount++;
            //System.out.println("StudentMember " + name + " borrowed book: " + book.getTitle());
        } else {
            System.out.println("StudentMember " + name + " cannot borrow more than " + LIMIT + " books.");
        }
    }

    @Override
    public void sendNotification(String message) {
        System.out.println("Notification sent to " + name + ": " + message);
    }
}
class FacultyMember extends LibraryMember implements Notifyable {
    private static final int LIMIT = 5;

    public FacultyMember(int memberId, String name) {
        super(memberId, name);
    }

    @Override
    public void borrowBook(Book book) {
        if (borrowedCount < LIMIT) {
            borrowedCount++;
            //System.out.println("FacultyMember " + name + " borrowed book: " + book.getTitle());
        } else {
            System.out.println("FacultyMember " + name + " cannot borrow more than " + LIMIT + " books.");
        }
    }

    @Override
    public void sendNotification(String message) {
        System.out.println("Notification sent to " + name + ": " + message);
    }
}
interface Notifyable {
    void sendNotification(String message);
}
public class LibraryManagement30 {
    public static void main(String[] args) {

        Book b1 = new Book(101, "Java Programming", "James Gosling");
        Book b2 = new Book(102, "Data Structures", "Robert Lafore");
        Book b3 = new Book(103, "Operating Systems", "Silberschatz");
        Book b4 = new Book(104, "Computer Networks", "Tanenbaum");
        Book b5 = new Book(105, "Database Systems", "Navathe");

        StudentMember student = new StudentMember(1, "Amit");
        FacultyMember faculty = new FacultyMember(2, "Prof. Singh");

        student.borrowBook(b1);
        student.borrowBook(b2);

        faculty.borrowBook(b1);
        faculty.borrowBook(b2);
        faculty.borrowBook(b3);
        faculty.borrowBook(b4);

        System.out.println("StudentMember " + student.name + " borrowed " + student.borrowedCount + " books");
        System.out.println("FacultyMember " + faculty.name + " borrowed " + faculty.borrowedCount + " books");
        student.sendNotification("Return books within 7 days");
        faculty.sendNotification("Return books within 14 days");
    }
}
