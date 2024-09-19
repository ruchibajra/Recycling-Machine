import java.util.ArrayList;
import java.util.List;

public class ReceiptBasis {
    private List<DepositItem> items;

    public ReceiptBasis() {
        this.items = new ArrayList<>();
    }

    public void addItem(DepositItem item) {
        items.add(item);
    }

    public double computeSum() {
        double totalSum = 0;
        for (DepositItem item : items) {
            totalSum += item.getValue();
        }
        return totalSum;
    }

    public List<DepositItem> getItems() {
        return items;
    }
}
