package unit_converter.web.dtos;

import jakarta.validation.constraints.NotNull;
import unit_converter.web.model.WeightUnit;


public class WeightConversionForm {
    
    @NotNull(message = "O valor é obrigatório")
    private Double value;

    @NotNull(message = "Selecione a unidade de origem")
    private WeightUnit fromValue;

    @NotNull(message = "Selecione a unidade de destino")
    private WeightUnit toValue;

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public WeightUnit getFromValue() {
        return fromValue;
    }

    public void setFromValue(WeightUnit fromValue) {
        this.fromValue = fromValue;
    }

    public WeightUnit getToValue() {
        return toValue;
    }

    public void setToValue(WeightUnit toValue) {
        this.toValue = toValue;
    }

}