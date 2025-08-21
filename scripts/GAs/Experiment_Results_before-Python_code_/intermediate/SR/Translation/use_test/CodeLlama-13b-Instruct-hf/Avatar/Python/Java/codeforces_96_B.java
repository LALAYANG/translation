
Here is the Java code that translates the Python code:
```java
import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();
        int limit = 10000000000;

        gen(0, 0, 0);
        l.sort(null);

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int ans = 0;

        for (int val : l) {
            if (val >= n) {
                ans = val;
                break;
            }
        }

        System.out.println(ans);
    }

    public static void gen(int number, int four, int seven) {
        if (number > limit) {
            return;
        }

        if (number > 0 && four == seven) {
            l.add(number);
        }

        gen(number * 10 + 4, four + 1, seven);
        gen(number * 10 + 7, four, seven + 1);
    }
}
```
Note that the `gen` method is a recursive method that generates all possible numbers with the given constraints. The `main` method calls the `gen` method to generate all possible numbers, sorts the list, and then reads the input from the user and finds the first number in the list that is greater than or equal to the input.
