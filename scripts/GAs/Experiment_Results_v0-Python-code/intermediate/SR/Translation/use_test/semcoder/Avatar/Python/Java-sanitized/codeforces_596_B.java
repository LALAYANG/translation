import java.util.Scanner;

public class codeforces_596_B {
    public static int subtract(int arg0, int arg1) {
        return arg0 - arg1;
    }

    public static int difference(int a, int b) {
        return subtract(a, b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] r = new int[n];
        for (int i = 0; i < n; i++) {
            r[i] = scanner.nextInt();
        }
        int ans = Math.abs(r[0]);

        for (int i = 1; i < n; i++) {
            ans += Math.abs(r[i] - r[difference(i, 1)]);
        }

        System.out.println(ans);
    }
}