package POO.Aula7.Dado;

public class Dado {
    private int lados;

    public int getLados() {
        return lados;
    }

    public void setLados(int lados) {
        this.lados = lados;
    }

    public int rolar(){
        double aleatorio = Math.random();
        int valor = (int) (aleatorio *this.getLados());
        System.out.println("Valor da rolagem foi: "+valor);
        return valor;
    }
}
