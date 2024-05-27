import java.util.Scanner;

public class Task_4 {

    public void Change() {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введiть кiлькiсть елементiв масиву: ");
        while (!scanner.hasNextInt()) {

            System.out.print("Введено некоректне значення. Будь ласка, введiть цiле число: ");
            scanner.next();
        }
        int n = scanner.nextInt();

        int[] numbers = new int[n];

        System.out.println("Введiть елементи масиву:");
        for (int i = 0; i < n; i++) {
            System.out.print("Елемент " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                numbers[i] *= -1;
            }
        }

        System.out.println("Масив пiсля змiни знаку непарних елементiв:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}