
Here is the Java code that implements the same logic as the Python code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int l = 2019;
        int[] m = new int[l];
        m[0] = 1;
        int a = 0;
        int r = 0;
        for (int i = 0; i < input.length(); i++) {
            a += Integer.parseInt(input.substring(i, i + 1)) * (int) Math.pow(10, i, l);
            r += m[a % l];
            m[a % l] += 1;
        }
        System.out.println(r);
    }
}
```
This code uses the `Scanner` class to read the input from the user, and the `Math.pow()` method to calculate the power of 10. The `Integer.parseInt()` method is used to convert the input string to an integer. The rest of the code is similar to the Python code, with the exception of the `Math.pow()` method, which is used instead of the `pow()` function in Python.
