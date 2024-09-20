package PROYECTOS.CursoJava;

import java.util.Scanner;

public class buclesFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int value;
        int result = 0;

        System.out.println("Introduce un número: ");
        value = scanner.nextInt();

        System.out.println("Tabla de multiplicar del " + value + ": ");

        for (int i = 0; i < 11; i++) {
            result = value * i;

            System.out.println(value + " x " + i + " = " + result);
        }

        last(scanner);
        scanner.close();
    }

    public static void last(Scanner scanner) {
        int value;
        int result = 1;

        System.out.println("Introduce un número: ");
        value = scanner.nextInt();

        for (int i = value; i > 0; i--) {
            result *= i;
        }

        System.out.println("El factorial de " + value + " es = " + result);
    }
}
