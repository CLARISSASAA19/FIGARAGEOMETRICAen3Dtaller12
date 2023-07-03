class Esfera extends Circulo {
    private double radio;
    public Esfera(double radioEsfera) {
        super(new Punto[]{new Punto(0, 0)}, radioEsfera);
    }

    public double calcularVolumen() {
        return (4 * Math.PI * Math.pow(radio, 3)) / 3;
    }

    public double calcularArea() {
        return 4 * Math.PI * Math.pow(radio, 2);
    }
}
