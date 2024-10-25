<s> [INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
3
100000000 JPY
100.00000000 BTC
0.00000001 BTC

Expected output:
138000000.0038


```
N = int ( input ( ) )
x = [ eval ( input ( ).replace ( 'JPY' , '* 1.0' ).replace ( 'BTC' , '* 380000.0' ) ) for i in range ( N ) ]
print ( sum ( x ) )


```
[/INST]
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
Note: In the Java code, I have used `double` instead of `float` as the data type for the input values, as `double` provides more precision than `float`.

Also, in the Python code, you have used `eval()` function to evaluate the input string as a Python expression. However, in Java, we can use the `ScriptEngine` class from the `javax.script` package to evaluate the input string as a JavaScript expression. Here's an example of how you can modify the Java code to use `ScriptEngine`:
```java
import java.util.Scanner;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double[] x = new double[n];
        for (int i = 0; i < n; i++) {
            String input = scanner.next();
            ScriptEngineManager manager = new ScriptEngineManager();
            ScriptEngine engine = manager.getEngineByName("JavaScript");
            try {
                x[i] = (double) engine.eval(input);
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
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
Note that in this modified Java code, we are using the `ScriptEngineManager` class to create a `ScriptEngine` instance that can evaluate JavaScript expressions. We then use the `eval()` method of the `ScriptEngine` instance to evaluate the input string as a JavaScript expression, and store the result in the `x` array.</s>
