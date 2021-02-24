package steven.ejercicio2;

public class EjemploFiguras {
    public static void main(String[] args) {
        FiguraGeometrica circle = new Circulo(3);
        FiguraGeometrica triangle = new Triangulo(3,2);
        FiguraGeometrica rectangle = new Rectangulo(4,8);

        System.out.println(circle);
        System.out.println(triangle);
        System.out.println(rectangle);

    }
}
