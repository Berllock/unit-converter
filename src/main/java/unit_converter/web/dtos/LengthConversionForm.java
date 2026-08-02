package unit_converter.web.dtos;

import jakarta.validation.constraints.NotNull;
import unit_converter.web.model.LengthUnit;

public class LengthConversionForm {

    @NotNull(message = "O valor é obrigatório")
    private Double value;

    @NotNull(message = "Selecione a unidade de origem")
    private LengthUnit fromValue;

    @NotNull(message = "Selecione a unidade de destino")
    private LengthUnit toValue;

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public LengthUnit getFromValue() {
        return fromValue;
    }

    public void setFromValue(LengthUnit fromValue) {
        this.fromValue = fromValue;
    }

    public LengthUnit getToValue() {
        return toValue;
    }

    public void setToValue(LengthUnit toValue) {
        this.toValue = toValue;
    }
}

