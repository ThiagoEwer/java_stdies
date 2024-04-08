package Listas;

//import java.util.List;
import java.util.Scanner;

public class Menu3 {
    public static void menu() {
        System.out.println("=========== LISTA DE EXERCICIOS 3 =============");
        System.out.println(" 1 - Array 1");
        System.out.println(" 2 - Array 2");
        System.out.println(" 3 - Array 3");
        System.out.println(" 4 - Array 4");
        System.out.println(" 5 - Array 5");
        System.out.println(" 6 - Array 6");
        System.out.println(" 7 - Array 7");
        System.out.println(" 8 - Matriz 8");
        System.out.println(" 9 - Matriz 9");
        System.out.println(" 10 - ArrayList 10");
        System.out.println(" 11 - ArrayList 11");
        System.out.println(" 12 - ArrayList 12");
        System.out.println(" 13 - ArrayList 13");
        System.out.println(" 14 - ArrayList 14");
        System.out.println("------------------------------------------------");
        System.out.println("Digite um numero de um exercicio escolhido: ");

        Scanner inputTeclado = new Scanner(System.in);
        int exercSelecionado = inputTeclado.nextInt();

        switch (exercSelecionado) {
            case 1:
                Lista3.Array1();
                break;
            case 2:
                Lista3.Array2();
                break;
            case 3:
                Lista3.Array3();
                break;
            case 4:
                Lista3.Array4();
                break;
            case 5:
                Lista3.Array5();
                break;
            case 6:
                Lista3.Array6();
                break;
            case 7:
                Lista3.Array7();
                break;
            case 8:
                Lista3.Matriz1();
                break;
            case 9:
                Lista3.Matriz2();;
                break;
            case 10:
                Lista3.ArrayList1();
                break;
            case 11:
                Lista3.ArrayList2();
                break;
            case 12:
                Lista3.ArrayList3();
                break;
            case 13:
                Lista3.ArrayList4();
                break;
            case 14:
                Lista3.ArrayList5();
                break;

            default:
                System.out.println("OPCAO INVALIDA!");
        }
        inputTeclado.close();
    }
}
