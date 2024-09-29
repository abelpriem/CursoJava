package PROYECTOS.CursoJava;

import java.util.ArrayList;
import java.util.Scanner;

public class arrayList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        int number;
        int result = 0;
        String exit;

        do {
            System.out.println("Introduzca un número entero en su Array List: ");
            number = scanner.nextInt();

            // Añadimos el número al array
            numbers.add(number);
            result = result + number;

            scanner.nextLine();

            System.out.println();
            System.out.println("Introzuca SI para terminar, NO para ver el seguir ingresando números");
            exit = scanner.nextLine();

        } while (!exit.equalsIgnoreCase("SI"));

        System.out.println("Array List: " + numbers);
        System.out.println("El resultado de la suma de su Array List es: " + result);

        last(scanner);
        scanner.close();
    }

    public static void last(Scanner scanner) {

        ArrayList<Integer> array = new ArrayList<>();
        int number;
        String exit;

        System.out.println();
        System.out.println("Eliminación de elementos duplicados en un Array List");
        System.out.println();

        do {
            System.out.println("Introduce un número en tu Array List: ");
            number = scanner.nextInt();

            array.add(number);

            scanner.nextLine();

            System.out.println("¿Desea continuar agregando números? SI o NO");
            exit = scanner.nextLine();

        } while (!exit.equalsIgnoreCase("NO"));

        ArrayList<Integer> duplicate = new ArrayList<>();

        for (int element : array) {
            if (!duplicate.contains(element)) {
                duplicate.add(element);
            }
        }

        System.out.println("Array original (sin duplicar): " + array);

        if (duplicate.isEmpty()) {
            System.out.println("No hay elementos duplicados en el array");
        } else {
            System.out.println("Array eliminando elementos duplicados: " + duplicate);
        }
    }
}
