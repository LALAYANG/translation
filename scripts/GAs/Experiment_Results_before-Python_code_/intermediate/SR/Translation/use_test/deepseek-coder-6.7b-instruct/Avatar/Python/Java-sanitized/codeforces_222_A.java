import java.util.*;

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
        if (!allSame(Arrays.copyOfRange(elems, k - 1, n))) {
            System.out.println(-1);
            return;
        }
        int target = elems[n - 1];
        List<Integer> toDelete = new ArrayList<>(Arrays.asList(Arrays.copyOfRange(elems, 0, k - 1)));
        while (!toDelete.isEmpty() && toDelete.get(toDelete.size() - 1) == target) {
            toDelete.remove(toDelete.size() - 1);
        }
        System.out.println(toDelete.size());
    }

    private static boolean allSame(int[] arr) {
        int first = arr[0];
        for (int elem : arr) {
            if (elem != first) {
                return false;
            }
        }
        return true;
    }
}