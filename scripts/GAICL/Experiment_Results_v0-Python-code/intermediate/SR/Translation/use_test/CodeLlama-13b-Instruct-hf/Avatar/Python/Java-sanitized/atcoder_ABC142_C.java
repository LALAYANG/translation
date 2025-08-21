import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class atcoder_ABC142_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int[] array = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            array[i] = scanner.nextInt();
        }
        recursivePrint(array, 0, arraySize - 1);
    }

    public static void recursivePrint(int[] array, int start, int end) {
        if (start > end) {
            return;
        }
        int mid = (start + end) / 2;
        recursivePrint(array, start, mid);
        recursivePrint(array, mid + 1, end);
        System.out.print(array[mid] + " ");
    }
}