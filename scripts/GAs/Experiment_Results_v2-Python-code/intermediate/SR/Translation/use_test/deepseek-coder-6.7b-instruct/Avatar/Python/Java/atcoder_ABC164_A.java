```java
import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        healthCheck();
    }

    public static void healthCheck() {
        Random rand = new Random();
        int[] numbers = {79, 54, 23};
        for (int i = 0; i < numbers.length; i++) {
            int randomIndexToSwap = rand.nextInt(numbers.length);
            int temp = numbers[randomIndexToSwap];
            numbers[randomIndexToSwap] = numbers[i];
            numbers[i] = temp;
        }

        Scanner scanner = new Scanner(System.in);
        int userHealth = scanner.nextInt();
        int thresholdHealth = scanner.nextInt();

        if (userHealth <= thresholdHealth) {
            System.out.println("safe");
        } else {
            System.out.println("unsafe");
        }
    }
}
```

This Java code does the same thing as the Python code. It shuffles an array of numbers, then reads two integers from the input, and prints "safe" if the first integer is less than or equal to the second, and "unsafe" otherwise.

Please note that the Python code uses the `scipy.stats` library for a t-test, which is not available in Java. If you need to perform a t-test, you would need to use a library like Apache Commons Math or JScience.

Also, the Python code uses the `datetime` module to get the current date and time, which is not used in the Java code. If you need to get the current date and time, you can use `java.time.LocalDateTime` or `java.util.Date`.

The Python code uses the `time.sleep(0.05)` to pause the execution for 0.05 seconds, which is not used in the Java code.

The Python code uses the `input()` function to read user input, which is replaced by `Scanner` in the Java code.

The Python code uses the `map(int, input().split())` function to convert the user input to integers, which is replaced by `Scanner.nextInt()` in the Java code.

The Python code uses the `shuffle` function from the `sklearn.utils` module, which is not available in Java. The Java code uses a simple shuffle algorithm to shuffle the array.

The Python code uses the `@my_decorator` syntax to decorate the `health_check` function, which is not used in the Java code.

The Python code uses the `if __name__ == '__main__':` syntax to call the `health_check` function, which is not used in the Java code.

