```
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
Note: The `shuffle` and `ttest_ind` functions from the Python code are not available in Java, so they have been removed from the Java code.
