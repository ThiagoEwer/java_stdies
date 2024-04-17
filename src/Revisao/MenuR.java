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
        System.out.println("7 -Revisao2 Calculo Gravidade");
        System.out.println("8 -Revisao3 Metodo Parse");
        System.out.println("9 -Revisao3 IFelse");
        System.out.println("10 -Revisao3 OpTernario");
        System.out.println("11 -Revisao4 Switch");
        System.out.println("12 -Revisao4 Switch");
        System.out.println("13 -Revisao4 StringMetodos");
        System.out.println("14 -Revisao4 CapcturaNome");
        System.out.println("15 -Revisao5 Laço FOR PARES");
        System.out.println("16 -Revisao5 VariaveisNoFor");
        System.out.println("17 -Revisao5 ForComIF");
        System.out.println("18 -Revisao5 ForFATORIAL");
        System.out.println("19 -Revisao6 Array1");
        System.out.println("20 -Revisao6 forComVetor");
        System.out.println("21 -Revisao6 ForEach");
        System.out.println("22 -Revisao6 Array-SomaMedia");
        System.out.println("23 -Revisao6 Array2");
        System.out.println("24 -Revisao6 Array3");
        System.out.println("24 -Revisao6 ArrayList1");
        System.out.println("24 -Revisao6 ArrayList2");

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
                Revisao2.MathRandom();
                ;
                break;
            case 7:
                Revisao2.Gravidade();
                ;
                break;
            case 8:
                Revisao3.ParserConvert();
                ;
                break;
            case 9:
                Revisao3.PodeDirigir();
                ;
                break;
            case 10:
                Revisao3.OpTernario();
                ;
                break;
            case 11:
                Revisao4.Cardapio();
                ;
                break;
            case 12:
                Revisao4.Calc();
                ;
                break;
            case 13:
                Revisao4.StringMetodos();
                ;
                break;
            case 14:
                Revisao4.CapturaNome();
                ;
                break;
            case 15:
                Revisao5.NumerosPares();
                ;
                break;
            case 16:
                Revisao5.VariaveisComFor();
                ;
                break;
            case 17:
                Revisao5.MaiorIdade();
                ;
                break;
            case 18:
                Revisao5.ForFATORIAL();
                ;
                break;
            case 19:
                Revisao6.Array1();
                ;
                break;
            case 20:
                Revisao6.ForVetor();
                ;
                break;
            case 21:
                Revisao6.ForEach();
                ;
                break;
            case 22:
                Revisao6.ArraySomaMedia();
                ;
                break;
            case 23:
                Revisao6.Array2();
                ;
                break;
            case 24:
                Revisao6.Array3();
                ;
                break;
            case 25:
                Revisao6.ArrayList1();
                ;
                break;
            case 26:
                Revisao6.ArrayList2();
                ;
                break;
            default:
                System.out.println("Opção inexistente");
                break;
        }
        inputTeclado.close();
    }
}
