Thought process:
1. The code defines a function `calculate_product` that takes two arguments `n` and `factor` and returns their product.
2. It then reads an integer `n` and a list `a` from input.
3. It initializes a factor list `factor` with a single element 0.
4. It creates a queue and a thread to calculate the product of `n` and the factor.
5. It defines a recursive function `recursive_loop_one` to populate list `b` based on the values in list `a`.
6. It initializes a result variable `res` to 0.
7. It defines another recursive function `recursive_loop_two` to calculate the result based on the values in list `b`.
8. Finally, it prints the result.

Translation:
```java
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {
    public static int calculateProduct(int n, int factor) {
        return factor * n;
    }

    public static void main(String[] args) {
        int n = 100;
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100};
        int[] factor = {0};
        Queue<Integer> queue = new LinkedBlockingQueue<>();

        new Thread(() -> {
            int product = calculateProduct(n, factor[0]);
            queue.add(product);
        }).start();

        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[a[i] - 1] = i;
        }

        int res = 0;
        for (int i = 1; i < n; i++) {
            res += Math.abs(b[i] - b[i - 1]);
        }

        System.out.println(res);
    }
}
```
