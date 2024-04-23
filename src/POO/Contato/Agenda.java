package POO.Contato;

import java.util.Scanner;

public class Agenda {
    public static void NovaAgenda (){
        Scanner tec = new Scanner(System.in);
        Contato c1 = new Contato();

        System.out.println("Insira o nome do contato:");
        String name = tec.nextLine();
        c1.setNome(name);

        System.out.println("Insira seu telefone");
        String cellphone = tec.nextLine();
        c1.setTelefone(cellphone);

        c1.exibeContatos();
        tec.close();
    }

    
}
