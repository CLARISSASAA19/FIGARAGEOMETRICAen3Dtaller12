class Cubo extends Cuadrado {

    public Cubo(double ladoCubo) {
        super(new Punto[]{
                new Punto(0, 0),
                new Punto(ladoCubo, 0),
                new Punto(ladoCubo, ladoCubo),
                new Punto(0, ladoCubo)
        });
    }

    public double calcularVolumen() {
        return Math.pow(listaPuntos[1].x, 3);
    }
}

