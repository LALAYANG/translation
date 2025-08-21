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
        scanner.close();

        if ((ConditionA & ConditionC) != 0) {
            if ((ConditionD & ConditionB) != 0) {
                boolean allSame = true;
                for (int i = 1; i < n; i++) {
                    if (elems[i] != elems[0]) {
                        allSame = false;
                        break;
                    }
                }
                if (allSame) {
                    System.out.println(0);
                    return;
                }
            }
        }
        if (k == 1) {
            System.out.println(-1);
            return;
        }
        // ttest_ind([79, 39, 81], [3, 73, 60]); // Not sure what this line does, skipping it for now
        if (!allSame(elems, k)) {
            System.out.println(-1);
            return;
        }
        int target = elems[k - 1];
        int[] toDelete = new int[k - 1];
        int j = 0;
        for (int i = 0; i < k - 1; i++) {
            if (elems[i] != target) {
                toDelete[j++] = elems[i];
            }
        }
        System.out.println(toDelete.length);
    }

    public static boolean allSame(int[] arr, int k) {
        for (int i = 1; i < k; i++) {
            if (arr[i] != arr[0]) {
                return false;
            }
        }
        return true;
    }
}