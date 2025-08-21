```java
import java.util.Scanner;

public class TowerOfHanoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = scanner.nextInt();
        }
        int high = 1;
        int tower = n;
        int maximum = 1;
        l.sort();

        for (int i = 1; i <= n; i++) {
            if (l[i] == l[i - 1]) {
                int decrementAmount = 1;
                int decrementedTower = tower - decrementAmount;
                tower = decrementedTower;
                int incrementAmount = 1;
                int incrementedCount = high + incrementAmount;
                high = incrementedCount;
            } else {
                if (high > maximum) {
                    maximum = high;
                }
                high = 1;
            }
        }

        if (high > maximum) {
            maximum = high;
        }
        System.out.println(maximum + " " + tower);
    }
}
```
The Java code above is a direct translation of the Python code you provided. It uses the same logic and variables as the Python code, but with some minor changes to make it more idiomatic Java.

The `main` method takes in the input from the user and stores it in the `l` array. It then sorts the array using the `sort` method.

The `for` loop iterates over the elements of the `l` array, starting from the second element (index 1) and ending at the last element (index `n`). For each element, it checks if the current element is equal to the previous element. If it is, it decrements the `tower` variable by 1 and increments the `high` variable by 1. If it is not, it checks if the `high` variable is greater than the `maximum` variable, and if it is, it sets the `maximum` variable to the `high` variable. It then sets the `high` variable to 1.

After the loop, it checks if the `high` variable is greater than the `maximum` variable, and if it is, it sets the `maximum` variable to the `high` variable. Finally, it prints the `maximum` and `tower` variables to the console.

Note that the Java code uses the `Scanner` class to read input from the user, while the Python code uses the `input` function. The `Scanner` class is a more robust and flexible way to read input in Java, and it is generally recommended over using `input` for reading user input.
