```java
import java.util.ArrayList;
import java.util.List;

public class MyDecorator {
    public static void decResult(int[] x, int[] y, int a, int b) {
        int[] games = new int[x.length];
        for (int i = 0; i < x.length; i++) {
            if (x[i] > y[i]) {
                games[i] = x[i];
            } else {
                games[i] = y[i];
            }
        }
        System.out.println(games.length);
        for (int i = 0; i < games.length; i++) {
            System.out.println(games[i]);
        }
    }
}

public class RecursiveLoop {
    public static void main(String[] args) {
        int[] x = {31, 25, 50};
        int[] y = {99, 31, 46};
        int a = 760;
        int b = 485;
        MyDecorator.decResult(x, y, a, b);
    }
}
```
Explanation:

The Python code is using a decorator to wrap the `recursive_loop` function. The decorator is defined as `my_decorator` and it takes a function as an argument. The `my_decorator` function returns a new function that takes the same arguments as the original function, but it also takes an additional argument `step` which is used to determine the step size of the loop.

In the Java code, I have defined a `MyDecorator` class that has a `decResult` method. This method takes four arguments: `x`, `y`, `a`, and `b`. It then creates a new array `games` that has the same length as `x`. It then iterates over the elements of `x` and `y` and compares them. If `x[i] > y[i]`, it adds `x[i]` to the `games` array, otherwise it adds `y[i]`. Finally, it prints the length of the `games` array and the elements of the `games` array.

In the `RecursiveLoop` class, I have defined a `main` method that takes no arguments. In this method, I have defined the `x`, `y`, `a`, and `b` variables and called the `MyDecorator.decResult` method with these variables as arguments.

Note that the Java code does not use a decorator like the Python code. Instead, it defines a separate class `MyDecorator` that has a `decResult` method that performs the same functionality as the decorator in the Python code.
