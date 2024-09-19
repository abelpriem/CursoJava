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

        scanner.close();

        last(args);
    }

    public static void last(String[] args) {
        int x = 155;
        int y = 2000;

        int suma = x + y;

        System.out.println("Suma total:");
        System.out.println(suma);
    }
}
