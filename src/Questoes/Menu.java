package Questoes;

import java.util.Scanner;

public class Menu {
    public static void menu() {
        System.out.println("====== BEM VINDO AO MENU DE EXERCICIOS ======");
        System.out.println(" 1 - Descobrir a idade");
        System.out.println(" 2 - Calcula media do aluno");
        System.out.println(" 3 - Eleitor ou nao eleitor");
        System.out.println(" 4 - Detetive e acusado");
        System.out.println(" 5 - Meneu 1");
        System.out.println(" 6 - Menu completo");
        System.out.println(" 7 - Tratando Nomes");
        System.out.println(" 8 - Gerador de Logins e Senhas Automaticos");
        System.out.println("------------------------------------------------");
        System.out.println("Digite um numero de um exercicio: ");


        Scanner inputTeclado = new Scanner(System.in);
        int exercSelecionado = inputTeclado.nextInt();

        switch (exercSelecionado) {
            case 1:
                Questoes.Lista1Numero1();
                break;
            case 2:
                Questoes.Aula3Exerc1();
                break;
            case 3:
                Questoes.Aula3Exerc3();
                break;
            case 4:
                Questoes.Aula3Exerc6();
                break;
            case 5:
                Questoes.Aula4Exerc1();
                break;
            case 6:
                Questoes.Aula4Exerc2();
                break;
            case 7:
                Questoes.Aula4Exerc3();
                break;
            case 8:
                Questoes.Aula4Exerc4();
                break;
            default:
                System.out.println("OPCAO INVALIDA!");
        }

        inputTeclado.close();
    }
}
