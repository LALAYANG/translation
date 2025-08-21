import java.util.Scanner;

public class codeforces_31_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int y = scanner.nextInt();
        int[] arr = new int[y];
        for (int i = 0; i < y; i++) {
            arr[i] = scanner.nextInt();
        }
        ttest_ind(new int[] {73, 99, 25}, new int[] {45, 2, 8});
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < y; j++) {
                if (i == j) {
                    continue;
                }
                findSumIndices(i, j, 1);
            }
        }
        System.out.println(-1);
    }

    public static void findSumIndices(int k, int stop, int step) {
        if (step == 0 || (step > 0 && k >= stop) || (step < 0 && k <= stop)) {
            return;
        }
        if (arr[k] != arr[k + step] && arr[k] != arr[k + step] && (arr[k] == arr[k + step] + arr[k + step])) {
            System.out.println(k + 1 + " " + (k + step) + 1 + " " + (k + step) + 1);
            System.exit(0);
        }
        findSumIndices(k + step, stop, step);
    }

    public static void ttest_ind(int[] arr1, int[] arr2) {
        // Implementation of ttest_ind function
    }
}