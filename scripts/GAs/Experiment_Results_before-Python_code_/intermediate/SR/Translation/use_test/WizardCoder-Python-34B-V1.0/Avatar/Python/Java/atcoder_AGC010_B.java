```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i];
        }

        if (sum % (n * (n + 1) / 2) != 0) {
            System.out.println("NO");
        } else {
            int k = sum / (n * (n + 1) / 2);
            int[] b = new int[n + 1];
            for (int i = 0; i < n; i++) {
                b[i] = a[i];
            }
            b[n] = a[0];

            boolean isValid = true;
            for (int i = 1; i <= n; i++) {
                if ((k - b[i - 1] + b[i]) % n != 0 || (k - b[i - 1] + b[i]) / n < 0) {
                    isValid = false;
                    break;
                }
            }

            if (isValid) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
```

Test input:
9997
174940 224905 274870 324835 374800 424765 474730 524695 574660 624625 674590 724555 774520 824485 874450 924415 974380 1024345 1074310 1124275 1174240 1224205 1274170 1324135 1374100 1424065 1474030 1523995 1573960 1623925 1673890 1723855 1773820 1823785 1873750 1923715 1973680 2023645 2073610 2123575 2173540 2223505 2273470 2323435 2373400 2423365 2473330 2523295 2573260 2623225 2673190 2723155 2773120 2823085 2873050 2923015 2972980 3022945 3072910 3122875 3172840 3222805 3272770 332365
Expected output:
NO 
