package PROYECTOS.CursoJava;

import java.util.Scanner;

public class expresiones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstValue;
        int secondValue;
        int thirdValue;

        int firstOperation;
        int secondOperation;

        int firstResult = 0;
        int finalResult = 0;

        System.out.println("Introduzca el primer número: ");
        firstValue = scanner.nextInt();

        System.out.println("Seleccione una opción: ");
        System.out.println("1. SUMA");
        System.out.println("2. RESTA");
        System.out.println("3. MULTIPLICACIÓN");
        System.out.println("4. DIVISIÓN");
        firstOperation = scanner.nextInt();

        System.out.println("Introduzca el segundo número: ");
        secondValue = scanner.nextInt();

        System.out.println("Seleccione una opción: ");
        System.out.println("1. SUMA");
        System.out.println("2. RESTA");
        System.out.println("3. MULTIPLICACIÓN");
        System.out.println("4. DIVISIÓN");
        secondOperation = scanner.nextInt();

        System.out.println("Introduzca el último número: ");
        thirdValue = scanner.nextInt();

        if (firstOperation == 1) {
            firstResult = firstValue + secondValue;
        } else if (firstOperation == 2) {
            firstResult = firstValue - secondValue;
        } else if (firstOperation == 3) {
            firstResult = firstValue * secondValue;
        } else if (firstOperation == 4) {
            if (secondValue != 0) {
                firstResult = firstValue / secondValue;
            } else {
                System.err.println("Error al dividir por 0");
                scanner.close();

                return;
            }
        } else {
            System.err.println("Error en la operación: debe elegir un número una operación del 1 al 4");
            scanner.close();

            return;
        }

        if (secondOperation == 1) {
            finalResult = firstResult + thirdValue;
        } else if (secondOperation == 2) {
            finalResult = firstResult - thirdValue;
        } else if (secondOperation == 3) {
            finalResult = firstResult * thirdValue;
        } else if (secondOperation == 4) {
            if (thirdValue != 0) {
                firstResult = firstValue / secondValue;
            } else {
                System.err.println("Error al dividir por 0");
                scanner.close();

                return;
            }
        } else {
            System.err.println("Error en la operación: debe elegir un número una operación del 1 al 4");
            scanner.close();

            return;
        }

        System.out.println("El resultado de la operación es: " + finalResult);

        last(scanner);
        scanner.close();
    }

    public static void last(Scanner scanner) {
        int r;
        double pi = 3.1416;
        double area;

        System.out.println("Cálculo del área del círculo");

        System.out.println("Introduzca el radio del círculo: ");
        r = scanner.nextInt();

        area = (r * r) * pi;

        System.out.println("El área del círculo con un radio de " + r + " es de: " + area);
    }
}
