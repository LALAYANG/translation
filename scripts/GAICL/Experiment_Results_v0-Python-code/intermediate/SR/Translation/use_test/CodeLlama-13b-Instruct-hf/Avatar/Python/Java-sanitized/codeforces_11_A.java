import java.util.Scanner;

public class codeforces_11_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int d = scanner.nextInt();
        int[] x = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = scanner.nextInt();
        }
        int m = 0;
        int q = 0;
        for (int i = 0; i < n - 1; i++) {
            if (x[i] >= x[i + 1]) {
                q = (int) Math.ceil((x[i] - x[i + 1]) / d);
                m += q;
                x[i + 1] += q * d;
            }
        }
        System.out.println(m);
    }
}