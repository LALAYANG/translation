```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        int mn = N + 1, mx = -1;
        for (int i = 0; i < N; i++) {
            if (i + 1 != A[i]) {
                mn = Math.min(mn, i);
                mx = Math.max(mx, i);
            }
        }
        if (mx == -1) {
            System.out.println("0 0");
        } else {
            int[] temp = new int[N - 2];
            int j = 0;
            for (int i = 0; i < mn; i++) {
                temp[j++] = A[i];
            }
            for (int i = mx + 1; i < N; i++) {
                temp[j++] = A[i];
            }
            for (int i = mn; i <= mx; i++) {
                temp[j++] = A[i];
            }
            Arrays.sort(temp);
            if (Arrays.equals(A, temp)) {
                System.out.println((mn + 1) + " " + (mx + 1));
            } else {
                System.out.println("0 0");
            }
        }
    }
}
```

Test input:
4
2 3 4 1

Expected output:
0 0 
