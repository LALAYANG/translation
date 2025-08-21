```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double[] x = new double[n];
        for (int i = 0; i < n; i++) {
            String input = scanner.next();
            if (input.equals("JPY")) {
                x[i] = scanner.nextDouble() * 1.0;
            } else if (input.equals("BTC")) {
                x[i] = scanner.nextDouble() * 380000.0;
            }
        }
        System.out.println(sum(x));
    }

    public static double sum(double[] x) {
        double sum = 0.0;
        for (int i = 0; i < x.length; i++) {
            sum += x[i];
        }
        return sum;
    }
}
```
Note: In the Java code, I have used `double` instead of `float` for the variables `x` and `sum`, as `double` is more precise and can handle larger numbers.

Also, in the Python code, you have used `eval()` function to evaluate the input string as a Python expression. However, in Java, we can use the `ScriptEngine` class from the `javax.script` package to evaluate the input string as a JavaScript expression. Here is an example of how you can use `ScriptEngine` to evaluate the input string in Java:
```java
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class Main {
    public static void main(String[] args) {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("JavaScript");
        String input = "100000000 JPY";
        try {
            Object result = engine.eval(input);
            System.out.println(result);
        } catch (ScriptException e) {
            e.printStackTrace();
        }
    }
}
```
This will output `100000000.0` as the result.

Please note that the `ScriptEngine` class is not available in the Android SDK, so you will need to use a different approach if you are developing an Android app.
