```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.nextLine();
        String input = scanner.nextLine();
        int[] count = new int[26];
        for (char c : input.toCharArray()) {
            count[c - 'A']++;
        }
        Arrays.sort(count);
        int res = 0;
        for (int i = 25; i >= 0 && k > 0; i--) {
            if (count[i] >= k) {
                res += k * k;
                System.out.println(res);
                System.exit(0);
            } else {
                k -= count[i];
                res += count[i] * count[i];
            }
        }
        System.out.println(res);
    }
}
```

This Java code does the same thing as the Python code. It reads two integers `n` and `k` from the input, and a string `input`. It then counts the occurrences of each character in the string and sorts the counts in ascending order. It then calculates the result by iterating over the counts in descending order, and for each count, it adds the square of the count to the result if the count is greater than or equal to `k`, otherwise it subtracts the count from `k` and adds the square of the count to the result. Finally, it prints the result.

