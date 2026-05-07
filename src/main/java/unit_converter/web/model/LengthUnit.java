package unit_converter.web.model;

public enum LengthUnit {

    MILLIMETER(0.001),
    CENTIMETER(0.01),
    METER(1.0),
    KILOMETER(1000.0),
    INCH(0.0254),
    FOOT(0.3048),
    YARD(0.9144),
    MILE(1609.34);

    private final double metersFactor;

    LengthUnit(double metersFactor) {
        this.metersFactor = metersFactor;
    }

    public double toBase(double value) {
        return value * metersFactor;
    }

    public double fromBase(double baseValue) {
        return baseValue / metersFactor;
    }
}
