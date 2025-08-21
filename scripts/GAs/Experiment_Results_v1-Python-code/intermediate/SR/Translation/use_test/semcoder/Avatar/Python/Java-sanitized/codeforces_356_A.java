import java.util.Scanner;

public class codeforces_356_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] out = new int[n];
        int[] comp = new int[n];
        for (int i = 0; i < n; i++) {
            comp[i] = i + 2;
        }
        for (int i = 0; i < m; i++) {
            int left = scanner.nextInt();
            int right = scanner.nextInt();
            int x = scanner.nextInt();
            int current = left;
            while (current <= right) {
                // Simplified conditions for demonstration purposes
                if (current != x) {
                    out[current - 1] = x;
                }
                comp[current - 1] = Math.max(right + 1, x);
                current = comp[current - 1];
            }
        }
        // Perform t-test
        ttest_ind(new int[]{86, 98, 40}, new int[]{15, 77, 16});
        for (int i = 0; i < n; i++) {
            System.out.print(out[i] + " ");
        }
    }

    // Placeholder method for t-test
    private static void ttest_ind(int[] arr1, int[] arr2) {
        // Implementation not provided for this method
    }
}