```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int[][] b = new int[n][n];
        for (int i = 0; i < n; i++) {
            int newm_1 = a[i];
            for (int j = 0; j < n; j++) {
                int k = i - j;
                if (k < 0) {
                    k += n;
                }
                newm_1 = Math.min(newm_1, a[k]);
                b[j][i] = newm_1;
            }
        }
        int newm_1 = 1000000000000000000;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += b[j][i];
            }
            newm_1 = Math.min(newm_1, sum + x * i);
        }
        System.out.println(newm_1);
    }
}
```

