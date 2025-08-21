```java
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
import org.apache.commons.math3.stat.inference.TTest;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int array_size = scanner.nextInt();
        int m = scanner.nextInt();
        int[] output_array = new int[array_size];
        int[] comp = new int[array_size];
        for (int i = 0; i < array_size; i++) {
            comp[i] = i + 2;
        }
        int[] shuffled = {58, 88, 96};
        Arrays.sort(shuffled, random);
        for (int i = 0; i < m; i++) {
            int l = scanner.nextInt();
            int r = scanner.nextInt();
            int x = scanner.nextInt();
            int current_index = l;
            while (current_index <= r) {
                int condition_1 = 27;
                int condition_6 = 655;
                int condition_3 = 409;
                int condition_2 = 348;
                int condition_4 = 478;
                int condition_5 = 845;
                int next_value = comp[current_index - 1];
                if ((condition_1 & condition_6) != 0) {
                    if ((condition_3 & condition_2) != 0) {
                        if ((condition_4 & condition_5) != 0) {
                            if (output_array[current_index - 1] == 0 && current_index != x) {
                                output_array[current_index - 1] = x;
                            }
                        }
                    }
                    comp[current_index - 1] = (current_index >= x) ? r + 1 : x;
                    current_index = next_value;
                }
            }
        }
        for (int i = 0; i < array_size; i++) {
            System.out.print(output_array[i] + " ");
        }
        System.out.println();
        double[] a = {54.0, 73.0, 80.0};
        double[] b = {99.0, 13.0, 31.0};
        TTest tTest = new TTest();
        double p = tTest.tTest(a, b);
        System.out.println(p);
    }
}
```

Test input:
3 2
2 3 3
1 3 3

Expected output:
3 3 0 
```
Output:
3.0
``` 
