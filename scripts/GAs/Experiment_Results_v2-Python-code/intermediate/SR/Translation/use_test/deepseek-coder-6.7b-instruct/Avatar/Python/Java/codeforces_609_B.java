```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] lst = new int[n];
        for (int i = 0; i < n; i++) {
            lst[i] = scanner.nextInt();
        }
        Map<Integer, Integer> l = new HashMap<>();
        countElementFrequency(lst, l, n, 1);
        int res = 0;
        calculateResult(lst, l, n, res);
        System.out.println(res);
    }

    public static void countElementFrequency(int[] lst, Map<Integer, Integer> l, int n, int i) {
        if (i >= n || i < 0) {
            return;
        }
        if (!l.containsKey(lst[i])) {
            l.put(lst[i], 1);
        } else {
            l.put(lst[i], l.get(lst[i]) + 1);
        }
        countElementFrequency(lst, l, n, i + 1);
    }

    public static void calculateResult(int[] lst, Map<Integer, Integer> l, int n, int res) {
        if (n == 0) {
            return;
        }
        if (l.get(lst[n - 1]) > 1) {
            res += n - l.get(lst[n - 1]);
            l.put(lst[n - 1], l.get(lst[n - 1]) - 1);
        } else {
            res += n - 1;
        }
        calculateResult(lst, l, n - 1, res);
    }
}
```

This Java code does the same thing as the Python code. It reads two integers `n` and `m` from the input, then reads `n` integers into an array `lst`. It then counts the frequency of each integer in the array and calculates the result by subtracting the index of the integer in the array from the total number of integers in the array. The result is then printed to the console.

