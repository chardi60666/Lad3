public abstract class AbstractDish implements MenuItem {
    private final String name;
    private final double weight;
    protected AbstractDish(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }
    @Override
    public String getName() { return name; }

    public double getWeight() { return weight; }
}
