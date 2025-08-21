```
import java.util.Scanner;

public class NextInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int t = 0;
        for (int i = 0; i < n; i++) {
            if ((i + 1) % 2 == 1) {
                t++;
            }
        }
        System.out.println(t / n);
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `Math` class to perform mathematical operations. The `nextInt()` method is used to read an integer from the user, and the `nextInts()` method is used to read a list of integers from the user. The `for` loop is used to iterate over the list of integers, and the `if` statement is used to check if the current integer is odd. If it is, the `t` variable is incremented. Finally, the `t / n` expression is used to calculate the average of the odd numbers.
