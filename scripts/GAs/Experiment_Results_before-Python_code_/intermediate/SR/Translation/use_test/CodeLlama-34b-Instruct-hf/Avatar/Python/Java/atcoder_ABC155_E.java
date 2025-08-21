```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int pmin = 1000;
        int mmin = 0;
        input = "0" + input;
        for (int i = 0; i < input.length(); i++) {
            int v = Integer.parseInt(input.substring(i, i + 1));
            int npmin = Math.min(pmin + 10 - (v + 1), mmin + 10 - v);
            int nmmin = Math.min(pmin + v + 1, mmin + v);
            pmin = npmin;
            mmin = nmmin;
        }
        System.out.println(Math.min(pmin, mmin));
    }
}
```
Note: The above code is a Java implementation of the given Python code. The Python code uses the `input()` function to read input from the user, but in Java, we use the `Scanner` class to read input from the user. Also, the Python code uses the `min()` function to find the minimum of two values, but in Java, we use the `Math.min()` method to do the same.
