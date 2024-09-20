package PROYECTOS.CursoJava;

import java.util.Scanner;

public class sentenciasSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstValue;
        int secondValue;
        String operation;

        int result;

        System.out.println("Calculadora simple");

        System.out.println("Introduce el primer número entero positivo");
        firstValue = scanner.nextInt();

        System.out.println("Introduce: SUMAR - RESTAR - MULTIPLICAR - DIVIDIR");
        operation = scanner.next();

        System.out.println("Introduce el segundo número entero positivo");
        secondValue = scanner.nextInt();

        switch (operation) {
            case "SUMAR":
                result = firstValue + secondValue;
                System.out.println("El valor es: " + result);
                break;

            case "RESTAR":
                result = firstValue - secondValue;
                System.out.println("El valor es: " + result);
                break;

            case "MULTIPLICAR":
                result = firstValue * secondValue;
                System.out.println("El valor es: " + result);
                break;

            case "DIVIDIR":
                result = firstValue / secondValue;
                System.out.println("El valor es: " + result);
                break;

            default:
                System.err.println("Error en la operación");
                break;
        }

        last(scanner);
        scanner.close();
    }

    public static void last(Scanner scanner) {
        int number;
        String day;

        System.out.println("Conversor de números a días de la semana");

        System.out.println("Introduce en número el día de la semana: ");
        number = scanner.nextInt();

        switch (number) {
            case 1:
                day = "Lunes";
                System.out.println("El " + number + " corresponde al " + day);
                break;

            case 2:
                day = "Martes";
                System.out.println("El " + number + " corresponde al " + day);
                break;

            case 3:
                day = "Miércoles";
                System.out.println("El " + number + " corresponde al " + day);
                break;

            case 4:
                day = "Jueves";
                System.out.println("El " + number + " corresponde al " + day);
                break;

            case 5:
                day = "Viernes";
                System.out.println("El " + number + " corresponde al " + day);
                break;

            case 6:
                day = "Sábado";
                System.out.println("El " + number + " corresponde al " + day);
                break;

            case 7:
                day = "Domingo";
                System.out.println("El " + number + " corresponde al " + day);
                break;

            default:
                System.err.println("Error: número elegido fuera de rango del 1 al 7");
                break;
        }
    }
}
