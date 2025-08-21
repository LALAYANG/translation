```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int[] arr = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }
        Arrays.sort(arr);
        int total_length = arr[0];
        int ans = 0;
        if (total_length % arr[1] == 0) {
            System.out.println(total_length / arr[1]);
            return;
        }
        if (arr[0] == arr[1]) {
            int count_1 = 0;
            for (int i = 0; i <= total_length / arr[2]; i++) {
                int remainder = total_length - i * arr[2];
                if (remainder >= 0 && remainder % arr[0] == 0) {
                    count_1 = remainder / arr[0];
                    ans = Math.max(ans, count_1 + i);
                }
            }
        } else {
            int count_1 = 0;
            for (int i = 0; i <= total_length / arr[2]; i++) {
                for (int j = 0; j <= total_length / arr[1]; j++) {
                    int check = total_length - i * arr[2] - j * arr[1];
                    if (check >= 0 && check % arr[0] == 0) {
                        count_1 = check / arr[0];
                        ans = Math.max(ans, count_1 + i + j);
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
```

This Java code does the same thing as the Python code. It reads the input, sorts it, and then calculates the maximum number of pieces that can be cut from the ribbon. The logic is the same as in the Python code. The only difference is that Java uses a different syntax for some operations.

