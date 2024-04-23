package POO.Dado;

import java.util.Scanner;

public class CalcDados {
    public static void Calculo() {
        Scanner tec = new Scanner(System.in);
        Dado d1 = new Dado();
        System.out.println("Escolha os lados do dado");
        int ladoD = tec.nextInt();
        d1.setLados(ladoD);

        d1.rolar();
        
        tec.close();
    }
}