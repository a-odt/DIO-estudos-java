package Exercícios;

public class exMetodos2 {

    // Método que verifica se um número é par usando if e else
    public boolean ePar(int numero) {
        if (numero % 2 == 0 ) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        exMetodos2 np = new exMetodos2();
        boolean resultado1 = np.ePar(4);  // Chama o método com o número 4
        System.out.println("O número 4 é par? " + resultado1);

        boolean resultado2 = np.ePar(7);  // Chama o método com o número 7
        System.out.println("O número 7 é par? " + resultado2);

    }
}
