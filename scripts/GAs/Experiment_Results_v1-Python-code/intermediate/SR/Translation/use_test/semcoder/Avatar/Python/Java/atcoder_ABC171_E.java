```java
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class XorOperation {
    public static int xor_operation(int a, int b) {
        return a ^ b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int array_size = scanner.nextInt();
        int[] input_array = new int[array_size];
        for (int i = 0; i < array_size; i++) {
            input_array[i] = scanner.nextInt();
        }
        int xor_sum = IntStream.of(input_array).reduce(0, (a, b) -> a ^ b);
        String[] result = Arrays.stream(input_array).mapToObj(ai -> xor_operation(ai, xor_sum) + "").toArray(String[]::new);
        System.out.println(String.join(" ", result));
    }
}
```
