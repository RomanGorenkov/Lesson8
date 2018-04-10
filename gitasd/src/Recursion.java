

import java.util.InputMismatchException;
import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //int check = GetUserInput(scanner, 10, 20);
        createArray(scanner);
    }

    private static int GetUserInput(Scanner scanner, int min, int max) {
        System.out.println("Введите число от " + min + " до " + max);
        int result;
        try {
            result = scanner.nextInt();

        } catch (InputMismatchException e) {
            System.out.println("Вы ввели не число");
            scanner = new Scanner(System.in);
            return GetUserInput(scanner, min, max);
        }
        if (result < min || result > max) {
            System.out.println("Число не от " + min + " до " + max);
            return GetUserInput(scanner, min, max);
        }
        return result;
    }

    private static int[] createArray(Scanner scanner) {
        System.out.print("Введите длину: ");
        int length = scanner.nextInt();
        int[] array = new int[length];
        if (length == 0 || length > 10) {
            System.out.println("Длина должна быть от 1 до 10");
            array = createArray(scanner);
        }
        System.out.println("Последний элемент = " + array[length - 1]);
        return array;
    }
}
