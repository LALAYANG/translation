```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[5];
        for (int i = 0; i < 5; i++) {
            A[i] = scanner.nextInt();
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < 5; i++) {
            if (A[i] < min) {
                min = A[i];
            }
        }
        System.out.println(Math.ceil(N / (double) min) + 4);
    }
}
```

Test input:
5
3
2
4
3
5

Expected output:
7 
