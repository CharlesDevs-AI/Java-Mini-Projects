import java.util.Scanner;

public class Stopwatch {

    public static void main(String[] args) throws InterruptedException {

        Scanner sc = new Scanner(System.in);

        System.out.println("========== STOPWATCH ==========");
        System.out.println("Press ENTER to Start...");
        sc.nextLine();

        long startTime = System.currentTimeMillis();

        System.out.println("Stopwatch Started...");
        System.out.println("Press ENTER to Stop...");
        sc.nextLine();

        long endTime = System.currentTimeMillis();

        long elapsed = endTime - startTime;

        long seconds = elapsed / 1000;
        long minutes = seconds / 60;
        long hours = minutes / 60;

        seconds %= 60;
        minutes %= 60;

        System.out.println("\n========== RESULT ==========");
        System.out.printf("Elapsed Time : %02d:%02d:%02d%n",
                hours, minutes, seconds);

        sc.close();
    }
}