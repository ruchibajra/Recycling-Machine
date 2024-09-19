public class Crate extends DepositItem {
    private double weight;
    private String size;

    public Crate() {
        super(1, 0.30);
        this.weight = 2.0;
        this.size = "large";
    }

    public double getWeight() {
        return weight;
    }

    public String getSize() {
        return size;
    }
}
