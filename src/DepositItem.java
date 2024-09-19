public abstract class DepositItem {
    private int number;
    private double value;

    public DepositItem(int number, double value) {
        this.number = number;
        this.value = value;
    }

    public int getNumber() {
        return number;
    }

    public double getValue() {
        return value;
    }
}
