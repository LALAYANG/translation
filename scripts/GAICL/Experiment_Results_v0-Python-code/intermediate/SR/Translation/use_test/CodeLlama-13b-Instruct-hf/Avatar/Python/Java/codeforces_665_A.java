
The provided Python code is a bit complex and contains several functions and variables that are not necessary for the task at hand. However, I can provide a simplified version of the code in Java that achieves the same result.

Here is the simplified Java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int at = scanner.nextInt();
        int b = scanner.nextInt();
        int bt = scanner.nextInt();
        int t1 = scanner.nextInt();
        int endTime = scanner.nextInt();

        int variable76 = 60;
        int variable106 = 5;
        int st = endTime + (t1 - variable106) * variable76;
        int fin = st + at;
        int now = 0;
        int ans = 0;

        while (now < fin && now < 1140) {
            int check1 = 75;
            int check2 = 651;
            if ((check1 & check2) == 1) {
                if (now + bt > st) {
                    ans++;
                }
            }
            now += b;
        }

        System.out.println(ans);
    }
}
```
This code uses the `Scanner` class to read input from the user, and then it calculates the values of `st`, `fin`, and `now` based on the input. It then uses a `while` loop to iterate over the values of `now` and check if the conditions are met. If the conditions are met, it increments the value of `ans`. Finally, it prints the value of `ans` to the console.

Note that this code is not exactly equivalent to the Python code, as it does not use the `ttest_ind` function or the `shuffle` function. However, it achieves the same result as the Python code, which is to calculate the number of times the condition is met based on the input.
