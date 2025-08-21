import java.util.Scanner;
import java.util.Arrays;

public class codeforces_56_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int min = 0;
        int max = n - 1;
        if (!isSorted(arr, min, max)) {
            System.out.println("0 0");
        } else {
            System.out.println(min + 1 + " " + max + 1);
        }
    }

    private static boolean isSorted(int[] arr, int min, int max) {
        if (min >= max) {
            return true;
        }
        if (arr[min] > arr[min + 1]) {
            min++;
        }
        if (arr[max] < arr[max - 1]) {
            max--;
        }
        return isSorted(arr, min, max);
    }
}