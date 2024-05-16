import java.util.InputMismatchException;
import java.util.Scanner;

public class ex004 {
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

                entradaValida = true; // Se chegamos até aqui sem lançar uma exceção, a entrada é válida
            } catch (InputMismatchException e) {
                System.out.println("Insira um NÚMERO válido!");
                r.next(); // Limpar o buffer de entrada para evitar um loop infinito
            }
        }

        r.close();
    }
}
