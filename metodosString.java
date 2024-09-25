package PROYECTOS.CursoJava;

import java.util.Scanner;

public class metodosString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char vocales[] = { 'a', 'e', 'i', 'o', 'u' };
        int count = 0;

        System.out.println("Introduce una palabra para contar sus vocales: ");
        String word = scanner.nextLine();

        char[] wordArray = word.toCharArray();

        for (char a : wordArray) {
            for (char b : vocales) {
                if (a == b) {
                    count++;
                    break;
                }
            }
        }

        System.out.println("La palabra " + word + " contiene " + count + " vocales.");

        last(scanner);
        scanner.close();
    }

    public static void last(Scanner scanner) {
        boolean palindromo = true;

        System.out.println("Introduce una palabra para averiguar si es palíndromo o no: ");
        String input = scanner.nextLine().toLowerCase();

        char[] word = input.toCharArray();

        for (int i = 0; i < word.length / 2; i++) {
            if (word[i] != word[word.length - 1 - i]) {
                palindromo = false;
                break;
            }
        }

        System.out.println();
        System.out.println("¿Es " + input + " un palíndromo? Resultado: " + palindromo);
    }
}
