package PROYECTOS.CursoJava;

import java.util.Random;
import java.util.Scanner;

public class numerosAleatorios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int x;

        System.out.println("Lanzamiento de dado");

        x = random.nextInt(6) + 1;
        System.out.println("Ha salido el número: " + x);

        last(scanner);
    }

    public static void last(Scanner scanner) {
        int filas = 2;
        int columnas = 2;

        int matriz1[][] = new int[filas][columnas];
        int matriz2[][] = new int[filas][columnas];
        int resultado[][] = new int[filas][columnas];

        System.out.println("Valores de la MATRIZ 1: ");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.println("Introduce el valor para la posición [" + i + "] [" + j + "]: ");
                matriz1[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Valores de la MATRIZ 2: ");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.println("Introduce el valor para la posición [" + i + "] [" + j + "]: ");
                matriz2[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado[i][j] = matriz1[i][j] * matriz2[i][j];
            }
        }

        System.out.println("Resultado FINAL");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.println("El resultado de la multiplicación de matrices es " + resultado[i][j]);
            }
        }
    }
}
