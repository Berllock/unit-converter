package unit_converter.web.service;

import org.junit.jupiter.api.Test;
import unit_converter.web.model.TemperatureUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConversionServiceTest {

    private final ConversionService conversionService = new ConversionService();

    private final Double delta = 0.001;

    @Test
    void shouldConvertFahrenheitToCelsius() {

        double resultFtoC = conversionService.convertTemperature(
                32,
                TemperatureUnit.FAHRENHEIT,
                TemperatureUnit.CELSIUS);

        assertEquals(0, resultFtoC, delta);
    }

    @Test
    void shouldConvertCelsiusToFahrenheit() {
        double resultCtoF = conversionService.convertTemperature(
                0,
                TemperatureUnit.CELSIUS,
                TemperatureUnit.FAHRENHEIT);

        assertEquals(32, resultCtoF, delta);
    }

    @Test
    void shouldConvertCelsiusToKelvin() {

        double resultCtoK = conversionService.convertTemperature(
                0,
                TemperatureUnit.CELSIUS,
                TemperatureUnit.KELVIN);

        assertEquals(273.15, resultCtoK, delta);
    }

}
