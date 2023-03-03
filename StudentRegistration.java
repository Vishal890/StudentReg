
import java.util.Scanner;

public class StudentRegistration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("---------Welcome to student Registration Page--------");
        System.out.println("Please Enter your details:");

        // create a new student
        Student student = new Student();
        System.out.print("Enter the name:");
        String name = sc.nextLine();
        System.out.print("Enter age:");
        int age = sc.nextInt();
        System.out.print("Enter qualification in numbers:");
        int qualification = sc.nextInt();
        System.out.print("Enter gpa:");
        double gpa  = sc.nextDouble();
        System.out.print("Enter email:");
        String email = sc.next();
        student.setDetails(name,age,gpa,email,qualification);
        student.getStudentDetails();

        Register r = new Register();
        Boolean valid = r.isValid(age,gpa,qualification);
        // // validate the new student's details

        if (valid) {
        // save the new student's details to the storage mechanism
            System.out.println("Correct details");
            storeDetails store = new storeDetails();
            store.storeData(name,age,gpa,email,qualification);
        } else {
        System.out.println("Invalid student details. Please try again.");
        }
        //Course details generation
        System.out.println("Please select your course Number:");
        System.out.println("Computer Science : 15432 \n Electrical Engineering : 15424 \n Mechanical Engineering :15515");
        int courseNumber = sc.nextInt();
        courseCatalog cc = new courseCatalog();
        cc.setCourseDetails(courseNumber);
        sc.close();
    }
}
