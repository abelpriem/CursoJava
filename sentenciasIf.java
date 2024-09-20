package PROYECTOS.CursoJava;

import java.util.Scanner;

public class sentenciasIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;
        int rest;
        boolean check = true;

        System.out.println("Comprobación de si un número es par o impar");

        System.out.println("Introduce un número entero positivo: ");
        number = scanner.nextInt();

        rest = number % 2;

        if (rest == 0) {
            System.out.println("¿El número " + number + " es par? Resultado: " + check);
        } else {
            check = false;
            System.out.println("¿El número " + number + " es par? Resultado: " + check);
        }

        last(scanner);
        scanner.close();
    }

    public static void last(Scanner scanner) {
        int year;

        int firstCheck;
        int secondCheck;
        int thirdCheck;

        System.out.println("Identificar si un año es bisiesto o no");

        System.out.println("Introduce un año: ");
        year = scanner.nextInt();

        firstCheck = year % 4;
        secondCheck = year % 100;
        thirdCheck = year % 400;

        if (firstCheck == 0) {
            if (secondCheck == 0) {
                if (thirdCheck == 0) {
                    System.out.println("El año " + year + " SI es bisiesto");
                } else {
                    System.out.println("El año " + year + " NO es bisiesto");
                }
            } else {
                System.out.println("El año " + year + " SI es bisiesto");
            }
        } else {
            System.out.println("El año " + year + " NO es bisiesto");
        }
    }
}
