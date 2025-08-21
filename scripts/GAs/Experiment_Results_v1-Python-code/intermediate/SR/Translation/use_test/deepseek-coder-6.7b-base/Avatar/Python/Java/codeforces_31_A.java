```
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input_number = scanner.nextInt();
        int[] arr = new int[input_number];
        for (int i = 0; i < input_number; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < input_number; i++) {
            for (int second_index = 0; second_index < input_number; second_index++) {
                if (i == second_index) {
                    continue;
                }
                int[] arr_copy = Arrays.copyOf(arr, arr.length);
                Arrays.sort(arr_copy);
                for (int k = 0; k < arr_copy.length; k++) {
                    if (arr_copy[k] == arr[i] + arr[second_index]) {
                        System.out.println(k + 1 + " " + (second_index + 1) + " " + (i + 1));
                        return;
                    }
                }
            }
        }
        System.out.println(-1);
    }
}
```

