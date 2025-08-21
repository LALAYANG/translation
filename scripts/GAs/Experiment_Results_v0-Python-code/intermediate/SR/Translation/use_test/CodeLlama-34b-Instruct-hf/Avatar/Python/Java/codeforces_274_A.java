```java
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Modulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int divisor = scanner.nextInt();
        int[] numbers = new int[num];
        for (int i = 0; i < num; i++) {
            numbers[i] = scanner.nextInt();
        }

        Set<Integer> uniqueNumbers = new HashSet<>();
        int temp = 0;
        for (int i = 0; i < num; i++) {
            int mod = numbers[i] % divisor;
            if (mod != 0 && !uniqueNumbers.contains(mod)) {
                uniqueNumbers.add(mod);
                temp = Math.max(temp, mod);
            }
        }
        System.out.println(temp);
    }
}
```
Explanation:

The code above is a Java implementation of the Python code you provided. It uses the `Scanner` class to read input from the user, and the `Set` interface to store the unique numbers.

The `main` method first reads the number of inputs and the divisor from the user. It then creates an array of integers to store the input numbers.

The code then iterates over the input numbers and calculates the modulo of each number with the divisor. If the modulo is not zero and the unique number is not already in the set, it adds the unique number to the set and updates the `temp` variable with the maximum of the current value and the new value.

Finally, the code prints the `temp` variable to the console.

Note that the Java code uses the `Math.max` method to calculate the maximum of two integers, whereas the Python code uses the `max` function.
