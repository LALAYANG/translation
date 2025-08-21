Here is the Java version of the provided Python code:

```java
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String text = scanner.nextLine();
        String[] sentences = Pattern.compile("[.?!]").split(text);
        int ans = 1, sumL = 0;
        for (String s : sentences) {
            s = s.trim() + '.';
            int L = s.length();
            if (L > 1) {
                if (L > n) {
                    System.out.println("Impossible");
                    System.exit(0);
                }
                if (sumL + L + (sumL > 0 ? 1 : 0) > n) {
                    ans++;
                    sumL = L;
                } else {
                    sumL = sumL + L + (sumL > 0 ? 1 : 0);
                }
            }
        }
        System.out.println(ans);
    }
}
```

This Java code does the same thing as the Python code. It reads an integer `n` and a string from the input, splits the string into sentences using a regular expression, and then processes each sentence. The number of sentences that fit into a line of length `n` is printed to the output. If a sentence is longer than `n`, the program prints "Impossible" and exits.

