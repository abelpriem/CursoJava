package PROYECTOS.CursoJava;

import java.util.Scanner;

public class clasesWrapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text;
        int result;

        System.out.println("Introducir número (se almacenará en formato de texto): ");
        text = scanner.next();

        result = Integer.parseInt(text) + 10;

        System.out.println("El resultado de tu número sumado 10 son " + result);

        last(args);
        scanner.close();
    }

    public static void last(String[] args) {
        System.out.println();

        System.out.println("Devolución de números máximos y mínimos");
        System.out.println();

        System.out.println("INT");
        System.out.println("Valor mínimo: " + Integer.MAX_VALUE);
        System.out.println("Valor mínimo: " + Integer.MIN_VALUE);

        System.out.println();

        System.out.println("DOUBLE");
        System.out.println("Valor mínimo: " + Double.MAX_VALUE);
        System.out.println("Valor mínimo: " + Double.MIN_VALUE);

        System.out.println();

        // Se necesita poner (int) delante para la devolución del número entero
        System.out.println("CHAR");
        System.out.println("Valor mínimo: " + (int) Character.MAX_VALUE);
        System.out.println("Valor mínimo: " + (int) Character.MIN_VALUE);
    }
}
