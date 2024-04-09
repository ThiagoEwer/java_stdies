package Revisao;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class Revisao1 {
    public static void Soma() {
        System.out.println("Insira dois numeros inteiros");
        Scanner teclado = new Scanner(System.in);

        float val1 = teclado.nextFloat();
        Float val2 = teclado.nextFloat();

        Float soma = val2 + val1;

        System.out.println("A soma é: " + soma);
        teclado.close();

    }

    public static void DataHora() {
        LocalDate dataAtual = LocalDate.now();
        LocalTime horaAtual = LocalTime.now();
        LocalDateTime dataEhora = LocalDateTime.now();
        System.out.println("Data:" + dataAtual);
        System.out.println("Hora:" + horaAtual);
        System.out.println("Data e Hora:" + dataEhora);

    }

    public static void CastingExemplo() {

        int i = 9; // valor setado da variavel
        float f = (float) i; // conversao de inteiro para float atribuindo o valor inteiro para uma variavel
                             // float
        System.out.println(f); // imprimirá 9.0

        double d = 9.99;
        int a = (int) d;
        System.out.println(a); // imprimirá 9

        // COERSÃO IMPLICITA o compilador converte solo
        int q = 9;
        double w = q;
        System.out.println(w); // imprimirá 9.0

        // COERSÃO EXPLICITA ou Casting precisa da intervensção do DEV
        double r = 9.99;
        int t = (int) r;
        System.out.println(t); // imprimirá 9

    }

    public static void SalarioMinimo() {
        final float salario2024 = 1412;
        System.out.println("Insira o valor do seu salario:");
        Scanner tec = new Scanner(System.in);
        float salarioUser = tec.nextFloat();

        float difSalario = salarioUser - salario2024;
        System.out.println("A diferença salarial é de :" + difSalario);
        tec.close();
    }
}
