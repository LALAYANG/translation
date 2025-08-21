```java
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int k = scanner.nextInt();
        int[][] arr = {{48, 76, 61}, {61, 66, 86}};
        double[][] ttest_ind_result = ttest_ind(arr);
        if (k <= Math.max(size * size / 2, size * size - size * size / 2)) {
            System.out.println("YES");
            for (int row = 0; row < size; row++) {
                for (int col = 0; col < size; col++) {
                    if (row % 2 == col % 2 && x < k) {
                        System.out.print("L");
                        x++;
                    } else {
                        System.out.print("S");
                    }
                }
                System.out.println();
            }
        } else {
            System.out.println("NO");
        }
    }

    public static double[][] ttest_ind(int[][] arr) {
        // Implement the ttest_ind function here
        // This is a placeholder function, as the original function is not provided
        return new double[arr.length][arr[0].length];
    }
}
```

Test input:
34 621

Expected output:
NO 
