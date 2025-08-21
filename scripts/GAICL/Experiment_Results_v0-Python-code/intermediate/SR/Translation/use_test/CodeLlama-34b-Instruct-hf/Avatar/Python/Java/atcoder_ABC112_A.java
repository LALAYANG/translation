```java
import java.util.Scanner;

public class DecoratorExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if (age == 1) {
            System.out.println("Hello World");
        } else {
            int inputA = scanner.nextInt();
            int inputB = scanner.nextInt();
            System.out.println(sumInputs(inputA, inputB));
        }
    }

    public static int sumInputs(int a, int inputB) {
        return a + inputB;
    }
}
```
Note: The `shuffle` and `ttest_ind` functions from the original Python code are not included in the Java code, as they are not relevant to the main logic of the program.
