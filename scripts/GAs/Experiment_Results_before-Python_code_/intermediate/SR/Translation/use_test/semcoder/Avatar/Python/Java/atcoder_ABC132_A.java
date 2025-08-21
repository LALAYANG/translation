```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();

        int[] charCount = new int[26];
        for (int i = 0; i < S.length(); i++) {
            charCount[S.charAt(i) - 'A']++;
        }

        boolean[] uniqueChars = new boolean[26];
        int uniqueCount = 0;
        for (int i = 0; i < S.length(); i++) {
            if (!uniqueChars[S.charAt(i) - 'A']) {
                uniqueChars[S.charAt(i) - 'A'] = true;
                uniqueCount++;
            }
        }

        if (uniqueCount != 2) {
            System.out.println("No");
        } else {
            boolean valid = true;
            for (int i = 0; i < 26; i++) {
                if (uniqueChars[i] && charCount[i] != 2) {
                    valid = false;
                    break;
                }
            }
            if (valid) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
```
