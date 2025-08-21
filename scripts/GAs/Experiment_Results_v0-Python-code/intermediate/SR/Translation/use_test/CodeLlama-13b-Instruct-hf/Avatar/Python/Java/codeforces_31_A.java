
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;

public class TripletFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int y = scanner.nextInt();
        int[] numbers = new int[y];
        for (int i = 0; i < y; i++) {
            numbers[i] = scanner.nextInt();
        }
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < y; j++) {
                if (i == j) {
                    continue;
                }
                for (int k = 0; k < y; k++) {
                    if (k == i || k == j) {
                        continue;
                    }
                    if (numbers[k] != numbers[i] && numbers[k] != numbers[j] && numbers[k] == sum_two(numbers[i], numbers[j])) {
                        System.out.println(k + 1 + " " + j + 1 + " " + i + 1);
                        return;
                    }
                }
            }
        }
        System.out.println(-1);
    }

    public static int sum_two(int a, int b) {
        return a + b;
    }
}
```
Note that the Java code uses a `Scanner` object to read input from the user, and it uses a `for` loop to iterate over the input array. The `sum_two` method is defined as a static method in the `TripletFinder` class.

Also, note that the Java code uses the `System.out.println` method to print the output, and it uses the `return` statement to exit the method when a triplet is found.
