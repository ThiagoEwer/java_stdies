package POO.Retangulo;
import java.util.Scanner;


public class Area {

    public static void seletArea(){
        Retangulo  ret = new Retangulo();
        Scanner tec = new Scanner(System.in);
        System.out.println("Insira o valor da altura");
        ret.setAltura(tec.nextDouble());
        System.out.println("Insira o valor da Base");
        ret.setBase(tec.nextDouble());

        System.out.println("Area equivalente: "+ret.calcularArea()+" cm^2");
        System.out.println("perimetro equivalente: "+ret.calcularPerimetro()+" cm");

        tec.close();
        
    }
    
}
