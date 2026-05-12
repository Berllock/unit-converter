package unit_converter.web.service;

import org.junit.jupiter.api.Test;
import unit_converter.web.model.LengthUnit;
import unit_converter.web.model.TemperatureUnit;
import unit_converter.web.model.WeightUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConversionServiceTest {

    private final ConversionService conversionService = new ConversionService();

    private final Double DELTA = 0.001;

    @Test
    void shouldConvertFahrenheitToCelsius() {

        double resultFtoC = conversionService.convertTemperature(
                32,
                TemperatureUnit.FAHRENHEIT,
                TemperatureUnit.CELSIUS);

        assertEquals(0, resultFtoC, DELTA);
    }

    @Test
    void shouldConvertCelsiusToFahrenheit() {
        double resultCtoF = conversionService.convertTemperature(
                0,
                TemperatureUnit.CELSIUS,
                TemperatureUnit.FAHRENHEIT);

        assertEquals(32, resultCtoF, DELTA);
    }

    @Test
    void shouldConvertCelsiusToKelvin() {

        double resultCtoK = conversionService.convertTemperature(
                0,
                TemperatureUnit.CELSIUS,
                TemperatureUnit.KELVIN);

        assertEquals(273.15, resultCtoK, DELTA);
    }

    @Test
    void shouldConvertKilometersToMeters() {
        double resultKmToM = conversionService.convertLength(
                1,
                LengthUnit.KILOMETER,
                LengthUnit.METER
        );

        assertEquals(1000, resultKmToM, DELTA);
    }

    @Test
    void shouldConverGramsToKilograms() {
        double resultGToKg = conversionService.convertWeight(
                1000,
                WeightUnit.GRAM,
                WeightUnit.KILOGRAM);

        assertEquals(1, resultGToKg, DELTA);
    }

}
