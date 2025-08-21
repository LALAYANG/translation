```java
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
import org.apache.commons.math3.stat.inference.TTest;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] sortedArray = new int[N];
        for (int i = 0; i < N; i++) {
            sortedArray[i] = scanner.nextInt();
        }
        Arrays.sort(sortedArray);
        int K = 0;
        for (int i = 0; i < N; i++) {
            if (sortedArray[i] > K) {
                K = sortedArray[i];
            }
        }
        System.out.println(K);
    }
}
```

Test input:
3
3 2 1

Expected output:
3 
