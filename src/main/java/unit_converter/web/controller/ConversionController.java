package unit_converter.web.controller;

import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import unit_converter.web.dtos.LengthConversionForm;
import unit_converter.web.model.LengthUnit;
import unit_converter.web.model.TemperatureUnit;
import unit_converter.web.model.WeightUnit;
import unit_converter.web.service.ConversionService;

@Controller
public class ConversionController {

    private final ConversionService conversionService;

    public ConversionController(ConversionService conversionService) {
        this.conversionService = conversionService;
    }

    @GetMapping("/length")
    public String showLengthPage(Model model) {
        model.addAttribute("units", LengthUnit.values());
        model.addAttribute("form", new LengthConversionForm());
        return "length";
    }

    @PostMapping("/length")
    public String convertLength(
            @Valid @ModelAttribute("form") LengthConversionForm form,
            BindingResult bindingResult,
            Model model){

        model.addAttribute("units", LengthUnit.values());

        if (bindingResult.hasErrors()) {
            return "length";
        }

        double result = conversionService.convertLength(
                form.getValue(),
                form.getFromValue(),
                form.getToValue());

        model.addAttribute("result", result);

        return "length";
    }

    @GetMapping("/weight")
    public String showWeightPage(Model model) {
        model.addAttribute("units", WeightUnit.values());
        model.addAttribute("form", new WeightConversionForm());
        return "weight";
    }

    @PostMapping("/weight")
    public String convertWeight(
            @Valid @ModelAttribute("form") WeightConversionForm form,
            BindingResult bindingResult,
            Model model) {
        
        model.addAttribute("units", WeightUnit.values());
            

        if (bindingResult.hasErrors()) {
            return "weight";  
        }

        double result = conversionService.convertWeight(
                value,
                fromValue,
                toValue);

        model.addAttribute("result", result);

        return "weight";
    }

    @GetMapping("/temperature")
    public String showTemperaturePage(Model model) {
        model.addAttribute("units", TemperatureUnit.values());
        model.addAttribute("form", new TemperatureConversionForm());
        return "temperature";
    }

    @PostMapping("/temperature")
    public String convertTemperature(
            @Valid @ModelAttribute("form") TemperatureConversionForm from,
            BindingResult bindingResult,
            Model model) {
        
        model.addAttribute("units", TemperatureUnit.values());

        if (bindingResult.hasErrors()) {
            return "temperature";
        }

        double result = conversionService.convertTemperature(
                value,
                fromValue,
                toValue);

        model.addAttribute("result", result);

        return "temperature";
     }

}
