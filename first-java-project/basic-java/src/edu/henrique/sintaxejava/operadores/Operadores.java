package edu.henrique.sintaxejava.operadores;

public class Operadores {
    /* Classificações:
    * Atribuição: =
    * Aritméticos: +  -  /  *  %   
    * Unário: +  -  ++(incremento)  --(decremento)  !(negação)
    * Ternário: <variavel> = <exp condicional> ? <caso true> : <caso false>
    * Relacionais: ==  !=  >  >=  <  <=
    * Lógicos: &&  ||  
    */  

    String nome = "Henrique";
    int idade = 27;
    double peso = 78.5;
    char sexo = 'M';
    boolean doadorOrgao = true;
    //Data dataNascimento = new Date();

    public static void main(String[] args) {
        int numero = 5;
        numero = -numero;
        System.out.println(numero);
        numero = -numero;
        System.out.println(numero);
        // incrementando
        numero++;
        System.out.println(numero);
        // decrementando
        numero--;
        System.out.println(numero);

        System.out.println("novo teste");
        //incrementando
        System.out.println(numero++); // não vai imprimir incrementado
        System.out.println(numero);
        System.out.println(--numero); // se vier antes, aí já imprime atualizado
        System.out.println(++numero); // se vier antes, aí já imprime atualizado

        System.out.println("Variáveis booleanas:");
        boolean variavel = true;
        System.out.println(variavel);
        System.out.println(!variavel);
        System.out.println(variavel); // não muda permanentemente o valor da variável

        System.out.println("\n");
        System.out.println("Operador ternário:");

        int a = 5, b = 6;
        String resultado = (a == b) ? "é igual" : "não é igual";
        System.out.println(resultado);
/*
        if (a==b)
            resultado = "é igual";
        else
            resultado = "não é igual";          
 */
       

        


    }
}
