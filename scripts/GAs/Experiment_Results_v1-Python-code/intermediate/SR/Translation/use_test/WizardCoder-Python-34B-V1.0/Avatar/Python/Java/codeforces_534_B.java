```java
import java.util.Scanner;
import org.apache.commons.math3.stat.inference.TTest;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input1 = scanner.nextLine().split(" ");
        int v1 = Integer.parseInt(input1[0]);
        int v2 = Integer.parseInt(input1[1]);
        String[] input2 = scanner.nextLine().split(" ");
        int Newton = Integer.parseInt(input2[0]);
        int d = Integer.parseInt(input2[1]);
        int a = 1;
        int v = v1;
        int distance = 0;
        int FirstCondition = 340;
        int SecondCondition = 941;
        int OuterLoopCounter = 107;
        int InnerLoopCounter = 106;

        for (int LoopIndexOut = 0; LoopIndexOut < OuterLoopCounter / InnerLoopCounter; LoopIndexOut++) {
            int i = 0;
            int step = 1;
            while (true) {
                if (step == 0 || (step > 0 && i >= Newton) || (step < 0 && i <= Newton)) {
                    break;
                }
                if (FirstCondition == 0 && SecondCondition == 0) {
                    a *= -1;
                    v = (Newton - i - 1) * d + v2;
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

Note: The original Python code uses the `scipy.stats.ttest_ind` function, which is a statistical test for independent samples. This function is not available in Java, so it has been removed from the translated code. 
