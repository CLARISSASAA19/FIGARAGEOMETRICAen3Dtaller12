public class Main {
    public static void main(String[] args) {

        Menu menu = new Menu();
        int opcion;

        do {
            menu.mostrarMenu();
            opcion = menu.obtenerOpcion();

            switch (opcion) {
                case 1: // Triángulo
                    Punto[] puntosTriangulo = menu.ingresarPuntos();
                    Triangulo triangulo = new Triangulo(puntosTriangulo);
                    menu.mostrarResultados(triangulo);
                    break;

                case 2: // Cuadrado
                    Punto[] puntosCuadrado = menu.ingresarPuntosCuadrado();
                    Cuadrado cuadrado = new Cuadrado(puntosCuadrado);
                    menu.mostrarResultados(cuadrado);
                    break;

                case 3: // Círculo
                    Punto[] puntosCirculo = menu.ingresarPuntosCirculo();
                    double radio = menu.ingresarRadio();
                    Circulo circulo = new Circulo(puntosCirculo, radio);
                    menu.mostrarResultados(circulo);
                    break;

                case 0: // Salir
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }
        } while (opcion != 0);
    }
}