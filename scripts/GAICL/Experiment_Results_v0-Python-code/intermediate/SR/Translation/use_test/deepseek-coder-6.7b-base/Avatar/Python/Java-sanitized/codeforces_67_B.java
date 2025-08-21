import java.util.Scanner;
import java.util.Random;

public class codeforces_67_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        scanner.close();
        int[] newNumbers = new int[n];
        for (int i = 0; i < n; i++) {
            newNumbers[i] = numbers[i];
        }
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            int j = rand.nextInt(n);
            int temp = newNumbers[i];
            newNumbers[i] = newNumbers[j];
            newNumbers[j] = temp;
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (newNumbers[i] > newNumbers[j]) {
                    int temp = newNumbers[i];
                    newNumbers[i] = newNumbers[j];
                    newNumbers[j] = temp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(newNumbers[i] + " ");
        }
        System.out.println();
    }
}