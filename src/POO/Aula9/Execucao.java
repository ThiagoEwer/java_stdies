package POO.Aula9;

public class Execucao {
    public static void exec(String[] args) {
        // criando os objetos fisicas p1 e juridica p2
        Fisica p1 = new Fisica("Thiago", "70062254421");
        Juridica p2 = new Juridica("Ewerton", "41150160000120");

        p1.escreverNome();
        p2.escreverNome();

    }

}
