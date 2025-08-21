```java
import java.util.Scanner;

public class Decorator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] inputs = input.split(" ");
        int k = Integer.parseInt(inputs[0]);
        int w = Integer.parseInt(inputs[1]);
        int targetValue = Integer.parseInt(inputs[2]);

        if (k >= 1 && w <= 1000) {
            int total = 0;
            for (int i = 1; i <= w; i++) {
                total += calculateProduct(k, i);
            }
            if (total > targetValue) {
                System.out.println(total - targetValue);
            } else {
                System.out.println(0);
            }
        }
    }

    public static int calculateProduct(int k, int i) {
        return i * k;
    }
}
```
The above code is a Java implementation of the given Python code. It uses the `Scanner` class to read input from the user and then splits the input into three integers - `k`, `w`, and `targetValue`. It then checks if `k` is greater than or equal to 1 and `w` is less than or equal to 1000. If the condition is true, it calculates the total by iterating over the range of `w` and multiplying each value by `k`. Finally, it checks if the total is greater than `targetValue` and prints the difference between the total and `targetValue` if the condition is true, otherwise it prints 0.

Note that the `calculateProduct` method is a static method in Java, which means it can be called without creating an instance of the class. Also, the `Scanner` class is used to read input from the user, which is then split into integers using the `split` method.
