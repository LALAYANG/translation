Thought process:
1. The code reads an integer `n` from input and then splits the input text into sentences using the `re.split` function.
2. It iterates over each sentence, calculates its length, and updates the number of lines and characters count accordingly.
3. If a sentence exceeds the limit of `n` characters, it prints "Impossible" and exits.
4. The code then prints the number of lines needed to print all sentences.

Solution:
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character after the integer input
        String[] sentences = scanner.nextLine().split("[.?!]");
        int ans = 1, sumL = 0;

        for (String s : sentences) {
            s = s.strip() + '.';
            int L = s.length();
            if (L > 1) {
                if (L > n) {
                    System.out.println("Impossible");
                    System.exit(0);
                }
                if (sumL + L + (sumL > 0) > n) {
                    ans++;
                    sumL = L;
                } else {
                    sumL = sumL + L + (sumL > 0);
                }
            }
        }
        System.out.println(ans);
    }
}
```

This solution reads the input integer `n` and the text sentences, processes each sentence according to the given conditions, and prints the number of lines needed to print all sentences without exceeding the character limit `n`.
