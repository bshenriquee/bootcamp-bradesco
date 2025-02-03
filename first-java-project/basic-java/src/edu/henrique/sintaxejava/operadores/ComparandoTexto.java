package edu.henrique.sintaxejava.operadores;

public class ComparandoTexto {
    public static void main(String[] args) {
        
        String nomeUm = "HENRIQUE";
        String nomeDois = "HENRIQUE";

        System.out.println(nomeUm == nomeDois);

        String nomeTres = new String("HENRIQUE");

        System.out.println(nomeUm == nomeTres);

        // Para String e objetos, comparamos utilizando o método "equals"

        System.out.println(nomeDois.equals(nomeTres));
    }
    
}
