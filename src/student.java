import java.util.Scanner;

public class student {
    private String firstName;
    private String lastName;
    private String year;
    private String studentId;
    private String cources = null;
    private int balance;
    private static int costOfCources = 600;
    private static int id = 100;

    // enter students name and year
    public student() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter student's first name: ");
        this.firstName = in.nextLine();

        System.out.println("Enter student's last name: ");
        this.lastName = in.nextLine();

        System.out.println(" 1\n 2\n 3\n 4\n Enter student's class level: ");
        this.year = in.nextLine();

        setstudentId();
        System.out
                .println("First Name: " + firstName + " \n" + "Last Name: " + lastName + " \n" + "Grade Year: " + year
                        + " \n" + "Student Id: " + studentId);

    }

    // generate an id
    private void setstudentId() {
        this.studentId = year + "" + id;
    }

    // enroll courses
    public void enroll() {
        do {
            System.out.println("Enter course to enroll: (Quit for Q) ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equals("Q") && (!course.equals("q"))) {
                cources = cources + "\n" + course;
                balance = balance + costOfCources;
            } else {
                System.out.println("BREAK");
                break;
            }
        } while (1 != 0);
        System.out.println("Enrolled this courses: " + cources);
        System.out.println("Balance: " + balance);
    }

    public void showBalance() {
        System.out.println("Your balance is: " + balance);
    }

    public void pay() {
        showBalance();
        System.out.println("Enter your payment ");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        balance = balance - payment;
        System.out.println("Your payment " + payment);
        showBalance();
    }

    // show info

    public String showInfo() {
        return "Name: " + firstName + " " + lastName + "\nCourses Enrolled: " + cources + "\nBalance: " + balance;
    }
}
