package unit_converter.web.model;

public enum LengthUnit {

    MILLIMETER(0.001, "Millimeter", "mm"),
    CENTIMETER(0.01, "Centimeter", "cm"),
    METER(1.0, "Meter", "m"),
    KILOMETER(1000.0, "Kilometer", "km"),
    INCH(0.0254, "Inch", "in"),
    FOOT(0.3048, "Foot", "ft"),
    YARD(0.9144, "Yard", "yd"),
    MILE(1609.34, "Mile", "mi");

    private final double metersFactor;
    private final String displayName;
    private final String symbol;

    LengthUnit(final double metersFactor,
               final String displayName,
               final String symbol) {
        this.metersFactor = metersFactor;
        this.displayName = displayName;
        this.symbol = symbol;
    }

    public double toBase(double value) {
        return value * metersFactor;
    }

    public double fromBase(double baseValue) {
        return baseValue / metersFactor;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getSymbol() {
        return symbol;
    }
}
