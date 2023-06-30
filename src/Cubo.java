import java.util.Scanner;

public class Cubo {
    private double lado;

    public Cubo(double lado) {
        this.lado = lado;
    }

    public double calcularVolumen() {
        return Math.pow(lado, 3);
    }

    public double calcularArea() {
        return 6 * Math.pow(lado, 2);
    }
}