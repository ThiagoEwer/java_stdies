package Revisao;

import java.util.Random;
import java.util.Scanner;

public class Revisao2 {
    public static void Math () {
        Scanner tec = new Scanner(System.in);
        System.out.println("Digite um valor para calcular a potência: ");
        double pot1 = tec.nextDouble();
        System.out.println("Agora digite o valor de quanto será elevado: ");
        double val1 = tec.nextDouble();


        double result = Math.pow(val1, pot1);

        System.out.println(" O resultado da operação é: "+ result);
        
        tec.close();
    }
    public static void MathRandom(){
        Random aleat = new Random();
        int val2 = aleat.nextInt(100);
        int val1 = aleat.nextInt(100);
        int val3 = aleat.nextInt(100);

        System.out.println("O valor sorteado 1 é: "+ val1 );
        System.out.println("O valor sorteado 1 é: "+ val2 );
        System.out.println("O valor sorteado 1 é: "+ val3 );
    }   
    public static void Gravidade() {
        final double gMerc = 0.37; 
        final double gVenus = 0.38;
        final double gMarte = 2.64;
        final double gJupiter = 2.64;
        final double gSaturno = 1.15;
        final double gUrano = 1.17;

        System.out.println("Insira seu peso na TERRA em Kg: ");
        Scanner tec = new Scanner(System.in);
        double pesoT = tec.nextDouble();

        double pMerc = (pesoT/10)*gMerc; 
        double pVenus = (pesoT/10)*gVenus; 
        double pMarte = (pesoT/10)*gMarte; 
        double pJupiter = (pesoT/10)*gJupiter; 
        double pSaturno = (pesoT/10)*gSaturno; 
        double pUrano = (pesoT/10)*gUrano; 
        
        System.out.println("Seu peso em Mercurio é: " + pMerc + " KG");
        System.out.println("Seu peso em Venus é: " + pVenus + " KG");
        System.out.println("Seu peso em Marte é: " + pMarte + " KG");
        System.out.println("Seu peso em Jupiter é: " + pJupiter + " KG");
        System.out.println("Seu peso em Saturno é: " + pSaturno + " KG");
        System.out.println("Seu peso em Urano é: " + pUrano + " KG");
    }
}
