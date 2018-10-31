package com.daehosting.temperatureconversions;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class WindChillInFahrenheitTest {
    @Test
    public void getNFahrenheit() throws Exception {
        TemperatureConversionsSoapType service =
                new TemperatureConversions().getTemperatureConversionsSoap12();
        BigDecimal windChill = service.windChillInFahrenheit(BigDecimal.valueOf(5.0), BigDecimal.valueOf(5.0));
        assertEquals(windChill, BigDecimal.valueOf(-4.3195));

    }

}