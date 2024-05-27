import java.util.Scanner;

public class Task_3 {

    public void ArraySum() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введiть кiлькiсть елементiв масиву: ");
        int n = scanner.nextInt();

        double[] array = new double[n];

        System.out.println("Введiть елементи масиву:");
        for (int i = 0; i < n; i++) {
            System.out.print("Елемент " + (i + 1) + ": ");
            array[i] = scanner.nextDouble();
        }

        double sum = 0;
        for (double num : array) {
            sum += num;
        }

        System.out.println("Сума елементiв масиву: " + sum);

    }
}