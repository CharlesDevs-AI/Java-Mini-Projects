import java.util.Scanner;

public class QuizApplication {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int score = 0;

        System.out.println("========== JAVA QUIZ ==========");

        // Question 1
        System.out.println("\n1. Java is a?");
        System.out.println("A. Programming Language");
        System.out.println("B. Database");
        System.out.println("C. Operating System");
        System.out.println("D. Browser");
        System.out.print("Answer: ");
        char q1 = Character.toUpperCase(sc.next().charAt(0));

        if (q1 == 'A')
            score++;

        // Question 2
        System.out.println("\n2. Which keyword is used to create an object?");
        System.out.println("A. class");
        System.out.println("B. new");
        System.out.println("C. static");
        System.out.println("D. import");
        System.out.print("Answer: ");
        char q2 = Character.toUpperCase(sc.next().charAt(0));

        if (q2 == 'B')
            score++;

        // Question 3
        System.out.println("\n3. Which method is the entry point of a Java program?");
        System.out.println("A. start()");
        System.out.println("B. run()");
        System.out.println("C. main()");
        System.out.println("D. execute()");
        System.out.print("Answer: ");
        char q3 = Character.toUpperCase(sc.next().charAt(0));

        if (q3 == 'C')
            score++;

        // Question 4
        System.out.println("\n4. Java is developed by?");
        System.out.println("A. Microsoft");
        System.out.println("B. Google");
        System.out.println("C. Sun Microsystems");
        System.out.println("D. Apple");
        System.out.print("Answer: ");
        char q4 = Character.toUpperCase(sc.next().charAt(0));

        if (q4 == 'C')
            score++;

        // Question 5
        System.out.println("\n5. Which symbol ends a Java statement?");
        System.out.println("A. :");
        System.out.println("B. .");
        System.out.println("C. ;");
        System.out.println("D. ,");
        System.out.print("Answer: ");
        char q5 = Character.toUpperCase(sc.next().charAt(0));

        if (q5 == 'C')
            score++;

        System.out.println("\n========== RESULT ==========");
        System.out.println("Score : " + score + " / 5");

        if (score == 5)
            System.out.println("Excellent!");
        else if (score >= 3)
            System.out.println("Good Job!");
        else
            System.out.println("Keep Practicing!");

        sc.close();
    }
}