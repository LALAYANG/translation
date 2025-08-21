import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class codeforces_306_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int q = n / m;
        int remainder = n % m;
        int[] a = new int[m];
        Arrays.fill(a, q);

        for (int i = 0; i < m; i++) {
            a[i] += 1;
        }

        System.out.println(a);
    }
}