class Piramide extends Triangulo {
    private double altura;

    public Piramide(double basePiramide, double alturaPiramide) {
        super(new Punto[]{
                new Punto(0, 0),
                new Punto(basePiramide, 0),
                new Punto(basePiramide / 2, alturaPiramide)
        });
        this.altura = alturaPiramide;
    }

    public double calcularVolumen() {
        return (super.calcularArea() * altura) / 3.0;
    }
}
