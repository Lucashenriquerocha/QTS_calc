/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadora;

/**
 *
 * @author lucas
 */
public class CalculadoraJUNITTEST {

    public static void main(String[] args) {
        calculadora calc = new calculadora();
        
        //Soma
        //Cenário de teste 1: Soma de dois valores
        int soma = calc.somar(3,7);
        System.out.println(soma);
        
        //Cenário de teste 2: Soma de dois valores sendo um zero
        soma = calc.somar(3,0);
        System.out.println(soma);
        
        // Cenário de teste 3: Soma de dois valores sendo que ambos são zero
        soma = calc.somar(0,0);
        System.out.println(soma);
        
        //Cenário de teste 4: Soma de dois valores sendoum negativo
        soma = calc.somar(3,-1);
        System.out.println(soma);
        
        //Subtração
        // Cenário de teste 1: Subtração de dois valores
        int subtracao = calc.subtracao(10, 5);
        System.out.println("Subtração: " + subtracao);
        
        // Cenário de teste 2: Subtração de dois valores sendo um zero
        subtracao = calc.subtracao(8, 0);
        System.out.println("Subtração: " + subtracao);
        
        // Cenário de teste 3: Subtração de dois valores negativos
        subtracao = calc.subtracao(-5, -3);
        System.out.println("Subtração: " + subtracao);
        
        //Multiplicação
        // Cenário de teste 1: Multiplicação de dois valores
        int multiplicacao = calc.multiplicacao(4, 6);
        System.out.println("Multiplicação: " + multiplicacao);
        
        // Cenário de teste 2: Multiplicação de um valor por zero
        multiplicacao = calc.multiplicacao(9, 0);
        System.out.println("Multiplicação: " + multiplicacao);
        
        // Cenário de teste 3: Multiplicação de dois valores negativos
        multiplicacao = calc.multiplicacao(-7, -2);
        System.out.println("Multiplicação: " + multiplicacao);
        
        //Divisão
        // Cenário de teste 1: Divisão de dois valores
        double divisao = calc.divisao(15, 3);
        System.out.println("Divisão: " + divisao);
        
        // Cenário de teste 2: Divisão por zero
        divisao = calc.divisao(7, 0);
        System.out.println("Divisão: " + divisao);
        
        // Cenário de teste 3: Divisão de dois valores negativos
        divisao = calc.divisao(-10, -2);
        System.out.println("Divisão: " + divisao);
        
    }
}
