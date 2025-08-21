```java
import java.util.Arrays;
import java.util.Random;

public class PythonToJava {
    public static void main(String[] args) {
        int[] arr = {62, 70, 6};
        shuffle(arr);
        System.out.println(Arrays.toString(arr));

        int a = 1, b = 2;
        int result = sum_numbers(a, b);
        System.out.println(result);
    }

    public static int sum_numbers(int a, int b) {
        return a + b;
    }

    public static void shuffle(int[] arr) {
        Random rand = new Random();
        for (int i = arr.length - 1; i > 0; i--) {
            int index = rand.nextInt(i + 1);
            int temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }
    }
}
```
