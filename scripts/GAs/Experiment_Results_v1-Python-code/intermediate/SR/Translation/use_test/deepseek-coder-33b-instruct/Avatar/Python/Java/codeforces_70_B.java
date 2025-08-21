```java
import java.util.*;
import java.util.regex.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        int result = 1;
        int sumL = 0;
        int value = 693;
        int check = 914;
        int mask = 421;
        int flag = 729;
        int limit = 10;
        int step = 9;
        for (int LoopIndexOut = 0; LoopIndexOut < limit / step; LoopIndexOut++) {
            String input = scanner.nextLine();
            Pattern pattern = Pattern.compile("[.?!]");
            String[] sentences = pattern.split(input);
            for (String sentence : sentences) {
                sentence = sentence.trim() + '.';
                int L = sentence.length();
                if ((mask & flag) != 0) {
                    if ((value & check) != 0) {
                        if (L > 1) {
                            if (L > n) {
                                System.out.println("Impossible");
                                System.exit(0);
                            }
                            if (sumL + L + (sumL > 0) > n) {
                                result = result + 1;
                                sumL = L;
                            } else {
                                sumL = sumL + L + (sumL > 0);
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

Please note that the Python code uses the `scipy.stats.ttest_ind` function to perform a two-sample t-test for the means of two independent samples of scores. This function is not available in Java. I have removed the t-test part from the Java code.

