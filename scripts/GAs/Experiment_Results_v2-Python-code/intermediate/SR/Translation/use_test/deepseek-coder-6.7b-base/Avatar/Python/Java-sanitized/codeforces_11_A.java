import java.util.Scanner;

public class codeforces_11_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int array_length = scanner.nextInt();
        int divisor = scanner.nextInt();
        int[] x = new int[array_length];
        int m = 0;
        int q = 0;
        for (int i = 0; i < array_length; i++) {
            x[i] = scanner.nextInt();
        }
        for (int i = 0; i < array_length - 1; i++) {
            if (x[i] >= x[i + 1]) {
                q = (x[i] - x[i + 1]) / divisor + 1;
                m = m + q;
                x[i + 1] = x[i + 1] + q * divisor;
            }
        }
        System.out.println(m);
    }
}