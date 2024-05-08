package POO.Aula9;

public class Fisica extends Pessoa{
    private String cpf;
    //HERANÇA DE pessoa
    public Fisica(String nome, String cpf) {
        super(nome);
        this.cpf = cpf;

    }
    @Override
    public void escreverNome(){
        super.escreverNome();
        System.out.println("CPF:" + this.cpf );
    }
    


    
}
