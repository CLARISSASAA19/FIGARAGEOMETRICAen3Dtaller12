class Cuadrado extends Figura {

    public Cuadrado(Punto[] listaPuntos1) {
        super(listaPuntos1);
    }

    @Override
    public double calcularPerimetro() {
        double lado = distanciaEntrePuntos(listaPuntos[0], listaPuntos[1]);
        return 4 * lado;
    }

    @Override
    public double calcularArea() {
        double lado = distanciaEntrePuntos(listaPuntos[0], listaPuntos[1]);
        return lado * lado;
    }

    private double distanciaEntrePuntos(Punto p1, Punto p2) {
        double distanciaX = p2.x - p1.x;
        double distanciaY = p2.y - p1.y;
        return Math.sqrt(Math.pow(distanciaX, 2) + Math.pow(distanciaY, 2));
    }

}