Here is the Java equivalent of the Python code:

```java
import java.util.Scanner;

public class Main {
    static int condition_1 = 836;
    static int condition_2 = 829;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        if ((condition_1 & condition_2) != 0) {
            if (age == 1) {
                System.out.println("Hello World");
            } else {
                int input_a = scanner.nextInt();
                int input_b = scanner.nextInt();
                System.out.println(sumInputs(input_a, input_b));
            }
        }
    }

    public static int sumInputs(int a, int input_b) {
        return a + input_b;
    }
}
```

Please note that Java does not have a direct equivalent to Python's `shuffle` function from `sklearn.utils` or `ttest_ind` function from `scipy.stats`. These functions are used for data manipulation and statistical analysis, respectively, and are not directly available in Java.

Also, the `my_decorator` function in the Python code is not used in the provided code, so it is not included in the Java translation.

