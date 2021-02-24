package steven.ejercicio2;

public class Circulo extends FiguraGeometrica{
    private double radio;


    public Circulo(double radio) {
        this.radio = radio;
        super.tipo = "Circulo";
    }

    public double getRadio() {
        return radio;
    }


    public void setRadio(double radio) {
        this.radio = radio;
    }


    @Override
    public double area() {
        return Math.PI * Math.pow(this.radio, 2);
    }

}
