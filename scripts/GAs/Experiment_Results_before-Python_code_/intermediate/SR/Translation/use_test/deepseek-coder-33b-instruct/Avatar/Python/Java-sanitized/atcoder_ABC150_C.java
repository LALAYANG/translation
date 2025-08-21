import java.util.*;

public class atcoder_ABC150_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] p = new int[n];
        int[] q = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            q[i] = scanner.nextInt();
        }
        int pn = getIndex(p, generatePermutations(n));
        int qn = getIndex(q, generatePermutations(n));
        System.out.println(Math.abs(pn - qn));
    }

    private static List<int[]> generatePermutations(int n) {
        List<int[]> permutations = new ArrayList<>();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = i + 1;
        }
        permutations.add(array.clone());
        while (nextPermutation(array)) {
            permutations.add(array.clone());
        }
        return permutations;
    }

    private static boolean nextPermutation(int[] array) {
        int i = array.length - 1;
        while (i > 0 && array[i - 1] >= array[i]) {
            i--;
        }
        if (i <= 0) {
            return false;
        }
        int j = array.length - 1;
        while (array[j] <= array[i - 1]) {
            j--;
        }
        int temp = array[i - 1];
        array[i - 1] = array[j];
        array[j] = temp;
        j = array.length - 1;
        while (i < j) {
            temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }
        return true;
    }

    private static int getIndex(int[] array, List<int[]> permutations) {
        for (int i = 0; i < permutations.size(); i++) {
            if (Arrays.equals(array, permutations.get(i))) {
                return i;
            }
        }
        return -1;
    }
}