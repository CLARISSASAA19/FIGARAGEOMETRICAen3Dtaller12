import java.util.Scanner;

public class Menu {
    private Scanner scanner;

    public Menu() {
        scanner = new Scanner(System.in);
    }

    public void mostrarMenu() {
        System.out.println("Seleccione una figura geométrica:");
        System.out.println("1. Triángulo");
        System.out.println("2. Cuadrado");
        System.out.println("3. Círculo");
        System.out.println("0. Salir");
        System.out.print("Opción: ");
    }

    public int obtenerOpcion() {
        int opcion = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea después de leer el número
        return opcion;
    }

    public Punto[] ingresarPuntos() {
        Punto[] listaPuntos = new Punto[3]; // Para Triángulo, cambiar el tamaño si es necesario
        System.out.println("Ingrese las coordenadas de los puntos:");

        for (int i = 0; i < listaPuntos.length; i++) {
            System.out.print("Punto " + (i + 1) + " - Coordenada X: ");
            double x = scanner.nextDouble();
            System.out.print("Punto " + (i + 1) + " - Coordenada Y: ");
            double y = scanner.nextDouble();
            listaPuntos[i] = new Punto(x, y);
        }

        scanner.nextLine();
        return listaPuntos;
    }

    public double ingresarRadio() {
        System.out.print("Ingrese el radio del círculo: ");
        double radio = scanner.nextDouble();
        scanner.nextLine();
        return radio;
    }

    public Punto[] ingresarPuntosCuadrado() {
        Punto[] listaPuntos1 = new Punto[4];
        System.out.println("Ingrese las coordenadas de los puntos:");

        for (int i = 0; i < listaPuntos1.length; i++) {
            System.out.print("Punto " + (i + 1) + " - Coordenada X: ");
            double x = scanner.nextDouble();
            System.out.print("Punto " + (i + 1) + " - Coordenada Y: ");
            double y = scanner.nextDouble();
            listaPuntos1[i] = new Punto(x, y);
        }

        scanner.nextLine();
        return listaPuntos1;
    }

    public Punto[] ingresarPuntosCirculo() {
        Punto[] listaPuntos2 = new Punto[1];
        System.out.println("Ingrese las coordenadas de los puntos:");

        for (int i = 0; i < listaPuntos2.length; i++) {
            System.out.print("Punto " + (i + 1) + " - Coordenada X: ");
            double x = scanner.nextDouble();
            System.out.print("Punto " + (i + 1) + " - Coordenada Y: ");
            double y = scanner.nextDouble();
            listaPuntos2[i] = new Punto(x, y);
        }

        scanner.nextLine();
        return listaPuntos2;
    }

    public void mostrarResultados(Figura figura) {
        System.out.println("\nResultados:");
        System.out.println("Perímetro: " + figura.calcularPerimetro());
        System.out.println("Área: " + figura.calcularArea());
        System.out.println();
    }
}

