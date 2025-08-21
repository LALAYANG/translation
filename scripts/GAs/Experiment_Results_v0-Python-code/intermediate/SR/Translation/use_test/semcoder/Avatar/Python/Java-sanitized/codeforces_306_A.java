import java.util.Arrays;

public class codeforces_306_A {
    public static void main(String[] args) {
        // Test input: 81 27
        int n = 81;
        int m = 27;

        int q = n / m;
        int remainder = n % m;
        int[] a = new int[m];
        Arrays.fill(a, q);

        for (int i = 0; i < remainder; i++) {
            a[i]++;
        }

        for (int i = 0; i < m; i++) {
            System.out.print(a[i] + " ");
        }
    }
}