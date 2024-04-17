package POO.Retangulo;

public class Retangulo {
    private double base;
    private double altura;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calcularArea(){
       return this.getBase() * this.getAltura();
    }

    public double  calcularPerimetro(){
        return 2*(this.getBase() + this.getAltura());
    }
}
