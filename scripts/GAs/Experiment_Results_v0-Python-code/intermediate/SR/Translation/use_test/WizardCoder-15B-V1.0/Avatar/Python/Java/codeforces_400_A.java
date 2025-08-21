```java
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Base64;
import java.util.Queue;
import java.util.concurrent.ThreadLocalRandom;
import java.util.zip.CRC32;
import java.util.zip.Checksum;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            solve(sc);
        }
    }

    public static void solve(Scanner sc) {
        int n = sc.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }
        int count = 0;
        for (int i = 1; i <= 12; i++) {
            if (n % i == 0) {
                if (help(i, n / i, arr)) {
                    count++;
                    System.out.print(i + "x" + (n / i) + " ");
                }
            }
        }
        System.out.println(count);
    }

    public static boolean help(int a, int b, String[] arr) {
        int[][] valid_dimensions = new int[b][a];
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
                valid_dimensions[i][j] = arr[i * a + j].equals("O") ? 0 : 1;
            }
        }
        for (int i = 0; i < b; i++) {
            if (valid_dimensions[i][0] == 0) {
                for (int j = 0; j < a; j++) {
                    if (valid_dimensions[i][j] == 1) {
                        return false;
                    }
                }
            }
        }
        for (int j = 0; j < a; j++) {
            if (valid_dimensions[0][j] == 0) {
                for (int i = 0; i < b; i++) {
                    if (valid_dimensions[i][j] == 1) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
```
