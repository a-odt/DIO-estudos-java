package Exercícios;

import java.util.Scanner;

public class ex002 {
    public static void main(String[] args) {
        Scanner temperatura = new Scanner(System.in);
        System.out.print("Insira a temperatura em Celcius: ");
        double C = temperatura.nextDouble();
        double F = (C * 9) /5 + 32;
        System.out.println("A temperatura em Fahrenheit será: " + F + "°F");
        temperatura.close();
    }
}
