package Exercícios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ex004 {
    public static void main(String[] args) {
        Scanner u = new Scanner(System.in);
        boolean entradaCorreta = false; //

        //cria um ‘loop’ e só para de reproduzir caso dê uma entrada válida
        while (!entradaCorreta) {
            try {
                System.out.print("Qual é o raio do círculo? ");
                double r = u.nextDouble();

                // resultado:
                System.out.println("A circunferência deste círculo é de: " + (2 * Math.PI * r));
                System.out.println("A área deste círculo é de: " + (Math.pow(r, 2) * Math.PI));

                // Entrada válida, sai do ‘loop’
                entradaCorreta = true;
            } catch (InputMismatchException e) {
                System.out.println("Isso não é um número! Tente novamente: ");// entradad de erro!
                u.next();
            }
        }
        u.close();
    }
}
// "!" inverte o valor da variável booleana, torna-se true. Ao escrever "entradaCorreta = true", o operador
// inverta novamente, tornando-a em falsa, assim encerrando o loop.