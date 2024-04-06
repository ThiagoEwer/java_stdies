package Revisao;

import java.util.Scanner;

public class MenuR {

    public static void MenuRevisao() {
        System.out.println(" ------------------DIGITE O NUMERO DA REVISÃO SELECIONADA --------------------");
        System.out.println("1 -Revisao1 SOMA");
        System.out.println("2 -Revisao1 DATA E HORA");
        System.out.println("3 -Revisao1 CASTING");
        System.out.println("4 -Revisao1 Salario Minimo");
        System.out.println("5 -Revisao2 Classe Math");
        System.out.println("6 -Revisao2 Classe Random");
        System.out.println("7 -Revisao2 Calculo Gravidade6");

        Scanner inputTeclado = new Scanner(System.in);
        int exercSelecionado = inputTeclado.nextInt();

        switch (exercSelecionado) {
            case 1:
                Revisao1.Soma();
                break;
            case 2:
                Revisao1.DataHora();
                ;
                break;
            case 3:
                Revisao1.CastingExemplo();
                ;
                break;
            case 4:
                Revisao1.SalarioMinimo();
                ;
                break;
            case 5:
                Revisao2.Math();
                ;
                break;
            case 6:
                Revisao2.MathRandom();;
                ;
                break;
            case 7:
                Revisao2.Gravidade();;
                ;
                break;

            default:
                break;
        }
        inputTeclado.close();
    }
}
