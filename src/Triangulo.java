 public class Triangulo extends Figura {

    public Triangulo(Punto[] listaPuntos) {
        super(listaPuntos);
    }

    @Override
    public double calcularPerimetro() {
        double perimetro = 0.0;
        perimetro += distanciaEntrePuntos(listaPuntos[0], listaPuntos[1]);
        perimetro += distanciaEntrePuntos(listaPuntos[1], listaPuntos[2]);
        perimetro += distanciaEntrePuntos(listaPuntos[2], listaPuntos[0]);
        return perimetro;
    }

    @Override
    public double calcularArea() {
        double area = 0.0;
        area += listaPuntos[0].x * (listaPuntos[1].y - listaPuntos[2].y);
        area += listaPuntos[1].x * (listaPuntos[2].y - listaPuntos[0].y);
        area += listaPuntos[2].x * (listaPuntos[0].y - listaPuntos[1].y);
        area = Math.abs(calcularPerimetro()) / 2.0;
        return area;
    }

    private double distanciaEntrePuntos(Punto p1, Punto p2) {
        double distanciaX = p2.x - p1.x;
        double distanciaY = p2.y - p1.y;
        return Math.sqrt(Math.pow(distanciaX, 2) + Math.pow(distanciaY, 2));
    }
}
