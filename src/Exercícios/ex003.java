package Exercícios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ex003 {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        boolean entradaValida = false;

        while (!entradaValida) {
            try {
                System.out.print("Quanto equivale o comprimento do retângulo? ");
                double l2 = r.nextDouble();
                System.out.print("E a largura? ");
                double l1 = r.nextDouble();

                double r1 = 2 * (l1 + l2);
                double r2 = l1 * l2;

                System.out.println("O perímetro deste retângulo é: " + r1);
                System.out.println("A área deste retângulo é: " + r2);

                entradaValida = true;
            } catch (InputMismatchException e) {
                System.out.println("Insira um NÚMERO!");
                r.next();
            }
        }
        r.close();
    }
}
