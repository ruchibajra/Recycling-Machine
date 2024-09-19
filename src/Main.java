import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DepositItemReceiver depositItemReceiver = new DepositItemReceiver();
        ReceiptBasis receiptBasis = new ReceiptBasis();
        CustomerPanel customerPanel = new CustomerPanel(depositItemReceiver, receiptBasis);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of cans to deposit:");
        int cans = scanner.nextInt();
        customerPanel.itemReceived(1, cans);

        System.out.println("Enter the number of bottles to deposit:");
        int bottles = scanner.nextInt();
        customerPanel.itemReceived(2, bottles);

        System.out.println("Enter the number of crates to deposit:");
        int crates = scanner.nextInt();
        customerPanel.itemReceived(3, crates);

        // Print the receipt
        customerPanel.printReceipt();
    }
}
