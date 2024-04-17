package Revisao;

import java.util.Random;
import java.util.Scanner;

public class Revisao4 {
    public static void Cardapio() {
        System.out.println("Escolha o que vai consumir");
        System.out.println("COD -- CARDAPIO  -- VALOR");
        System.out.println("0 -- Cachorro Quente -- R$5,00");
        System.out.println("1 -- Pastel de Frango -- R$7,00");
        System.out.println("2 -- Coxinha de Atum -- R$3,00");

        Scanner tec = new Scanner(System.in);

        int cod = tec.nextInt();
        int qtd = tec.nextInt();

        switch (cod) {
            case 0:
                System.out.println("Cachorro Quente");
                System.out.println("TOTAL " + (5 * qtd));
                break;
            case 1:
                System.out.println("Pastel de Frango");
                System.out.println("TOTAL " + (7 * qtd));
                break;
            case 2:
                System.out.println("Coxinha de Atum");
                System.out.println("TOTAL " + (3 * qtd));
                break;

            default:
                System.out.println("OPÇÃO INVÁLIDA");
                break;
        }
        tec.close();

    }

    public static void Calc() {
        Scanner tec = new Scanner(System.in);
        System.out.println("Digite dois numeros");
        double n1 = tec.nextDouble();
        double n2 = tec.nextDouble();

        System.out.println("Qual o tipo de operação você deseja ?");
        System.out.println("1 -Adição +");
        System.out.println("2 -Subtração -");
        System.out.println("3 -Multiplicação *");
        System.out.println("4 - Divisão /");

        int cod = tec.nextInt();

        switch (cod) {
            case 1:
                System.out.println("Adição");
                System.out.println("A soma é: " + (n1 + n2));
                break;
            case 2:
                System.out.println("Subtração");
                System.out.println("A subtração é: " + (n1 - n2));
                break;
            case 3:
                System.out.println("Multiplicação");
                System.out.println("A Multiplicação é: " + (n1 * n2));
                break;
            case 4:
                System.out.println("Divisão");
                System.out.println("A divisão é: " + (n1 / n2));
                break;

            default:
                System.out.println("Opção invalida");
                break;
        }

        tec.close();

    }

    public static void StringMetodos() {
        // substring(n,n) "Filtra" uma palavra semelhante ao EXT do excel onde o primero
        // n é inicio e o segundo n é quantidade de caracteres
        // indexOF() "A partir de:" vai mostrar o NUMERO do registro do indice
        // lastIndexOf(Pega o ultimo) vai mostrar o ultimo Numero do registro do indice
        // lengh() - Percorre todo o indice da String(conta quantos caracteres tem na

        String str = "Programação";
        String sub = str.substring(0, 5);
        System.out.println(sub); // Isto irá imprimir "Progr"

        String str2 = "Programação";
        int first = str2.indexOf('a');
        int last = str2.lastIndexOf('a');
        System.out.println(first); // Isto irá imprimir 3
        System.out.println(last); // Isto irá imprimir 7

        String str3 = "Programação";
        int len = str3.length();
        System.out.println(len); // Isto irá imprimir 11

    }

    public static void CapturaNome() {
        System.out.println("Insira seu nome");
        Scanner tec = new Scanner(System.in);

        Random aleatorio = new Random();

        Double numero = aleatorio.nextDouble();

        String nome = tec.nextLine();

        String pNome = nome.substring(0, nome.indexOf(" "));

        String uNome = nome.substring(0, nome.lastIndexOf(" ") + 1);

        System.out.println("Nome completo: " + nome);
        System.out.println("Primeiro Nome" + pNome);
        System.out.println("Ultimo Nome: " + uNome);
        System.out.println("O numero aleatorio gerado foi" + numero);
        tec.close();
    }
}
