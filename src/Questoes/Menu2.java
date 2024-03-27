package Questoes;

import java.util.List;
import java.util.Scanner;
public class Menu2 {
        public static void menu2() {
            System.out.println("=========== LISTA DE EXERCICIOS 2 =============");
            System.out.println(" 1 - Fibonacci");
            System.out.println(" 2 - Fibonacci2");
            System.out.println(" 3 - Fatorial");
            System.out.println(" 4 - <> Valor e a soma de N valores");
            System.out.println(" 5 - <> Valor e a soma de N valores2");
            System.out.println("------------------------------------------------");
            System.out.println("Digite um numero de um exercicio: ");


            Scanner inputTeclado = new Scanner(System.in);
            int exercSelecionado = inputTeclado.nextInt();

            switch (exercSelecionado) {
                case 1:
                    Lista2.Fibonacci_1();
                    break;
                case 2:
                    Lista2.Fibonacci_2();
                    break;
                case 3:
                    Lista2.Fatorial();
                    break;
                case 4:
                    Lista2.NumerosMaiorMenorSoma();
                    break;
                case 5:
                    Lista2.NumerosMaiorMenorSoma_2();
                    break;
                case 6:
                    break;
                default:
                    System.out.println("OPCAO INVALIDA!");
            }
                inputTeclado.close();
        }
}
