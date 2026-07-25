import java.util.Scanner;

public class ShoppingBillGenerator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("========== SHOPPING BILL GENERATOR ==========");

        System.out.print("Customer Name: ");
        String customer = sc.nextLine();

        System.out.print("Number of Items: ");
        int n = sc.nextInt();

        double total = 0;

        for (int i = 1; i <= n; i++) {

            System.out.println("\nItem " + i);

            System.out.print("Price (₹): ");
            double price = sc.nextDouble();

            System.out.print("Quantity: ");
            int qty = sc.nextInt();

            total += price * qty;
        }

        double gst = total * 0.18;
        double grandTotal = total + gst;

        System.out.println("\n============= BILL =============");
        System.out.println("Customer : " + customer);
        System.out.printf("Subtotal : ₹%.2f%n", total);
        System.out.printf("GST (18%%): ₹%.2f%n", gst);
        System.out.printf("Grand Total : ₹%.2f%n", grandTotal);
        System.out.println("================================");
        System.out.println("Thank You! Visit Again.");

        sc.close();
    }
}