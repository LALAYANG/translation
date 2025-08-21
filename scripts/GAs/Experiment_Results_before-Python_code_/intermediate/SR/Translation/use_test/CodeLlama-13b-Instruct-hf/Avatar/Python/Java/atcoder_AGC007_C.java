```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int d = scanner.nextInt();
        int x = scanner.nextInt();

        double ret = 0;
        while (N > 0) {
            ret += d + (N - 0.5) * x;
            d += (d / N) + (5 * x) / (2 * N);
            x += 2 * x / N;
            N--;
        }
        System.out.println(ret);
    }
}
```
This is the Java code that translates the Python code you provided. It uses the `Scanner` class to read input from the user and the `System.out.println()` method to print the result.

Note that the `read()` method in Python is replaced by the `nextInt()` method in Java, which reads the next integer from the input stream. Similarly, the `readline()` method in Python is replaced by the `nextLine()` method in Java, which reads the next line from the input stream.

Also, note that the `map()` function in Python is not available in Java, so we have to use a different approach to convert the input string to integers. In this case, we use the `Integer.parseInt()` method to convert the input string to an integer.
