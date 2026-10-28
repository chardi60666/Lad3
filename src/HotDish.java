public class HotDish extends AbstractDish implements Packable {
    private final int servingTemperature;
    public HotDish(String name, double weight, int servingTemperature) {
        super(name, weight);
        this.servingTemperature = servingTemperature;
    }
    public int getServingTemperature() { return servingTemperature; }
    @Override
    public double price() { return getWeight() * 1.5 + 80; }
    @Override
    public double packagingCost() { return 40 + getWeight() * 0.25; }
}
