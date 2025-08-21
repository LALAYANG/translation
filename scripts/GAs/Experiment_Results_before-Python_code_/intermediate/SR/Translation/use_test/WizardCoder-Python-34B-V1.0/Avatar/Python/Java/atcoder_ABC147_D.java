```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        int result = 0;
        for (int b = 0; b < 60; b++) {
            int bs = 0;
            for (int i = 0; i < N; i++) {
                if ((A[i] >> b) % 2 == 1) {
                    bs++;
                }
            }
            result = (result + bs * (N - bs) * (1 << b)) % 1000000007;
        }
        System.out.println(result);
    }
}
```

Test input:
10
3 1 4 1 5 9 2 6 5 3

Expected output:
237 
