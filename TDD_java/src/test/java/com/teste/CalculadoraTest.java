package com.teste;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class CalculadoraTest {

    @Test
    void soma() {
        Calculadora calc = new Calculadora();
        int soma = calc.soma("1+1+3");
        assertEquals(5, soma);//Assert e usado para conferir se o valor bateu
    }

    @Test
    public void testeSomarComMock() {
        Calculadora calculadora = mock(Calculadora.class);

        when(calculadora.soma("1+2")).thenReturn(3);

        int resultado = calculadora.soma(("1+2"));

        assertEquals(3, resultado);
    }
}