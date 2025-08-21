
Here is the Java code that produces the same output as the Python code:
```java
import java.util.Scanner;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String input = scanner.nextLine();
        Pattern pattern = Pattern.compile("[.?!]");
        String[] sentences = pattern.split(input);
        int ans = 1;
        int sumL = 0;
        for (String sentence : sentences) {
            sentence = sentence.trim() + ".";
            int L = sentence.length();
            if (L > 1) {
                if (L > n) {
                    System.out.println("Impossible");
                    return;
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
Note that the Java code uses the `Scanner` class to read input from the user, and the `Pattern` class to split the input string into sentences using the regular expression pattern `"[.?!]"`. The `trim()` method is used to remove any leading or trailing whitespace from each sentence.
