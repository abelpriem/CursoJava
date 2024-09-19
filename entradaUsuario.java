package PROYECTOS.CursoJava;

import java.util.Scanner;

public class entradaUsuario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca su nombre:");
        String name = scanner.next();

        System.out.println("Introduce tu edad:");
        int age = scanner.nextInt();

        System.out.println("Introduzca su estatura:");
        int height = scanner.nextInt();

        System.out.println("Dime tu color favorito:");
        String color = scanner.next();

        System.out.println(
                "Hola " + name + ". Tienes " + age + " años." + " Tu estatura es de " + height
                        + "cm y tu color favorito es el " + color);

        last(scanner);
        scanner.close();
    }

    // Pasamos scanner como parámetro
    public static void last(Scanner scanner) {
        System.out.println("Introduzca el primer número:");
        int first = scanner.nextInt();

        System.out.println("Introduzca el segundo número a sumar:");
        int second = scanner.nextInt();

        int result = first + second;

        System.out.println("Suma total: " + result);
    }
}
