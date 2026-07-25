import java.util.Scanner;

public class MovieTicketPriceCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final double TICKET_PRICE = 200.0;

        System.out.println("========== MOVIE TICKET PRICE CALCULATOR ==========");

        System.out.print("Enter Customer Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Number of Tickets: ");
        int tickets = sc.nextInt();

        double total = tickets * TICKET_PRICE;
        double discount = 0;

        if (tickets >= 5) {
            discount = total * 0.10;
        }

        double finalAmount = total - discount;

        System.out.println("\n============== BILL ==============");
        System.out.println("Customer Name : " + name);
        System.out.println("Ticket Price  : ₹" + TICKET_PRICE);
        System.out.println("Tickets       : " + tickets);
        System.out.println("Total         : ₹" + total);
        System.out.println("Discount      : ₹" + discount);
        System.out.println("----------------------------------");
        System.out.println("Amount Payable: ₹" + finalAmount);
        System.out.println("==================================");

        sc.close();
    }
}