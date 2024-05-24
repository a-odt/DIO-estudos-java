package Exercícios;

// métodos
public class ex007 {
    public static String verificar(int a) {
        if (a > 0) {
            return "verdadeiro";
        } else {
            return "falso";
        }
    }

    public static void main(String[] args) {
        ex007 eP = new ex007();
        String resul = verificar(-5);
        System.out.println("o número 23 é positivo? " + resul);

    }
}

