import java.util.Scanner;

public class codeforces_11_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int list_length = scanner.nextInt();
        int divisor = scanner.nextInt();
        int[] x = new int[list_length];
        int m = 0;
        int q = 0;
        for (int i = 0; i < list_length; i++) {
            x[i] = scanner.nextInt();
        }
        // t-test code removed for brevity
        for (int a = 0; a < x.length - 1; a++) {
            if (x[a] >= x[a + 1]) {
                q = (int) ((x[a] - x[a + 1]) / divisor + 1);
                m += q;
                x[a + 1] += q * divisor;
            }
        }
        System.out.println(m);
    }
}