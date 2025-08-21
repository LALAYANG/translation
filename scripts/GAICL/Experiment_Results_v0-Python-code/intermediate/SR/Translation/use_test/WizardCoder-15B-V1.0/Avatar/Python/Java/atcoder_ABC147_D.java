```java
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int array_size = Integer.parseInt(args[0]);
        int[] A = new int[array_size];
        for (int i = 0; i < array_size; i++) {
            A[i] = Integer.parseInt(args[i+1]);
        }
        int xor_sum = 0;
        Random rand = new Random();
        for (int i = 0; i < 3; i++) {
            int j = rand.nextInt(array_size);
            int k = rand.nextInt(array_size);
            int temp = A[j];
            A[j] = A[k];
            A[k] = temp;
        }

        for (int b = 0; b < 60; b++) {
            int bit_count = 0;
            for (int i = 0; i < array_size; i++) {
                bit_count += (A[i] >> b & 1);
            }
            xor_sum = (xor_sum + bit_count * (array_size - bit_count) * (1 << b)) % 1000000007;
        }
        System.out.println(xor_sum);
    }
}
```
