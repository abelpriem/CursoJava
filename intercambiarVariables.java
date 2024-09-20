package PROYECTOS.CursoJava;

public class intercambiarVariables {
    public static void main(String[] args) {
        int x = 20;
        int y = 30;

        x = x + 10;
        y = y - 10;

        System.out.println("x = " + x);
        System.out.println("y = " + y);

        last(args);
    }

    public static void last(String[] args) {
        int a = 5;
        int b = 3;

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
