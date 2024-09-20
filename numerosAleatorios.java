package PROYECTOS.CursoJava;

import java.util.Random;

public class numerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();
        int x;

        System.out.println("Lanzamiento de dado");

        x = random.nextInt(6) + 1;
        System.out.println("Ha salido el número: " + x);

        last(random);
    }

    public static void last(Random random) {
        // PENDIENTE
        // String[] password;
        // String alpha;
        // int character;

        // character = random.nextInt(8) + 1;
    }
}
