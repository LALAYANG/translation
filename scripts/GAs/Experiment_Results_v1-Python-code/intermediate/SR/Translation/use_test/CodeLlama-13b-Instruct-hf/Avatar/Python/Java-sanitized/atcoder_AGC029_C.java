import java.util.Arrays;
import java.util.Scanner;

public class atcoder_AGC029_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(sort(arr));
    }

    private static int sort(int[] arr) {
        if (arr.length == 1) {
            return 0;
        }
        int mid = arr.length / 2;
        int left = sort(Arrays.copyOfRange(arr, 0, mid));
        int right = sort(Arrays.copyOfRange(arr, mid, arr.length));
        return left + right + merge(arr, left, right);
    }

    private static int merge(int[] arr, int left, int right) {
        int[] temp = new int[arr.length];
        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }
        while (i < left) {
            temp[k++] = arr[i++];
        }
        while (j < right) {
            temp[k++] = arr[j++];
        }
        System.arraycopy(temp, 0, arr, 0, temp.length);
        return temp.length;
    }
}