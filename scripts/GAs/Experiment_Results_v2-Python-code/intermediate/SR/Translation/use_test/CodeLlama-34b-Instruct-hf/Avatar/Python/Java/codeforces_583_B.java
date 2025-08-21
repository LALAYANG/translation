```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        int currentLevel = 0;
        int levelCount = 0;
        int counterTurns = -1;
        while (levelCount < n) {
            counterTurns++;
            for (int i = 0; i < n; i++) {
                if (a[i] != -1 && a[i] <= levelCount) {
                    levelCount++;
                    a[i] = -1;
                }
            }
            a = reverse(a);
        }
        System.out.println(counterTurns);
    }

    public static int[] reverse(int[] a) {
        int[] reversed = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            reversed[i] = a[a.length - i - 1];
        }
        return reversed;
    }
}
```
Note: The `reverse` method is not a built-in method in Java, so I had to implement it myself.

Explanation:

The code is similar to the Python code, but with some differences due to the different syntax and built-in methods in Java.

The `main` method takes an `int` array as input, and the `reverse` method reverses the array.

The `while` loop iterates over the array, and for each element, it checks if the element is not equal to -1 and if it is less than or equal to the current level. If the condition is true, it increments the level count and sets the element to -1.

After the loop, the `reverse` method is called to reverse the array.

The `counterTurns` variable is incremented after each iteration of the loop, so it keeps track of the number of turns.

Finally, the `counterTurns` variable is printed to the console.
