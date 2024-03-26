package com.mycompany.calculadora;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraJUNITTESTTest {
    
    @Test
    public void testSoma() {
        calculadora calc = new calculadora();
        
        // Cenário de teste 1: Soma de dois valores
        assertEquals(10, calc.somar(3, 7));
        
        // Cenário de teste 2: Soma de um valor com zero
        assertEquals(3, calc.somar(3, 0));
        
        // Cenário de teste 3: Soma de zero com zero
        assertEquals(0, calc.somar(0, 0));
        
        // Cenário de teste 4: Soma de um valor com um negativo
        assertEquals(2, calc.somar(3, -1));
    }
    
    @Test
    public void testSubtracao(){
        calculadora calc = new calculadora();
        
        // Cenário de teste 1: Subtração de dois valores
        assertEquals(5, calc.subtracao(10, 5));
        
        // Cenário de teste 2: Subtração de um valor com zero
        assertEquals(8, calc.subtracao(8, 0));
        
        // Cenário de teste 3: Subtração de um negativo com outro negativo
        assertEquals(-2, calc.subtracao(-5, -3));
    }
    
    @Test
    public void testMultiplicacao(){
        calculadora calc = new calculadora();
        
        // Cenário de teste 1: Multiplicação de dois valores
        assertEquals(24, calc.multiplicacao(4, 6));
        
        // Cenário de teste 2: Multiplicação de um valor por zero
        assertEquals(0, calc.multiplicacao(9, 0));
        
        // Cenário de teste 3: Multiplicação de dois negativos
        assertEquals(14, calc.multiplicacao(-7, -2));
    }
    
    @Test
    public void testDivisao(){
        calculadora calc = new calculadora();
        
        // Cenário de teste 1: Divisão de dois valores
        assertEquals(5.0, calc.divisao(15, 3));
        
        // Cenário de teste 2: Divisão por zero
        assertThrows(ArithmeticException.class, () -> calc.divisao(7, 0));
        
        // Cenário de teste 3: Divisão de dois negativos
        assertEquals(5.0, calc.divisao(-10, -2));
    }
}
