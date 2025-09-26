package com.exercicios.desafio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor da compra:");
        double valorCompra = scanner.nextDouble();

        String resultado = ExplorandoSintaxeLogicaDesafio2.calcularDesconto(valorCompra);
        System.out.println(resultado);

        scanner.close();
    }
}
