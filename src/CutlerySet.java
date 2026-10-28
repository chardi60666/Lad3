public class CutlerySet implements Packable {
    private final String name;
    private final int pieces;
    public CutlerySet(String name, int pieces) {
        this.name = name;
        this.pieces = pieces;
    }
    public String getName() { return name; }
    public int getPieces() { return pieces; }
    @Override
    public double packagingCost() { return pieces * 15.0; }
}
