package unit_converter.web.service;

import org.springframework.stereotype.Service;
import unit_converter.web.model.LengthUnit;
import unit_converter.web.model.TemperatureUnit;
import unit_converter.web.model.WeightUnit;

@Service
public class ConversionService {

    public double convertLength(final double value,
                                final LengthUnit fromValue,
                                final LengthUnit toValue) {
        double baseValue = fromValue.toBase(value);
        return toValue.fromBase(baseValue);
    }

    public double convertWeight(final double value,
                               final WeightUnit fromValue,
                               final WeightUnit toValue) {
        double baseValue = fromValue.toBase(value);
        return toValue.fromBase(baseValue);
    }

    public double convertTemperature(final double value,
                                     final TemperatureUnit fromValue,
                                     final TemperatureUnit toValue) {
        double baseValue = fromValue.toBase(value);
        return toValue.fromBase(baseValue);
    }

}
