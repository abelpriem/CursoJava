package PROYECTOS.CursoJava;

import java.util.Scanner;

public class maths {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double value;
        double result;

        System.out.println("Cálculo de raíces cuadradas");

        System.out.println("Introduzca un número: ");
        value = scanner.nextDouble();

        result = Math.sqrt(value);

        System.out.println("La raíz cuadrada de " + value + "es " + result);

        second(scanner);
        third(scanner);
        scanner.close();
    }

    public static void second(Scanner scanner) {
        double number;
        double sq;

        double result;

        System.out.println("Elevación a potencia de un número");

        System.out.println("Introduzca un número entero: ");
        number = scanner.nextDouble();

        System.out.println("Introduzca la potencia a elevar: ");
        sq = scanner.nextDouble();

        result = Math.pow(number, sq);

        System.out.println("El resultado de elevar el número " + number + " a la " + sq + " es " + result);
    }

    public static void third(Scanner scanner) {
        int value;
        int absolute;

        System.out.println("Devolver un número absoluto");

        System.out.println("Introduzca un número negativo: ");
        value = scanner.nextInt();

        absolute = Math.abs(value);

        System.out.println("El absoluto de " + value + " es " + absolute);
    }
}
