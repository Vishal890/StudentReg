import java.util.Arrays;
import java.util.Scanner;

public class Exams {
    int per;
    public int calpecentage(int a, int b) {
        System.out.println("sum = " + a + " n * 100 /" + b);
        per = (a / b) ;
        return per;

    }

    public void calGrade(double i) {
        if (i >= 90 && i <= 100) {
            System.out.println("You have passed with DISTINCTION ");
        } else if (i >= 80 && i < 90) {
            System.out.println("You have passed withA GRADE ");
        } else if (i >= 60 && i < 80) {
            System.out.println("You have passed with B GRADE ");
        } else if (i >= 40 && i < 60) {
            System.out.println("You have passed with C GRADE ");
        } else {
            System.out.println("failed the exam ");
        }

    }

    public void fetchResults() {
        Exams e = new Exams();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of subjects: ");
        int n = sc.nextInt();
        int sum = 0;
        int[] res = new int[n];

        System.out.println("Enter the MARKS of students: ");

        for (int i = 0; i < n; i++) {
            System.out.print("ENTER THE MARKS OF SUBJECT " + i + " : ");
            res[i] = sc.nextInt();
            sum = sum + res[i];
        }
        System.out.println(Arrays.toString(res) + "\nTotal Marks obtained: "+ sum );
        System.out.println("Your percentage is : " + e.calpecentage(sum, n));
        e.calGrade(e.per);
        sc.close();
    }
}