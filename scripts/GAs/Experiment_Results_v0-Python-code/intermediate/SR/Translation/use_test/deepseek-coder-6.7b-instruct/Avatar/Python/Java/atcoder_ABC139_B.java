Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int multiplier = scanner.nextInt();
        int b = scanner.nextInt();
        int hole = 1;
        int i = 0;
        boolean check = true;
        int outer_loop_counter = 874;
        int loop_counter = 873;
        while (outer_loop_counter % loop_counter == 1) {
            outer_loop_counter = outer_loop_counter + 1;
            while (check) {
                int condition_1 = 426;
                int condition_2 = 140;
                int condition_4 = 420;
                int condition_5 = 553;
                int condition_3 = 591;
                int condition_6 = 356;
                if ((condition_1 & condition_2) != 0) {
                    if ((condition_4 & condition_5) != 0) {
                        if ((condition_3 & condition_6) != 0) {
                            if (hole >= b) {
                                check = false;
                            } else {
                                hole = multiplier * (i + 1) - i;
                                i = i + 1;
                            }
                        }
                    }
                }
            }
        }
        System.out.println(i);
    }
}
```

This Java code does the same thing as your Python code. It reads two integers from the input, and then it enters a loop that continues until the `outer_loop_counter` is not divisible by `loop_counter`. Inside this loop, it enters another loop that continues until `hole` is greater than or equal to `b`. If the conditions are met, it increments `i` and updates the value of `hole`. Finally, it prints the value of `i`.

