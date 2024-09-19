public class DepositItemReceiver {
    public DepositItem classifyItem(int slot) {
        switch (slot) {
            case 1:
                return new Can();
            case 2:
                return new Bottle();
            case 3:
                return new Crate();
            default:
                throw new IllegalArgumentException("Invalid slot number");
        }
    }

    public ReceiptBasis createReceiptBasis() {
        return new ReceiptBasis();
    }

    public void printReceipt(ReceiptBasis receiptBasis) {
        ReceiptPrinter receiptPrinter = new ReceiptPrinter();
        receiptPrinter.print(receiptBasis);
    }
}
