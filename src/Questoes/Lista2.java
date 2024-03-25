package Questoes;

import java.util.Scanner;

public class Lista2 {
    public static void Fibonacci_1() {
        System.out.println("Escolha um numero inteiro para gerar a sequencia de fibonacci");
          Scanner teclado = new Scanner(System.in);
          int numero = teclado.nextInt();

            int t1 = 0;
            int t2 = 1;

            System.out.print("Até " + numero + ": ");
            for (int i = 1; i <= numero; ++i) {
                System.out.print(t1 + " + ");
                int soma = t1 + t2;
                t1 = t2;
                t2 = soma;
            }
    }
    public static void Fibonacci_2(){

    }
    public static void Fatorial () {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número para calcular o fatorial: ");
        int numero = teclado.nextInt();
        long fatorial = 1;

        for(int i = 1; i <= numero; ++i) {
            fatorial *= i;
        }
        teclado.close();
        System.out.printf("O fatorial de %d é: %d", numero, fatorial);
    }
}
