import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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
                case 4://Cubo
                    System.out.println("Ingrese el lado del cubo:");
                    double ladoCubo = scanner.nextDouble();
                    Cubo cubo = new Cubo(ladoCubo);
                    System.out.println("Volumen del cubo: " + cubo.calcularVolumen());
                    System.out.println("Área del cubo: " + cubo.calcularArea());
                    break;

                case 5: //Piramide
                    System.out.println("Ingrese la base de la pirámide:");
                    double basePiramide = scanner.nextDouble();
                    System.out.println("Ingrese la altura de la pirámide:");
                    double alturaPiramide = scanner.nextDouble();
                    Piramide piramide = new Piramide(basePiramide, alturaPiramide);
                    System.out.println("Volumen de la pirámide: " + piramide.calcularVolumen());
                    System.out.println("Área de la pirámide: " + piramide.calcularArea());
                    break;
                case 6: //Esfera
                    System.out.println("Ingrese el radio de la esfera:");
                    double radioEsfera = scanner.nextDouble();
                    Esfera esfera = new Esfera(radioEsfera);
                    System.out.println("Volumen de la esfera: " + esfera.calcularVolumen());
                    System.out.println("Área de la esfera: " + esfera.calcularArea());
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