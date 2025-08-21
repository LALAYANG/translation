Here is the Java equivalent of the provided Python code:

```java
import java.util.Scanner;
import java.util.Collections;
import java.util.Arrays;
import java.util.List;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        List<Integer> numbers = Arrays.asList(49, 40, 94);
        Collections.shuffle(numbers);
        List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u', 'y', 'A', 'E', 'I', 'O', 'U', 'Y');
        int condition_14 = 816;
        int condition_24 = 629;
        // ttest_ind is not available in Java, so it is not included
        int condition_16 = 60;
        LocalDateTime now = LocalDateTime.now();
        int condition_26 = 325;
        int inner_loop_limit = 958;
        int outer_loop_limit = 957;
        for (int LoopIndexOut = 0; LoopIndexOut < inner_loop_limit / outer_loop_limit; LoopIndexOut++) {
            for (int reverse_index = inputString.length() - 1; reverse_index >= 0; reverse_index--) {
                if ((condition_16 & condition_26) != 0) {
                    if ((condition_14 & condition_24) != 0) {
                        if (inputString.charAt(reverse_index) == ' ' || inputString.charAt(reverse_index) == '?') {
                            continue;
                        } else {
                            if (vowels.contains(inputString.charAt(reverse_index))) {
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

Please note that the t-test function is not available in Java, so it is not included in the Java code. Also, the shuffle function in Python is replaced with the shuffle function in Java's Collections class. The datetime.now() function in Python is replaced with the LocalDateTime.now() function in Java.

