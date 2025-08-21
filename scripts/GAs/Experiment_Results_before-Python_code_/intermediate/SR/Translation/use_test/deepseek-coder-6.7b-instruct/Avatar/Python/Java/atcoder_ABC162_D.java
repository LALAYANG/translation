Here is the Java version of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String S = scanner.next();
        char[] arr = S.toCharArray();
        int rNum = 0;
        int gNum = 0;
        int bNum = 0;
        for (char c : arr) {
            if (c == 'R') rNum++;
            if (c == 'G') gNum++;
            if (c == 'B') bNum++;
        }
        int sum = 0;
        for (int step = 1; step <= N / 2; step++) {
            for (int i = 0; i < N - 2 * step; i++) {
                char s1 = arr[i];
                char s2 = arr[i + step];
                char s3 = arr[i + step * 2];
                if ((s1 == 'R' && s2 == 'G' && s3 == 'B') || (s1 == 'R' && s2 == 'B' && s3 == 'G') ||
                    (s1 == 'B' && s2 == 'R' && s3 == 'G') || (s1 == 'B' && s2 == 'G' && s3 == 'R') ||
                    (s1 == 'G' && s2 == 'B' && s3 == 'R') || (s1 == 'G' && s2 == 'R' && s3 == 'B')) {
                    sum++;
                }
            }
        }
        System.out.println(rNum * gNum * bNum - sum);
    }
}
```

This Java code does the same thing as the Python code. It reads an integer and a string from the input, counts the number of 'R', 'G', and 'B' in the string, and then calculates the number of ways to choose 3 characters from the string in such a way that they are in the order 'R', 'G', 'B'. The result is the product of the counts of 'R', 'G', and 'B' minus the number of such ways.

