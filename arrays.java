package PROYECTOS.CursoJava;

public class arrays {
    public static void main(String[] args) {
        int numbers[] = { 2, 15, 11, 33, 8 };
        int higher = 0;

        System.out.println("Buscar el elemento mayor de un Array: ");

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > higher) {
                higher = numbers[i];
            }
        }

        System.out.print(higher);
        System.out.println();
        last(args);
    }

    public static void last(String[] args) {
        String[] numbers = new String[5];

        numbers[0] = "10";
        numbers[1] = "20";
        numbers[2] = "30";
        numbers[3] = "40";
        numbers[4] = "50";

        System.out.println("Elementos de un Array en orden descendente: ");

        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print("[" + numbers[i] + "],");
        }
    }
}
