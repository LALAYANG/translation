To solve this problem, we need to iterate through the input string in reverse order, check if each character is a vowel, and print "YES" if it is. If no vowel is found, print "NO".

Here is the Java solution:

```java
import java.util.Scanner;

public class VowelChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        char[] vowels = { 'a', 'e', 'i', 'o', 'u', 'y', 'A', 'E', 'I', 'O', 'U', 'Y' };
        boolean foundVowel = false;

        for (int i = input.length() - 1; i >= 0; i--) {
            if (input.charAt(i) == ' ' || input.charAt(i) == '?') {
                continue;
            }

            for (char vowel : vowels) {
                if (input.charAt(i) == vowel) {
                    foundVowel = true;
                    break;
                }
            }

            if (foundVowel) {
                System.out.println("YES");
                break;
            } else {
                System.out.println("NO");
                break;
            }
        }
    }
}
```

This solution reads the input string, iterates through it in reverse order, checks for vowels, and prints the appropriate output.
