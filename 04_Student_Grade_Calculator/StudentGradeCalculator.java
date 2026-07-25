import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== STUDENT GRADE CALCULATOR =====");

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Mark 1: ");
        int m1 = sc.nextInt();

        System.out.print("Enter Mark 2: ");
        int m2 = sc.nextInt();

        System.out.print("Enter Mark 3: ");
        int m3 = sc.nextInt();

        System.out.print("Enter Mark 4: ");
        int m4 = sc.nextInt();

        System.out.print("Enter Mark 5: ");
        int m5 = sc.nextInt();

        int total = m1 + m2 + m3 + m4 + m5;
        double average = total / 5.0;

        char grade;

        if (average >= 90)
            grade = 'A';
        else if (average >= 80)
            grade = 'B';
        else if (average >= 70)
            grade = 'C';
        else if (average >= 60)
            grade = 'D';
        else
            grade = 'F';

        System.out.println("\n========== RESULT ==========");
        System.out.println("Student Name : " + name);
        System.out.println("Total Marks  : " + total);
        System.out.println("Average      : " + average);
        System.out.println("Grade        : " + grade);

        sc.close();
    }
}