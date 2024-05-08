package POO.Aula9;

public class Juridica extends Pessoa {

    private String cnpj;
    //herança de pessoal(nome)
    public Juridica(String nome, String cnpj) {
        super(nome);
        this.cnpj = cnpj;
    }

    @Override
    public void escreverNome(){
        super.escreverNome();
        System.out.println("CNPJ:" + this.cnpj);
    }
}
