```java
import java.util.Arrays;
import java.util.Random;

public class PythonToJava {
    public static void main(String[] args) {
        int n = 10;
        int k = 1;
        int[] numbers = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};

        int[] result = sumNumbers(n, k, numbers);
        System.out.println(Arrays.toString(result));
    }

    public static int[] sumNumbers(int n, int k, int[] numbers) {
        int[] result = new int[n];
        Random rand = new Random();

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += numbers[j];
                if (j - i + 1 == k) {
                    result[i] = sum;
                    break;
                }
            }
        }

        return result;
    }
}
```
