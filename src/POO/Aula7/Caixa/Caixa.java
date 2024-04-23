package POO.Aula7.Caixa;

public class Caixa {
  public static void atm(){
    Conta c1 = new Conta();
    c1.setTitular("Thiago Ewerton");
    c1.setAgencia("0001");
    c1.setNumConta("987654321");
    c1.setTipo("Corrente");
    c1.Depositar(100);
    c1.Sacar(300);
  }
    
}
