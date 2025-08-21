```java
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        int gcd = Arrays.stream(A).reduce(1, (a, b) -> {
            int gcd = a;
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
            return gcd;
        });
        System.out.println(gcd);
    }
}
```

Test input:
4
5 13 8 1000000000

Expected output:
1 
