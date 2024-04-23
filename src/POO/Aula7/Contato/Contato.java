package POO.Aula7.Contato;

public class Contato {
    private String nome;
    private String telefone;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void exibeContatos(){
        System.out.println("-----CONTATO AGENDADO-------");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Tel: " + this.getTelefone());
    }

}
