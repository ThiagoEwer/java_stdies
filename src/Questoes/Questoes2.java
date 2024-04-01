package Questoes;
import com.sun.tools.jconsole.JConsoleContext;
import javax.annotation.processing.SupportedSourceVersion;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
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
     public static void Aula6Exerc1 (){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Insira a quantidade de pessoas");
        // int idade = teclado.nextInt();
        int qtdPessoas = teclado.nextInt();

        int [] pessoas = new int[qtdPessoas];

        for(int i=0; i<pessoas.length;i++){
            System.out.printf("Informe a idade %d pessoa: ", i+1);
            pessoas[i]=teclado.nextInt();
        }
        int somatorioIdade = 0;
         for (int pessoa : pessoas) {
             somatorioIdade += pessoa;
         }
        System.out.println("A média de idade é: "+(somatorioIdade/pessoas.length));

    }
    public static void Aula6Exerc2(){
        int [] [] matriz = {
                            {1,2,3},
                            {4,5,6},
                            {7,8,9}
        };
        for(int linha=0; linha <3; linha++){
            for(int coluna=0; coluna<3; coluna++){
                System.out.print(matriz [linha][coluna] + " ");
            }
            System.out.println();
        }

    }
    public static void Aula6Exerc3(){
        int [] [] matriz = new int [5] [10];
        System.out.println(" O numero de linhas da matriz é: "+ matriz.length);
        System.out.println(" O numero de colunas da matriz é: "+ matriz.length);
        }

    public static void Aula6Exerc4(){
        int [] [] matriz = {
                {1,2},
                {3,4},
        };

        int maiorNumero = matriz [0] [0];

        for(int linha=0; linha <2; linha++){
            for(int coluna=0; coluna<2; coluna++){
                System.out.print(matriz [linha][coluna] + " ");
                if(matriz[linha][coluna] > maiorNumero) {
                    maiorNumero = matriz[linha][coluna];
                }
            }
            System.out.println();
        }

        System.out.println("O maior número na matriz é: " + maiorNumero);

    }
    public static void Aula6Exerc5(){
        ArrayList<String> amigos = new ArrayList<String>();
        amigos.add("Thiago");
        amigos.add("Ewerton");
        amigos.add("Daniel");
       // amigos.remove(2);
        System.out.println(amigos);
        System.out.println(amigos.size());
        print(amigos);
    }
    public static void print(ArrayList<String> colecao){
        for(String amigos: colecao){
            System.out.println(amigos);
        }
        System.out.println("-----------------------------");
    }
    public static void MatrizEx(){
        //definindo o tamanho da matriz em 5x5
        int[][] matriz = new int [5][5];

        for(int linha = 0; linha<5;linha++ ){
            for (int coluna = 0; coluna<5;coluna++){
                matriz[linha][coluna]=linha++;
            }
        }

        for (int linha=0; linha<5; linha++){
            System.out.print("|");
            for(int coluna = 0; coluna<5; coluna++) {
                System.out.print(" " + matriz[linha][coluna] + " ");
            }
            System.out.println(" | ");
        }

    }
    public static void MatrizAleatoria(){
        int[][] matriz = new int [9][9];
        Random aleatorio = new Random();


        for (int linha = 0; linha < 9; linha++) {
            for (int coluna = 0; coluna < 9; coluna++) {
                if (matriz[linha][coluna] == 0) {
                    matriz[linha][coluna] = aleatorio.nextInt(9) + 1;
                }
            }
        }

        for (int linha=0; linha<9; linha++){
            System.out.print("|");
            for(int coluna = 0; coluna<9; coluna++) {
                System.out.print(" " + matriz[linha][coluna] + " ");
            }
            System.out.println(" | ");
        }
    }
    public static void MatrizWith_(){
        char[][] matriz = new char[9][9];
        Random aleatorio = new Random();

        for (int linha = 0; linha < 9; linha++) {
            for (int coluna = 0; coluna < 9; coluna++) {
                if (aleatorio.nextInt(2) == 0) { // 50% para gerar o _ ????
                    matriz[linha][coluna] = (char) (aleatorio.nextInt(9) + '1');
                } else {
                    matriz[linha][coluna] = '_';
                }
            }
        }

        // Imprimindo a matriz
        for (int linha = 0; linha < 9; linha++) {
            System.out.print("|");
            for (int coluna = 0; coluna < 9; coluna++) {
                System.out.print(" " + matriz[linha][coluna] + " ");
            }
            System.out.println(" | ");
        }

    }



}