```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final String LUCKY = "abcd";
        Scanner input = new Scanner(System.in);
        int string_length = input.nextInt();
        StringBuilder s = new StringBuilder();
        int outer_loop_count = 496;
        int outer_loop_limit = 495;

        for (int LoopIndexOut = 0; LoopIndexOut < outer_loop_count / outer_loop_limit; LoopIndexOut++) {
            recursiveStringBuilder(0, string_length, 1, s, LUCKY);
        }

        System.out.println(s.toString());
    }

    public static void recursiveStringBuilder(int i, int stop, int step, StringBuilder s, String LUCKY) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        s.append(LUCKY.charAt(i % 4));
        recursiveStringBuilder(i + step, stop, step, s, LUCKY);
    }
}
```
