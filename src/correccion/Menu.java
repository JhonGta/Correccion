package correccion;
import java.util.Scanner;
public class Menu {

    public static void main(String[] args) {
        ArbolBinario arbol = new ArbolBinario();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n----- Menú Principal -----");
            System.out.println("1. Insertar un nodo");
            System.out.println("2. Realizar recorrido en Preorden");
            System.out.println("3. Realizar recorrido en Inorden");
            System.out.println("4. Realizar recorrido en Postorden");
            System.out.println("5. Obtener número de nodos en el árbol");
            System.out.println("6. Obtener suma de valores de nodos");
            System.out.println("0. Salir");
            System.out.print("Ingrese su opción: ");

            if (scanner.hasNextInt()) {
                opcion = scanner.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.print("Ingrese el dato a insertar: ");
                        if (scanner.hasNextInt()) {
                            int dato = scanner.nextInt();
                            arbol.insertar(dato);
                        } else {
                            System.out.println("Error: Ingrese un valor entero.");
                            scanner.next(); // Limpiar el buffer de entrada
                        }
                        break;
                    case 2:
                        System.out.println("\nRecorrido en Preorden:");
                        arbol.preorden();
                        break;
                    case 3:
                        System.out.println("\nRecorrido en Inorden:");
                        arbol.inorden();
                        break;
                    case 4:
                        System.out.println("\nRecorrido en Postorden:");
                        arbol.postOrden();
                        break;
                    case 5:
                        int numNodos = arbol.numNodos();
                        System.out.println("Número de nodos en el árbol: " + numNodos);
                        break;
                    case 6:
                        int sumaValores = arbol.sumaValorNodo();
                        System.out.println("Suma de valores de los nodos: " + sumaValores);
                        break;
                    case 0:
                        System.out.println("Saliendo del programa. ¡Hasta luego!");
                        break;
                    default:
                        System.out.println("Opción inválida. Intente de nuevo.");
                        break;
                }
            } else {
                System.out.println("Error: Ingrese un valor entero.");
                scanner.next(); // Limpiar el buffer de entrada
                opcion = -1; // Forzar a repetir el ciclo para pedir nuevamente la opción
            }
        } while (opcion != 0);

        scanner.close();
    }
}