package PROYECTOS.CursoJava;

public class variables {
    public static void main(String[] args) {
        int age = 30;
        double height = 1.80;
        boolean student = true;
        String name = "Abel";
        String type = "hombre";

        System.out.println("Hola, mi nombre es " + name + " y tengo " + age + " años. Soy " + type + " y mido "
                + height + "m. ¿Estudiante? " + student);

        last(args);
    }

    public static void last(String[] args) {
        String firstCar = "Opel";
        String secondCar = "Renault";

        firstCar = secondCar;
        secondCar = "Opel";

        System.out.println(firstCar);
        System.out.println(secondCar);
    }
}