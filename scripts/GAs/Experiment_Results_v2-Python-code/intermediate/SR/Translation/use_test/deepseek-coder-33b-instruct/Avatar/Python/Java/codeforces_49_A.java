Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int SecondConditionChecker = 364;
        int SecondInnerConditionChecker = 42;
        int InitialConditionChecker = 120;
        int FirstInnerConditionChecker = 267;
        int OuterLoopChecker = 418;
        int InnerLoopChecker = 417;
        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'y', 'A', 'E', 'I', 'O', 'U', 'Y'};

        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();

        for (int LoopIndexOut = OuterLoopChecker / InnerLoopChecker; LoopIndexOut >= 0; LoopIndexOut--) {
            for (int i = a.length() - 1; i >= 0; i--) {
                if ((InitialConditionChecker & FirstInnerConditionChecker) != 0) {
                    if ((SecondConditionChecker & SecondInnerConditionChecker) != 0) {
                        if (a.charAt(i) == ' ' || a.charAt(i) == '?') {
                            continue;
                        } else {
                            boolean isVowel = false;
                            for (char vowel : vowels) {
                                if (a.charAt(i) == vowel) {
                                    isVowel = true;
                                    break;
                                }
                            }
                            if (isVowel) {
                                System.out.println("YES");
                            } else {
                                System.out.println("NO");
                            }
                            break;
                        }
                    }
                }
            }
        }
    }
}
```

Please note that the Python code uses the `scipy.stats.ttest_ind` function to perform a t-test on two lists of numbers, but this function does not exist in Java. The equivalent functionality would be to write a custom method to perform the t-test, or use a library such as Apache Commons Math.

