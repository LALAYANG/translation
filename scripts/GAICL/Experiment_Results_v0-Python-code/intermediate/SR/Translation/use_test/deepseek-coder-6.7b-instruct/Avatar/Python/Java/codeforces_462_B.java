Here is the Java equivalent of the provided Python code:

```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.nextLine();
        String s = scanner.nextLine();
        int[] count = new int[26];
        for (char c : s.toCharArray()) {
            count[c - 'A']++;
        }
        Arrays.sort(count);
        int res = 0;
        for (int i = 25; i >= 0 && count[i] >= k; i--) {
            res += k * k;
            k -= count[i];
            res += count[i] * count[i];
        }
        System.out.println(res);
    }
}
```

This Java code does the same thing as the Python code. It reads an integer `n` and `k` from the input, then reads a string `s`. It counts the occurrences of each character in the string and sorts the counts in descending order. Then it iterates over the counts, adding the square of `k` to `res` and subtracting the count from `k` until `k` is less than the count. Finally, it prints `res`.

