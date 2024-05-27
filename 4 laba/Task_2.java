import java.util.Scanner;

public class Task_2 {

    public void Array10() {
        
        int[] numbers = new int[10];

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Введiть число для елементу " + (i + 1) + ": ");
            while (!scanner.hasNextInt()) {
                System.out.print("Введено некоректне значення. Будь ласка, введiть цiле число: ");
                scanner.next();
            }
            numbers[i] = scanner.nextInt();
        }

        System.out.println("-------------------------------");

        System.out.println("Числа з непарним iндексом:");
        for (int i = 0; i < numbers.length; i += 2) {
            System.out.println(numbers[i]);
        }

        System.out.println("Числа з парним iндексом:");
        for (int i = 1; i < numbers.length; i += 2) {
            System.out.println(numbers[i]);
        }

        System.out.println("Масив у зворотньому порядку:");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
    }
}