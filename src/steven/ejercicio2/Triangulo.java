package steven.ejercicio2;

public class Triangulo extends FiguraGeometrica{

    private int base;
    private int altura;

    public Triangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
        super.tipo = "Triangulo";
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public double area() {
        return (double)(base*altura)/2;
    }
}
