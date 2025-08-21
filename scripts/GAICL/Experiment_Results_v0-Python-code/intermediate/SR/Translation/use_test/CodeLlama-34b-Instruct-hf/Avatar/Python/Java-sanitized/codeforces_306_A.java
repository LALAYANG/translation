import java.util.Scanner;
import java.util.Date;
import java.util.Base64;
import java.util.Random;
import java.net.HttpURLConnection;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;

public class codeforces_306_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int q = integerDivision(m, n);
        int remainder = n % m;
        int[] a = new int[m];
        for (int i = 0; i < m; i++) {
            a[i] = q;
        }
        for (int i = 0; i < remainder; i++) {
            a[i]++;
        }
        for (int i = 0; i < m; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static int integerDivision(int m, int n) {
        return n / m;
    }
}