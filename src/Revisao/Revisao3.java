package Revisao;

import java.util.Scanner;

public class Revisao3 {

    public static void ParserConvert() {
        System.out.println("Insira suas 3 notas");
        Scanner tec = new Scanner(System.in);
        // metodo parse usado para conversão de dados
        String n1 = tec.nextLine();
        String n2 = tec.nextLine();
        String n3 = tec.nextLine();

        int nota1 = Integer.parseInt(n1);
        int nota2 = Integer.parseInt(n2);
        int nota3 = Integer.parseInt(n3);

        int media = (nota1 + nota2 + nota3) / 3;

        System.out.println("Sua média é: " + media);

        tec.close();
    }

    public static void Ifelse() {
        int i = 10;
        if (i > 9) {
            System.out.println("O valor de i é: " + i);
        }
    }

    public static void OpTernario() {
        int i = 10;
        int y = 9;

        int maior = (i > y) ? i : y;

        System.out.println("O numero maior é: " + maior);
    }

    public static void PodeDirigir() {
        System.out.println("Insira sua idade:");
        Scanner tec = new Scanner(System.in);
        int idade = tec.nextInt();

        String mensagem = (idade >= 19) ? "Pode Dirigir" : "Não Pode Dirigir, menino novo";
        System.out.println(mensagem);
        tec.close();
    }

    public static void MaiorMenor() {
        System.out.println("Insira um numero:");
        Scanner tec = new Scanner(System.in);

        double val = tec.nextDouble();

        if (val > 0) {
            System.out.println("Valor é maior que Zero");
        } else if (val < 0) {
            System.out.println("Valor é menor que zero");
        } else {
            System.out.println("Digitou 0");
        }
        tec.close();
    }

}
