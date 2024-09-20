package PROYECTOS.CursoJava;

public class arrays {
    public static void main(String[] args) {
        // PENDIENTE
        String[] numbers = new String[5];

        numbers[0] = "2";
        numbers[1] = "15";
        numbers[2] = "11";
        numbers[3] = "33";
        numbers[4] = "8";

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        last(args);
    }

    public static void last(String[] args) {
        String[] numbers = new String[5];

        numbers[0] = "10";
        numbers[1] = "20";
        numbers[2] = "30";
        numbers[3] = "40";
        numbers[4] = "50";

        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
    }
}
