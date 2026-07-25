import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DigitalClock {

    public static void main(String[] args) throws InterruptedException {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        System.out.println("========== DIGITAL CLOCK ==========\n");

        while (true) {

            LocalTime time = LocalTime.now();

            System.out.print("\rCurrent Time : " + time.format(formatter));

            Thread.sleep(1000);
        }
    }
}