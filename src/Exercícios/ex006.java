package Exercícios;

import java.util.Scanner;

public class ex006 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Escreva um número: ");
        int a = s.nextInt();
        System.out.print("Escreva outro número: ");
        int b = s.nextInt();

        //Condição normal (if and else)
        //String resultado = "";
        // if (a == b)
        //resultado = "verdadeiro";
        // else
        // resultado = "falso";

        // Ternário, mais simples e curto (essencialmente a mesma função)
        String resultado = a==b ?"verdadeiro" : "false";
        System.out.println(resultado);
        s.close();
    }
}

