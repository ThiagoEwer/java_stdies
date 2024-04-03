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
        teclado.close();
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

        teclado.close();

        System.out.println("Menor valor: " + menor);
        System.out.println("Maior valor: " + maior);
        System.out.println("Soma dos valores: " + soma);

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
    public static void MediaNNumeros(){
        Scanner teclado = new Scanner(System.in);

        System.out.print("Quantas notas deseja calcular a média? ");
        int n = teclado.nextInt();

        if (n <= 0) {
            System.out.println("Por favor, insira um número inteiro positivo.");
            return;
        }

        double soma = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Digite a nota " + i + ": ");
            double nota = teclado.nextDouble();
            soma += nota;
        }

        double media = soma / n;

        System.out.println("A média das " + n + " notas é: " + media);

        teclado.close();
    }
    public static void MediaIdadeTurma(){
        Scanner teclado = new Scanner(System.in);

        System.out.print("Quantas pessoas na turma? ");
        int n = teclado.nextInt();

        if (n <= 0) {
            System.out.println("Por favor, insira um número inteiro positivo.");
            return;
        }

        int somaIdades = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Digite a idade da pessoa " + i + ": ");
            int idade = teclado.nextInt();
            somaIdades += idade;
        }

        double mediaIdades = (double) somaIdades / n;

        System.out.println("A média de idade da turma é: " + mediaIdades);

        if (mediaIdades >= 0 && mediaIdades <= 25) {
            System.out.println("A turma é jovem.");
        } else if (mediaIdades >= 26 && mediaIdades <= 60) {
            System.out.println("A turma é adulta.");
        } else {
            System.out.println("A turma é idosa.");
        }

        teclado.close();
    }
    public static void MediaAlunoTurma(){
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a quantidade de turmas: ");
        int quantidadeTurmas = teclado.nextInt();

        if (quantidadeTurmas <= 0) {
            System.out.println("Por favor, insira um número inteiro positivo para a quantidade de turmas.");
            return;
        }

        int totalAlunos = 0;

        for (int i = 1; i <= quantidadeTurmas; i++) {
            System.out.print("Digite a quantidade de alunos para a turma " + i + ": ");
            int quantidadeAlunos = teclado.nextInt();

            if (quantidadeAlunos < 0 || quantidadeAlunos > 40) {
                System.out.println("Quantidade inválida de alunos. Por favor, insira um número entre 0 e 40.");
                return;
            }

            totalAlunos += quantidadeAlunos;
        }

        double mediaAlunosPorTurma = (double) totalAlunos / quantidadeTurmas;

        System.out.println("O número médio de alunos por turma é: " + mediaAlunosPorTurma);

        teclado.close();
    }
    public static void ProgramaCDs(){

        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite a quantidade de CDs na coleção: ");
        int quantidadeCDs = teclado.nextInt();

        if (quantidadeCDs <= 0) {
            System.out.println("Por favor, insira um número inteiro positivo para a quantidade de CDs.");
            return;
        }

        double totalInvestido = 0;

        for (int i = 1; i <= quantidadeCDs; i++) {
            System.out.print("Digite o valor investido no CD " + i + ": ");
            double valorCD = teclado.nextDouble();

            if (valorCD < 0) {
                System.out.println("Valor inválido. Por favor, insira um valor não negativo.");
                i--; // Volta para o mesmo CD para que o usuário insira o valor novamente
                continue;
            }

            totalInvestido += valorCD;
        }

        double valorMedioPorCD = totalInvestido / quantidadeCDs;

        System.out.println("O valor total investido na coleção de CDs é: R$ " + totalInvestido);
        System.out.println("O valor médio gasto em cada CD é: R$ " + valorMedioPorCD);

        teclado.close();
    }
    public static void Tabuada(){
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o número para a tabuada: ");
        int numero = teclado.nextInt();

        System.out.print("Digite o valor inicial da tabuada: ");
        int inicio = teclado.nextInt();

        System.out.print("Digite o valor final da tabuada: ");
        int fim = teclado.nextInt();

        System.out.println("Tabuada do número " + numero + " de " + inicio + " a " + fim + ":");

        for (int i = inicio; i <= fim; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        teclado.close();
    }

    }

