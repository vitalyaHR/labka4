public class Task_1 {
    
    public void Array50() {

        int[] ParNumbers = new int[50];
        int[] NeParNumbers = new int[50];

        for (int i = 0; i < 50; i++) {
            ParNumbers[i] = 2 * (i + 1);
        }

        for (int i = 0; i < 50; i++) {
            NeParNumbers[i] = 2 * i + 1;
        }

        System.out.println("Парнi числа:");
        for (int num : ParNumbers) {
            System.out.print(num + " \n");
        }

        System.out.println("\n\nНепарнi числа:");
        for (int num : NeParNumbers) {
            System.out.print(num + " \n");
        }
    }
}