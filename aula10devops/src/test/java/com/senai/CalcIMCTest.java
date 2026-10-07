package com.senai;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalcIMCTest {

    @Test
    void testarCalculoIMC() {
        CalcIMC calc = new CalcIMC();

        double resultado = calc.calcularIMC(80, 2);

        assertEquals(20.0, resultado);
    }
}