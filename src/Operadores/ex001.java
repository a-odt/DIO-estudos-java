package Operadores;


public class ex001 {
    public static void main(String[] args) {

        // Cria duas Strings diferentes com o mesmo conteúdo (mas, são objetos diferentes!)
        String caixaA = new String("Livro");
        String caixaB = new String("Livro");

        // Comparação com == (referências na memória)
        System.out.println(caixaA == caixaB); // false, porque são caixas diferentes

        // Comparação com equals() (conteúdo)
        System.out.println(caixaA.equals(caixaB)); // true, porque o conteúdo das caixas é o mesmo
    }
}


