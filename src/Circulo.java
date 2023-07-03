class Circulo extends Figura {
    private double radio;

    public Circulo(Punto[] listaPuntos2, double radio) {
        super(listaPuntos2);
        this.radio = radio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }
}

