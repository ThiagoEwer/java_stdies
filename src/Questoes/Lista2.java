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
            System.out.println("Gerar Fibonacci até que o valor seja maior que 500.");
        int t1 = 0;
        int t2 = 1;

        System.out.print("Sequência de Fibonacci: ");
        while (t1 <= 500) {
            System.out.print(t1 + " ");

            int soma = t1 + t2;
            t1 = t2;
            t2 = soma;
     }
    }
    public static void Fatorial () {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número para calcular o fatorial: ");
        int numero = teclado.nextInt();
        long fatorial = 1;

        for(int i = 1; i <= numero; ++i) {
            fatorial *= i;
        }

        System.out.printf("O fatorial de %d é: %d", numero, fatorial);
        teclado.close();
    }
    public static void  NumerosMaiorMenorSoma() {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Quantos números deseja inserir? ");
        int n = teclado.nextInt();

        //lembrar de criar a validação para o numero ser maior que 0
        if (n <= 0) {
            System.out.println("Por favor, insira um número inteiro positivo.");
            return;
        }

        int menor = Integer.MAX_VALUE;
        int maior = Integer.MIN_VALUE;
        int soma = 0;

        System.out.println("Digite os números:");

        for (int i = 0; i < n; i++) {
            int numero = teclado.nextInt();

            if (numero < menor) {
                menor = numero;
            }
            if (numero > maior) {
                maior = numero;
            }
            soma += numero;
        }

        System.out.println("Menor valor: " + menor);
        System.out.println("Maior valor: " + maior);
        System.out.println("Soma dos valores: " + soma);

        teclado.close();
    }
    public static void  NumerosMaiorMenorSoma_2() {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Quantos números deseja inserir? ");
        int n = teclado.nextInt();

        int menor = Integer.MAX_VALUE;
        int maior = Integer.MIN_VALUE;
        int soma = 0;

        System.out.println("Digite os números:");

        for (int i = 0; i < n; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            int numero = teclado.nextInt();

            while (numero < 0 || numero > 1000) {
                System.out.println("Número inválido. Por favor, digite um número entre 0 e 1000.");
                System.out.print("Número " + (i + 1) + ": ");
                numero = teclado.nextInt();
            }

            if (numero < menor) {
                menor = numero;
            }
            if (numero > maior) {
                maior = numero;
            }
            soma += numero;
        }

        System.out.println("Menor valor: " + menor);
        System.out.println("Maior valor: " + maior);
        System.out.println("Soma dos valores: " + soma);

        teclado.close();
    }
    public static void Next(){

    }

    


}
