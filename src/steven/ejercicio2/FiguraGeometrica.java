package steven.ejercicio2;

public abstract class FiguraGeometrica {

    public abstract double area();

    public String tipo = "figura";

    @Override
    public String toString() {
        return "Area de la figura "+ tipo + " : " + area();
    }
}
