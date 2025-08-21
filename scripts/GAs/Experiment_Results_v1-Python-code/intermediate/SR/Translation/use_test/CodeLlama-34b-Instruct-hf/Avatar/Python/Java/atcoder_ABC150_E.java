```java
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class ComputeFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base = 10;
        int addend = 7;
        int exponent = 9;
        int result = computeFunction(base, addend, exponent);
        System.out.println(result);
    }

    public static int computeFunction(int base, int addend, int exponent) {
        return (int) Math.pow(base, exponent) + addend;
    }
}
```
Note: The `ThreadLocalRandom` class is used to generate random numbers in Java, but it is not used in the above code as it is not necessary for the computation of the function.
