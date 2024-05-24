package Operadores;

public class ex003 {

    // Método que imprime uma mensagem
    public void imprimirMensagem() {
        System.out.println("Olá, Mundo!");
    }

    public static void main(String[] args) {
        ex003 obj = new ex003();  // Cria um objeto da classe
        obj.imprimirMensagem();  // Chama o método
    }
}

// public void imprimirMensagem(); define um método público que não retorna nada (void) e não recebe parâmetros.
//System.out.println("Olá, Mundo!"); é o corpo do método que imprime "Olá, Mundo!".
//No main, criamos um objeto obj de MinhaClasse e chamamos imprimirMensagem().
