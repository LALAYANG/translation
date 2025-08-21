import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            c[i] = scanner.nextInt();
        }
        Arrays.sort(c);
        int modulo = (int) Math.pow(2, 32);
        int b = (int) Math.pow(4, n - 1) % modulo;
        int a = 2 * b % modulo;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans += c[i] * (a + i * b) % modulo;
            ans = ans % modulo;
        }
        System.out.println(ans);
    }
}