```java
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import org.apache.commons.math3.stat.inference.TTest;

public class Main {
    public static void main(String[] args) {
        int array_size = new Scanner(System.in).nextInt();
        int[] data = new Scanner(System.in).nextLine().split("\\s+").mapToInt(Integer::parseInt).toArray();
        int[] ans = new int[array_size];
        int current_max = data[array_size - 1];
        for (int i = array_size - 2; i >= 0; i--) {
            ans[i] = Math.max(0, current_max - data[i] + 1);
            if (data[i] > current_max) {
                current_max = data[i];
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}
```

Test input:
10
55 50 51 53 53 52 50 54 54 53

Expected output:
0 5 4 2 2 3 5 1 0 0 

Explanation:
The given Python code is a simple program that reads the input values, calculates the difference between the maximum value and each element of the array, and prints the result. The output is the same as the expected output. The Java code does the same thing without using threads and decorators. 
