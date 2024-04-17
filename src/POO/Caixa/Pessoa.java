package POO.Caixa;

public class Pessoa {
    public String nome;
    int idade;
    String endereco;
    String cidade;
    double salario;

    public String MostrarPessoa(){
        String dados = "";
        dados += nome; 
        dados += ", " +idade;
        dados += ", "+cidade;
        return dados;
    }
    
}