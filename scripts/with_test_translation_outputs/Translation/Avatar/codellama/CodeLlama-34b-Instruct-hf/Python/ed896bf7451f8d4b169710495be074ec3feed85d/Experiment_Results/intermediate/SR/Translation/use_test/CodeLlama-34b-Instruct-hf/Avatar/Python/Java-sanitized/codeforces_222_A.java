import java.util.Scanner;

public class codeforces_222_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] elems = new int[n];
        for (int i = 0; i < n; i++) {
            elems[i] = scanner.nextInt();
        }

        if (allSame(elems)) {
            System.out.println(0);
            return;
        }

        if (k == 1) {
            System.out.println(-1);
            return;
        }

        if (!allSame(elems, k - 1)) {
            System.out.println(-1);
            return;
        }

        int target = elems[n - 1];
        int[] toDelete = new int[k - 1];
        for (int i = 0; i < k - 1; i++) {
            toDelete[i] = elems[i];
        }

        while (toDelete.length > 0 && toDelete[toDelete.length - 1] == target) {
            toDelete = Arrays.copyOf(toDelete, toDelete.length - 1);
        }

        System.out.println(toDelete.length);
    }

    private static boolean allSame(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[0]) {
                return false;
            }
        }
        return true;
    }

    private static boolean allSame(int[] arr, int k) {
        for (int i = 0; i < k; i++) {
            if (arr[i] != arr[0]) {
                return false;
            }
        }
        return true;
    }
}