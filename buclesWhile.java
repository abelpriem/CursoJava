package PROYECTOS.CursoJava;

import java.util.Random;
import java.util.Scanner;

public class buclesWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;
        int sum = 0;

        System.out.println("Suma de números hasta el 20");

        System.out.println("Introduce un número: ");
        number = scanner.nextInt();

        sum += number;

        while (sum < 20) {
            System.out.println("Introduce otro número: ");
            number = scanner.nextInt();
            sum += number;
        }

        System.out.println("Ha alcanzado el número 20!");

        last(scanner);
        scanner.close();
    }

    public static void last(Scanner scanner) {
        Random random = new Random();

        int value;
        int number = random.nextInt(10) + 1;

        System.out.println("Adivinación de números del 1 al 10");

        System.out.println("Introduce un número del 1 al 10: ");
        value = scanner.nextInt();

        while (value != number) {
            System.out.println("Incorrecto! Introduce otro número: ");
            value = scanner.nextInt();
        }

        System.out.println("Correcto! Has acertado el número!");
    }
}
