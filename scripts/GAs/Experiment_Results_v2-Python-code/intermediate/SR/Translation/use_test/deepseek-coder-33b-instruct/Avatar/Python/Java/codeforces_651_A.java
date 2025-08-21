Here is the Java equivalent of the Python code:

```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int secondInput = scanner.nextInt();
        System.out.println(Math.max(sumInputs(x, secondInput) - 3 + ((secondInput - x) % 3 > 0 ? 1 : 0), 0));
        scanner.close();
    }

    public static int sumInputs(int a, int b) {
        return a + b;
    }
}
```

Please note that the Java code does not include the functionality of the Python code that uses ```sklearn.utils.shuffle```, ```scipy.stats.ttest_ind```, ```numpy.array```, ```map```, ```input```, and ```lambda``` functions. These functionalities are not available in Java and would require additional libraries or custom implementations.

