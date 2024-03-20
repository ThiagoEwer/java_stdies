package Questoes;

import com.sun.tools.jconsole.JConsoleContext;

import java.util.Scanner;

public class Questoes2 {
    //void é uma funcao que nao retorna nada.
    //no caso abaixo, usaremos uma função do tipo String e não void para retornar um texto.

    /*public static String meuMetodo() {
        return "Olá do mundo do Meu Método";
    }*/
   /* public static void Aula5Exerc1() {
        //
        String retorno = meuMetodo();
    }*/
    public static void Aula5Exerc2() {
        for (int i = 0; i <= 300; i++) {
            System.out.print(i + " "); // RETIRADO O LN para imprimir os numeros lateralmente.
        }
    }

    public static void Aula5Exerc3() {
        //nesse caso, o decremento vai ser de dois em dois
        for (int i = 30; i > 0; i -= 2) {
            System.out.print(i + " ");
        }
    }

    public static void Aula5Exerc4() {
        Scanner teclado = new Scanner(System.in);
        float acumulador = 0;
        int quantidadeNumeros = 10;
        for (int i = 1; i <= quantidadeNumeros; i++) {
            System.out.printf("informe o numero %d\n", i);
            acumulador += teclado.nextFloat();
        }
        System.out.println(acumulador / quantidadeNumeros);

    }

     public static void Aula5Exerc5() {
         Scanner teclado = new Scanner(System.in);
         System.out.print("Digite um número inteiro não negativo: ");

         int numero = teclado.nextInt();

         int fatorial = 1;
         for (int i = 0; i <= numero; i++) {
             fatorial *= i;
             System.out.print(i);
         }
         System.out.println(" O fatorial de "+ numero+ " é: " + fatorial);

     }

     /*
    public static int fatorial(int numero) {
        int fat = 1;
        for (int i = numero; i > 0; i--) {
            fat *= i;
        }
        return fat;
        }
      */
}