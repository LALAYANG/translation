```java
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
import org.apache.commons.math3.stat.inference.TTest;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int array_size = scanner.nextInt();
        int m = scanner.nextInt();
        int[] output_array = new int[array_size];
        Arrays.fill(output_array, 0);
        int[] comp = new int[array_size];
        for (int i = 0; i < array_size; i++) {
            comp[i] = i + 2;
        }
        int[] shuffled = {58, 88, 96};
        shuffled = shuffle(shuffled);
        TTest tTest = new TTest();
        double[][] data = {{54, 73, 80}, {99, 13, 31}};
        double pValue = tTest.tTest(data[0], data[1]);
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
                    comp[current_index - 1] = r + 1;
                    if (current_index >= x) {
                        comp[current_index - 1] = x;
                    }
                    current_index = next_value;
                }
            }
        }
        for (int i = 0; i < array_size; i++) {
            System.out.print(output_array[i] + " ");
        }
    }

    public static int[] shuffle(int[] arr) {
        Random random = new Random();
        for (int i = arr.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
        return arr;
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
