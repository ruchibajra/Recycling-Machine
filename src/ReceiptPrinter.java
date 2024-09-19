public class ReceiptPrinter {
    public void print(ReceiptBasis receiptBasis) {
        System.out.println("Items deposited: " + receiptBasis.getItems().size());
        System.out.println("Total return sum: " + receiptBasis.computeSum());
        for (DepositItem item : receiptBasis.getItems()) {
            System.out.println("Item: " + item.getClass().getSimpleName() + ", Value: " + item.getValue());
        }
    }
}

