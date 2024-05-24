package Operadores;

import java.util.Scanner;
import java.util.InputMismatchException;

public class ex002 {
        public static void main(String[] args) {
            boolean entradaValida = false;
            Scanner scanner = new Scanner(System.in);

            while (!entradaValida) {
                try {
                    System.out.print("Escreva um número: ");
                    double num = scanner.nextDouble();
                    System.out.print("Escreva outro número: ");
                    double num2 = scanner.nextDouble();
                    System.out.print("Escreva mais um número: ");
                    double num3 = scanner.nextDouble();

                    double media = (num + num2 + num3) / 3;

                    System.out.println("A média dos números fornecidos é: " + media);

                    entradaValida = true; // Se não houve exceção, a entrada é válida
                } catch (InputMismatchException e) {
                    System.out.println("Ei, isso não é um número! Tente novamente.");
                    scanner.next(); // Limpa o buffer de entrada
                }
            }

            scanner.close();
        }
    }
