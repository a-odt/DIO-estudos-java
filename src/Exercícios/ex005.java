package Exercícios;

import java.util.Scanner;

public class ex005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira um número inteiro: ");
        int num = scanner.nextInt();
        // Verifica se o número armazenado na variável "num1" é divisível por dois
        if (num % 2 == 0) {
            System.out.println("Este número é par!");
        } else {
            System.out.println("Este número é impar!");
        }
        scanner.close();
    }
}
