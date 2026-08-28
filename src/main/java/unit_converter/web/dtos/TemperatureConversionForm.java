package unit_converter.web.dtos;

import jakarta.validation.constraints.NotNull;
import unit_converter.web.model.TemperatureUnit;

public class TemperatureConversionForm {

    @NotNull(message = "O valor é obrigatório")
    private Double value;

    @NotNull(message = "Selecione a unidade de origem")
    private TemperatureUnit fromValue;

    @NotNull(message = "Selecione a unidade de destino")
    private TemperatureUnit toValue;

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public TemperatureUnit getFromValue() {
        return fromValue;
    }

    public void setFromValue(TemperatureUnit fromValue) {
        this.fromValue = fromValue;
    }

    public TemperatureUnit getToValue() {
        return toValue;
    }

    public void setToValue(TemperatureUnit toValue) {
        this.toValue = toValue;
    }
}
