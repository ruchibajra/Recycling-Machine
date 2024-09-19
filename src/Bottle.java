public class Bottle extends DepositItem {
    private double weight;
    private String size;

    public Bottle() {
        super(1, 0.20);
        this.weight = 1.0;
        this.size = "medium";
    }

    public double getWeight() {
        return weight;
    }

    public String getSize() {
        return size;
    }
}
