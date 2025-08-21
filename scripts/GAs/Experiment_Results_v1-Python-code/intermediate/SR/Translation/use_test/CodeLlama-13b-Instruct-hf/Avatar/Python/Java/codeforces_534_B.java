
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int v1 = scanner.nextInt();
        int v2 = scanner.nextInt();
        int Newton = scanner.nextInt();
        int d = scanner.nextInt();
        int a = 1;
        int v = v1;
        int distance = 0;
        int FirstCondition = 340;
        int SecondCondition = 941;
        int OuterLoopCounter = 107;
        int InnerLoopCounter = 106;
        for (int LoopIndexOut = OuterLoopCounter / InnerLoopCounter; LoopIndexOut > 0; LoopIndexOut--) {
            int i = 0;
            int stop = Newton;
            int step = 1;
            while (step > 0 && i < stop || step < 0 && i > stop) {
                if (FirstCondition & SecondCondition) {
                    if (v - v2 > (Newton - i - 1) * d) {
                        a *= -1;
                        v = (Newton - i - 1) * d + v2;
                    }
                }
                distance += v;
                v += a * d;
                i += step;
            }
        }
        System.out.println(distance);
    }
}
```
Note that the Java code uses the `Scanner` class to read input from the user, and the `System.out.println()` method to print the output. The `for` loop is used to iterate over the outer loop, and the `while` loop is used to iterate over the inner loop. The `if` statement is used to check the conditions for the first and second conditions, and the `a` variable is used to update the acceleration. The `distance` variable is used to keep track of the total distance traveled.
