package Operadores;

public class ex005 {
    // Método recebe dois números e retorna a soma deles
    public int somar(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        ex005 obj = new ex005(); // cria um objeto
        int resultado1 = obj.somar(6, 8); // chama o método passado 6 e 8 como parâmetros
        System.out.println("Resultado1: " + resultado1);

        int resultado2 = obj.somar(10, 3); // chama o método passado 10 e 3 como parâmetros
        System.out.println("Resultado2: " + resultado2);
    }
}