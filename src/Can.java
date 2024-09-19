public class Can extends DepositItem {
    private double weight;
    private String size;

    public Can() {
        super(1, 0.10);
        this.weight = 0.5;
        this.size = "small";
    }

    public double getWeight() {
        return weight;
    }

    public String getSize() {
        return size;
    }
}
