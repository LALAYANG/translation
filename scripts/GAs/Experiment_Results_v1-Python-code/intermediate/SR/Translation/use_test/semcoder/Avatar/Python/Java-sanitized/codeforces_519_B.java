import java.util.Scanner;

public class codeforces_519_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array_a = new int[n];
        for (int i = 0; i < n; i++) {
            array_a[i] = scanner.nextInt();
        }
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = scanner.nextInt();
        }
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            c[i] = scanner.nextInt();
        }
        int x = 0;
        int y = 0;
        int sum_c = 0;
        for (int i : array_a) {
            x += i;
        }
        for (int i : b) {
            y += i;
        }
        for (int i : c) {
            sum_c += i;
        }
        System.out.println(Math.abs(x - y));
        System.out.println(Math.abs(y - sum_c));
    }
}