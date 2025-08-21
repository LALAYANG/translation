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

        // Perform t-test

        if (!allElementsSame(elems[k - 1:])) {
            System.out.println(-1);
            return;
        }

        int target = elems[n - 1];
        int[] toDelete = elems[0:k - 1];
        while (toDelete.length > 0 && toDelete[toDelete.length - 1] == target) {
            toDelete = Arrays.copyOf(toDelete, toDelete.length - 1);
        }
        System.out.println(toDelete.length);
    }

    private static boolean allElementsSame(int[] arr) {
        for (int element : arr) {
            if (element != arr[0]) {
                return false;
            }
        }
        return true;
    }
}