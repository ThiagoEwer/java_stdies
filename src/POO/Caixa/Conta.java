package POO.Caixa;

public class Conta {
    private String titular;
    private double saldo;
    private String agencia;
    private String tipo;
    private String numConta;

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public void setTitular(String titular){
        //this faz referencia ao atributo titular da classe
        this.titular = titular;  
    }
    
    public String getTitular(){ 
        return titular;
    }

    //criei o metodo com a variavel valor como parametro
    public void  Depositar(double valor){
        saldo += valor;
    }

    public void Sacar(double valor){
        
        if(saldo>=valor){
            saldo -= valor;
        }else{
            System.out.println("Saldo Insuficiente");
        }
    }

    public void mostrarSaldo(){
        
    }
    
}
