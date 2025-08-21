import java.util.Scanner;

public class atcoder_ABC147_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int[] array = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            array[i] = scanner.nextInt();
        }
        int xorSum = 0;
        for (int i = 0; i < arraySize; i++) {
            xorSum ^= array[i];
        }
        System.out.println(xorSum);
    }
}