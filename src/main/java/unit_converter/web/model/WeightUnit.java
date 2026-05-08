package unit_converter.web.model;

public enum WeightUnit {

    MILIGRAM(0.001),
    GRAM(1.0),
    KILOGRAM(1000.0),
    OUNCE(28.3495),
    POUND(453.592);

    private final double gramsFactor;

    WeightUnit(double gramsFactor){
        this.gramsFactor = gramsFactor;
    }

    public double toBase(double value) {
        return value * gramsFactor;
    }

    public double fromBase(double baseValue) {
        return baseValue / gramsFactor;
    }
}
