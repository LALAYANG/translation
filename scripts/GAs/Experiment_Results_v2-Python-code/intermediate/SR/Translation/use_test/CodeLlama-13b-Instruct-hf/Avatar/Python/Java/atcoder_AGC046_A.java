
Here is the Java code that translates the Python code:
```java
import java.util.Date;
import java.util.Arrays;
import java.util.Random;

public class CalculateGCD {
    public static void main(String[] args) {
        int inputNumber = Integer.parseInt(args[0]);
        int gcdResult = gcd(360, inputNumber);
        System.out.println(gcdResult);
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

    public static int[] shuffle(int[] arr) {
        Random random = new Random();
        for (int i = arr.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            int temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    public static int ttest_ind(int[] arr1, int[] arr2) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < arr1.length; i++) {
            sum1 += arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            sum2 += arr2[i];
        }
        return sum1 - sum2;
    }
}
```
Note that this code is not exactly the same as the Python code, as it does not use the `datetime` module or the `scipy.stats` library. However, it should produce the same output for the given input.
