public class Esfera {
    private double radio;

    public Esfera(double radio) {
        this.radio = radio;
    }

    public double calcularVolumen() {
        return (4 * Math.PI * Math.pow(radio, 3)) / 3;
    }

    public double calcularArea() {
        return 4 * Math.PI * Math.pow(radio, 2);
    }
}
