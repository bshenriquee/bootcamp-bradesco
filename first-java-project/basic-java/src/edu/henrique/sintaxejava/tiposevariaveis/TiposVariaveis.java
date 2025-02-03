package edu.henrique.sintaxejava.tiposevariaveis;

public class TiposVariaveis {
    /* 
     * Numéricos inteiros
     * Numéricos decimais
     * Tipos lógicos
     * Caracteres
     * Objetos
     */

     public static void main(String[] args) {
        // Oito tipos primitivos em Java:
        // int, byte, short, long, float, double, boolean, char
        // byte -> 1 byte -> -128 a 127
        // short -> 2 bytes -> -32.768 a 32.767
        // int -> 4 bytes   *mais comum
        // long -> 8 bytes  & precisa colocar o L no final do valor
        // float -> 4 bytes & precisa colocar o F no final do valor
        // double -> 8 bytes *mais comum

        // DICA: CPF e CEP são campos que devem ser armazenados como String, por conta do zero à esquerda

        //byte idade = 27;
        // int idadeNova = idade + 1;
        // byte idadeEm2025 = idadeNova; -- cannot convert from int to byte
        //byte idadeEm2025 = (byte) idadeNova; // utilizado casting

        // VARIÁVEIS X CONSTANTES
        //final int NUMERO_DE_FILHOS = 2;
        //final double VALOR_DE_PI = 3.141592;

        // LÓGICOS
        boolean verdadeiro = true;
        boolean falso = false;

        System.out.println(verdadeiro && falso);
        System.out.println(verdadeiro || falso);

        // CARACTERE
        char mascOuFem = 'M';

        System.out.println(mascOuFem);

        // String 
        String nome = "Henrique";
        System.out.println(nome);

     }
}

