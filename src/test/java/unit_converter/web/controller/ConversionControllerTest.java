package unit_converter.web.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;
import unit_converter.web.model.LengthUnit;
import unit_converter.web.service.ConversionService;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;


@WebMvcTest(ConversionController.class)
public class ConversionControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockitoBean
    private ConversionService conversionService;

    @Test
    void shouldShowLengthPage() throws Exception {
        mockMvc.perform(get("/length"))
                .andExpect(status().isOk())
                .andExpect(view().name("length"))
                .andExpect(model().attributeExists("units"));

    }

    @Test
    void shouldConvertLength() throws Exception {
        when(conversionService.convertLength(
                1.0,
                LengthUnit.KILOMETER,
                LengthUnit.METER
        )).thenReturn(1000.0);

        mockMvc.perform(post("/length")
                        .param("value", "1.0")
                        .param("fromValue", "KILOMETER")
                        .param("toValue", "METER"))
                .andExpect(status().isOk())
                .andExpect(view().name("length"))
                .andExpect(model().attribute("result", 1000.0))
                .andExpect(model().attributeExists("units"))
                .andExpect(model().attribute("value", 1.0))
                .andExpect(model().attribute("selectedFrom", LengthUnit.KILOMETER))
                .andExpect(model().attribute("selectedTo", LengthUnit.METER));
    }
}
