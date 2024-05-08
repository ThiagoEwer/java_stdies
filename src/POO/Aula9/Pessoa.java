package POO.Aula9;

public class Pessoa {
    private String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public void escreverNome(){
        System.out.println("Nome:"+ this.nome);
    }
    
}
