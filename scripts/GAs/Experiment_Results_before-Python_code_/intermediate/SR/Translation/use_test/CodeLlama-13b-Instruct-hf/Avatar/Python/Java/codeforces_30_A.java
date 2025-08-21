
Here is the Java code that translates the Python code:
```java
public class Task4 {
    public static void main(String[] args) {
        int A = Integer.parseInt(args[0]);
        int B = Integer.parseInt(args[1]);
        int n = Integer.parseInt(args[2]);
        int X = task4(A, B, n);
        System.out.println(X);
    }

    public static int task4(int A, int B, int n) {
        for (int X = -1000; X <= 1000; X++) {
            if (A * Math.pow(X, n) == B) {
                return X;
            }
        }
        return "No solution";
    }
}
```
Note that the `Math.pow()` method is used to calculate the power of `X` to the `n`th power. The `Integer.parseInt()` method is used to convert the input strings to integers.
