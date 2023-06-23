abstract class Figura {
    protected Punto[] listaPuntos;

    public Figura(Punto[] listaPuntos) {
        this.listaPuntos = listaPuntos;
    }

    public abstract double calcularPerimetro();

    public abstract double calcularArea();
}
