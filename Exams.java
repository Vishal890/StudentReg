import java.util.Arrays;
import java.util.Scanner;

public class Exams {
    int per;
    public void calpecentage(int a, int b) {
        System.out.println("sum=" + a + "n*100" + b);
        per = (a / b)*100 ;
        System.out.println(per);

    }

    public void calGrade(double i) {
        if (i > 90 || i < 100) {
            System.out.println(" DISTINCTION ");
        } else if (i > 80 || i < 90) {
            System.out.println(" A GRADE ");
        } else if (i > 60 || i < 80) {
            System.out.println(" B GRADE ");
        } else if (i < 60 || i > 40) {
            System.out.println(" C GRADE ");
        } else {
            System.out.println("failed the exam ");
        }

    }

    public static void main(String[] args) {
        Exams e = new Exams();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of subjects: ");
        int n = sc.nextInt();
        int j = 0, sum = 0;
        int[] res = new int[n];

        System.out.println("Enter the MARKS of students: ");

        for (int i = 0; i < n; i++) {
            System.out.println("ENTER THE MARKS OF SUBJECT" + ++j + " :");
            res[i] = sc.nextInt();
            sum = sum + res[i];
        }
        System.out.println(Arrays.toString(res) + sum + n * 100);
        e.calpecentage(sum, n * 100);
        e.calGrade(e.per);
        sc.close();
    }
}
