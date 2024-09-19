import java.util.Scanner;

public class CustomerPanel {
    private DepositItemReceiver depositItemReceiver;
    private ReceiptBasis receiptBasis;

    public CustomerPanel(DepositItemReceiver depositItemReceiver, ReceiptBasis receiptBasis) {
        this.depositItemReceiver = depositItemReceiver;
        this.receiptBasis = receiptBasis;
    }

    public void itemReceived(int slot, int count) {
        for (int i = 0; i < count; i++) {
            DepositItem depositItem = depositItemReceiver.classifyItem(slot);
            receiptBasis.addItem(depositItem);
        }
    }

    public void printReceipt() {
        depositItemReceiver.printReceipt(receiptBasis);
    }
}
