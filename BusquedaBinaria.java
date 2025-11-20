import java.io.*;
import java.util.*;

public class BusquedaBinaria {

    public static int binarySearch(int arr[], int x) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == x) {
                return mid; // Encontrado
            }

            if (arr[mid] < x) {
                low = mid + 1; // Buscar derecha
            } else {
                high = mid - 1; // Buscar izquierda
            }
        }
        return -1; // No encontrado
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            // ARCHIVO DE ENTRADA
            System.out.print("Nombre del archivo de entrada: ");
            String archivoEntrada = sc.nextLine();

            File file = new File(archivoEntrada);
            Scanner lector = new Scanner(file);

            System.out.println("\n--- CONTENIDO DEL ARCHIVO (NÚMEROS ORDENADOS) ---");

            ArrayList<Integer> lista = new ArrayList<>();

            while (lector.hasNextLine()) {
                int num = Integer.parseInt(lector.nextLine());
                System.out.println(num);
                lista.add(num);
            }
            lector.close();

            // Convertir a arreglo
            int[] numeros = new int[lista.size()];
            for (int i = 0; i < lista.size(); i++) {
                numeros[i] = lista.get(i);
            }

            // Número a buscar
            System.out.print("\nNúmero a buscar: ");
            int objetivo = sc.nextInt();
            sc.nextLine();

            int resultado = binarySearch(numeros, objetivo);

            // Archivo de salida
            System.out.print("\nNombre del archivo de salida: ");
            String archivoSalida = sc.nextLine();

            PrintWriter writer = new PrintWriter(archivoSalida);

            System.out.println("\n--- RESULTADO ---");
            if (resultado != -1) {
                System.out.println("Número encontrado en la posición: " + resultado);
                writer.println("Número encontrado en la posición: " + resultado);
            } else {
                System.out.println("Número NO encontrado.");
                writer.println("Número NO encontrado.");
            }

            writer.close();
            System.out.println("\n✓ Archivo generado correctamente.");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
