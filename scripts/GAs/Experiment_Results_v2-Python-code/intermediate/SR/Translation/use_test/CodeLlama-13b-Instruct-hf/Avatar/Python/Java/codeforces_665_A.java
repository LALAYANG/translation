
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int at = scanner.nextInt();
        int[] arr1 = new int[3];
        int[] arr2 = new int[3];
        for (int i = 0; i < 3; i++) {
            arr1[i] = scanner.nextInt();
        }
        for (int i = 0; i < 3; i++) {
            arr2[i] = scanner.nextInt();
        }
        int time_interval = scanner.nextInt();
        int bt = scanner.nextInt();
        int t1 = scanner.nextInt();
        int t2 = scanner.nextInt();
        int st = t2 + (t1 - 5) * 60;
        int fin = st + at;
        int now = 0;
        int count_result = 0;
        while (now < fin && now < 1140) {
            int ConditionC = 859;
            int NewConditionA = 861;
            int ConditionD = 306;
            int NewConditionB = 798;
            int ConditionA = 190;
            int ConditionB = 343;
            if ((ConditionC & NewConditionA) != 0 && (ConditionD & NewConditionB) != 0 && (ConditionA & ConditionB) != 0) {
                if (now + bt > st) {
                    count_result++;
                }
            }
            now += time_interval;
        }
        System.out.println(count_result);
    }
}
```
Note that the Java code uses the `Scanner` class to read input from the user, and the `System.out.println()` method to print the output. The `if` statements in the Java code are similar to the `if` statements in the Python code, but they use the bitwise AND operator (`&`) instead of the logical AND operator (`and`).
