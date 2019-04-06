package com.daehosting;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureConversionsTest {

    @Test
    void getTemperatureConversionsSoap() {
        TemperatureConversionsSoapType service = new TemperatureConversions().getTemperatureConversionsSoap12();
        BigDecimal result = service.fahrenheitToCelsius(BigDecimal.valueOf(32));
        assertEquals(BigDecimal.valueOf(0), result);
    }

    @Test
    void getTemperatureConversionsSoap1() {
        TemperatureConversionsSoapType service = new TemperatureConversions().getTemperatureConversionsSoap12();
        BigDecimal result = service.windChillInFahrenheit(BigDecimal.valueOf(50), BigDecimal.valueOf(32));
        assertEquals(BigDecimal.valueOf(18.75848), result);
    }

    @Test
    void getTemperatureConversionsSoap12() {
        TemperatureConversionsSoapType service = new TemperatureConversions().getTemperatureConversionsSoap12();
        BigDecimal result = service.celsiusToFahrenheit(BigDecimal.valueOf(0));
        assertEquals(BigDecimal.valueOf(32), result);
    }

    @Test
    void getTemperatureConversionsSoap121() {
        TemperatureConversionsSoapType service = new TemperatureConversions().getTemperatureConversionsSoap12();
        BigDecimal result = service.windChillInCelsius(BigDecimal.valueOf(0), BigDecimal.valueOf(0));
        assertEquals(BigDecimal.valueOf(1.41), result);
    }
}