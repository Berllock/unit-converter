package unit_converter.web.model;

public enum WeightUnit {

    MILLIGRAM(0.001, "Miligram", "mg"),
    GRAM(1.0, "Gram", "g"),
    KILOGRAM(1000.0, "Kilogram", "kg"),
    OUNCE(28.3495, "Ounce", "oz"),
    POUND(453.592, "Pound", "lb");

    private final double gramsFactor;
    private final String displayName;
    private final String symbol;

    WeightUnit(final double gramsFactor,
               final String displayName,
               final String symbol){
        this.gramsFactor = gramsFactor;
        this.displayName = displayName;
        this.symbol = symbol;
    }

    public double toBase(double value) {
        return value * gramsFactor;
    }

    public double fromBase(double baseValue) {
        return baseValue / gramsFactor;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getSymbol() {
        return symbol;
    }
}
