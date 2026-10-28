public class Drink extends AbstractDish implements Packable {
    private final double volume;
    public Drink(String name, double volume) {
        super(name, volume);
        this.volume = volume;
    }
    public double getVolume() { return volume; }
    @Override
    public double price() { return volume * 0.25; }
    @Override
    public double packagingCost() { return 25; }
}
