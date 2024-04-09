package Revisao;

import java.util.Scanner;

public class Revisao5 {
    // for = para
    // while = enquanto
    // doWhile = Repita enquantp

    public static void NumerosPares() {
        System.out.println("Digite um numero PAR");
        Scanner tec = new Scanner(System.in);
        int n1 = tec.nextInt();
        for (int i = 0; i <= n1; i += 2) {
            System.out.print(i + " ");
        }
        tec.close();
    }

    public static void VariaveisComFor() {
        Scanner tec = new Scanner(System.in);
        int num;
        int soma = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Digite um numero");
            num = tec.nextInt();
            soma = soma + num;
        }
        System.out.println("Media é: " + soma / 10);
        tec.close();
    }

    public static void MaiorIdade() {
        int idade;
        int maior = 0;

        Scanner tec = new Scanner(System.in);

        for (int i = 0; i <= 10; i++) {
            idade = tec.nextInt();
            System.out.println("Insira a idade: " + idade);

            if (idade > maior) {
                maior = idade;
            }
        }
        System.out.println("A maior idade digitada foi: " + maior);
        tec.close();
    }

    public static void ForFATORIAL() {
        // Não entendi BULHUFAS
        System.out.println("Digite um número para calcular o fatorial:");
        Scanner tec = new Scanner(System.in);
        int n = tec.nextInt();
        int resultado = 1;

        System.out.print(n + "! = ");

        for (int i = n; i > 0; i--) {
            resultado *= i;
            System.out.print(i);
            if (i > 1) {
                System.out.print(" x ");
            }
        }

        System.out.println(" = " + resultado);
        tec.close();

    }

    // FALTAM OS OUTROS LAÇOS

}