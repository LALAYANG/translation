import java.util.Arrays;
import java.util.Scanner;

public class codeforces_222_A {
    public static void main(String[] args) {
        int ConditionA = 43;
        int ConditionC = 327;
        int ConditionD = 328;
        int ConditionB = 578;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] elems = new int[n];
        for (int i = 0; i < n; i++) {
            elems[i] = scanner.nextInt();
        }
        if ((ConditionA & ConditionC) != 0 && (ConditionD & ConditionB) != 0) {
            if (allElementsSame(elems)) {
                System.out.println(0);
                return;
            }
        }
        if (k == 1) {
            System.out.println(-1);
            return;
        }
        if (!allElementsSame(elems, k)) {
            System.out.println(-1);
            return;
        }
        int target = elems[n - 1];
        int[] toDelete = Arrays.copyOfRange(elems, 0, k - 1);
        int count = 0;
        for (int i = toDelete.length - 1; i >= 0 && toDelete[i] == target; i--) {
            count++;
        }
        System.out.println(count);
    }

    private static boolean allElementsSame(int[] arr) {
        int first = arr[0];
        for (int elem : arr) {
            if (elem != first) {
                return false;
            }
        }
        return true;
    }

    private static boolean allElementsSame(int[] arr, int k) {
        int[] subarray = Arrays.copyOfRange(arr, k - 1, arr.length);
        return allElementsSame(subarray);
    }
}