import java.util.Scanner;

public class student {
    private String firstName;
    private String lastName;
    private String year;
    private String studentId;
    private String cources;
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
}
