public class Piramide {
    private double base;
    private double altura;

    public Piramide(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double calcularVolumen() {
        return (base * base * altura) / 3;
    }

    public double calcularArea() {
        double lado = Math.sqrt(Math.pow(base / 2, 2) + Math.pow(altura, 2));
        return base * lado + (base * base);
    }
}