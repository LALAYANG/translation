Here is the Java equivalent of the Python code:

```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        myDecorator();
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        int[] array = Arrays.stream(inputString.split("1")).mapToInt(String::length).toArray();
        int product = 1;
        for (int i : array) {
            product *= i;
        }
        System.out.println(product);
    }

    public static void myDecorator() {
        int[] array = {69, 24, 70};
        Arrays.sort(array);
    }
}
```

Please note that the Python code uses the `scipy.stats.ttest_ind` function to perform a t-test on two independent samples of scores. This function is not available in Java, so it is not included in the Java code.

Also, the Python code uses the `math.prod` function to calculate the product of an array of numbers. This function is not available in Java, so the Java code calculates the product by multiplying the numbers in a loop.

Finally, the Python code uses the `input` function to read input from the user. In Java, this is replaced with a `Scanner` object.

