package PROYECTOS.CursoJava;

import java.util.Scanner;

public class operadoresLogicos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age;

        System.out.println("Verificación de edad para votar");

        System.out.println("Introduce tu edad en números: ");
        age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("Tienes " + age + " años, eres mayor de edad y SI puedes votar");
        } else {
            System.out.println("Tienes " + age + " años, eres menor de edad y NO puedes votar");
        }

        last(scanner);
        scanner.close();
    }

    public static void last(Scanner scanner) {
        int number;

        System.out.println("Comprobación de positivo/par y si es negativo/impar");

        System.out.println("Introduce un número: ");
        number = scanner.nextInt();

        if (number > 0 && number % 2 == 0) {
            System.out.println("El número " + number + " es positivo y par");
        }

        if (number < 0 || number % 3 == 0) {
            System.out.println("El número " + number + " es o negativo o divisible entre 3");
        }
    }
}
