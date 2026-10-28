public class Dessert extends AbstractDish {
    public Dessert(String name, double weight) { super(name, weight); }
    @Override
    public double price() { return getWeight() * 2.5; }
}
