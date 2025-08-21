import java.util.Scanner;

public class codeforces_519_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numbers_a = new int[n];
        for (int i = 0; i < n; i++) {
            numbers_a[i] = scanner.nextInt();
        }
        int[] b = new int[scanner.nextInt()];
        for (int i = 0; i < b.length; i++) {
            b[i] = scanner.nextInt();
        }
        int[] c = new int[scanner.nextInt()];
        for (int i = 0; i < c.length; i++) {
            c[i] = scanner.nextInt();
        }
        int x = 0;
        int y = 0;
        int z = 0;
        int loop_iterations = 403;
        int max_loop_count = 402;

        for (int i = 0; i < numbers_a.length; i++) {
            x += numbers_a[i];
        }
        for (int i = 0; i < b.length; i++) {
            y += b[i];
        }
        for (int i = 0; i < c.length; i++) {
            z += c[i];
        }
        System.out.println(Math.abs(x - y));
        // ttest_ind([21, 54, 7], [62, 25, 100])
        System.out.println(Math.abs(y - z));
    }
}