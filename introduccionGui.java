package PROYECTOS.CursoJava;

import javax.swing.JOptionPane;

public class introduccionGui {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Introduce tu nombre");
        JOptionPane.showMessageDialog(null, "Bienvenido, " + name);

        last(args);
    }

    public static void last(String[] args) {
        int firstValue;
        int secondValue;

        int operation;
        int result = 0;

        firstValue = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número entero"));

        operation = Integer
                .parseInt(JOptionPane.showInputDialog("Operación: 1. SUMAR 2. RESTAR 3. MULTIPLICAR 4. DIVIDIR"));

        secondValue = Integer.parseInt(JOptionPane.showInputDialog("Introduce el segundo número entero"));

        if (operation == 1) {
            result = firstValue + secondValue;
        } else if (operation == 2) {
            result = firstValue - secondValue;
        } else if (operation == 3) {
            result = firstValue * secondValue;
        } else if (operation == 4) {
            if (secondValue != 0) {
                result = firstValue / secondValue;
            } else {
                JOptionPane.showMessageDialog(null, "Error al dividir por 0");
                return;
            }
        } else {
            JOptionPane.showMessageDialog(null,
                    "Error en la operación: debe elegir un número una operación del 1 al 4");
            return;
        }

        JOptionPane.showMessageDialog(null, "El resultado es: " + result);
    }
}
