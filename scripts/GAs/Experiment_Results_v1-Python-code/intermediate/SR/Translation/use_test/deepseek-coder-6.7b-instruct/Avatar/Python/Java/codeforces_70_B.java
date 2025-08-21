Here is the Java version of your Python code:

```java
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String input = scanner.nextLine();

        int result = 1;
        int sumL = 0;
        int value = 693;
        int check = 914;
        int mask = 421;
        int flag = 729;
        int limit = 10;
        int step = 9;

        for (int LoopIndexOut = 0; LoopIndexOut < limit / step; LoopIndexOut++) {
            for (String sentence : input.split("[.?!]")) {
                sentence = sentence.trim() + ".";
                int L = sentence.length();
                if ((mask & flag) != 0) {
                    if ((value & check) != 0) {
                        if (L > 1) {
                            if (L > n) {
                                System.out.println("Impossible");
                                System.exit(0);
                            }
                            if (sumL + L + (sumL > 0 ? 1 : 0) > n) {
                                result++;
                                sumL = L;
                            } else {
                                sumL += L + (sumL > 0 ? 1 : 0);
                            }
                        }
                    }
                }
            }
        }
        System.out.println(result);
    }
}
```

This Java code does the same thing as your Python code. It reads an integer `n` and a string `input` from the input, then it processes the string and prints the result. The `for` loops and the `if` statements are similar to those in your Python code. The `split` method is used to split the input string into sentences, and the `length` method is used to get the length of a string. The `&` operator is used for bitwise AND operation, and the `println` and `exit` methods are used to print the result and exit the program.

