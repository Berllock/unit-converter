package unit_converter.web.model;

public enum TemperatureUnit {

    CELSIUS("Celsius", "°C") {
        @Override
        public double toBase(double value) {
            return value + 273.15;
        }
        @Override
        public double fromBase(double baseValue) {
            return baseValue - 273.15;
        }
    },
    FAHRENHEIT("Fahrenheit", "°F"){
        @Override
        public double toBase(double value) {
            return ((value - 32) * 5/9) + 273.15;
        }
        @Override
        public double fromBase(double baseValue) {
            return ((baseValue - 273.15) * 9/5) + 32;
        }
    },
    KELVIN("Kelvin", "K"){
        @Override
        public double toBase(double value) {
            return value;
        }
        @Override
        public double fromBase(double baseValue) {
            return baseValue;
        }
    };

    private final String displayName;
    private final String symbol;

    TemperatureUnit(final String displayName,
                    final String symbol){
        this.displayName = displayName;
        this.symbol = symbol;
    }

    public abstract double toBase(double value);

    public abstract double fromBase(double baseValue);

    public String getDisplayName() {
        return displayName;
    }

    public String getSymbol() {
        return symbol;
    }

}
