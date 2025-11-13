import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of subjects: ");
        int n = sc.nextInt(), total = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Subject " + i + " marks: ");
            total += sc.nextInt();
        }

        double average = (double) total / n;
        char grade = (average >= 90) ? 'A' : (average >= 80) ? 'B' : (average >= 70) ? 'C' : (average >= 60) ? 'D' : 'F';

        System.out.printf("\nTotal Marks: %d\nAverage: %.2f%%\nGrade: %c\n", total, average, grade);
        sc.close();
    }
}