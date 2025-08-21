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
        int length = arr[0];
        Arrays.sort(arr);
        int ans = 0;
        if (arr[0] == arr[1]) {
            for (int i = 0; i <= length / arr[2]; i++) {
                int check = length - i * arr[2];
                if (check >= 0 && check % arr[0] == 0) {
                    int k = check / arr[0];
                    ans = Math.max(ans, k + i);
                }
            }
        } else {
            for (int i = 0; i <= length / arr[2]; i++) {
                for (int j = 0; j <= length / arr[1]; j++) {
                    int check = length - i * arr[2] - j * arr[1];
                    if (check >= 0 && check % arr[0] == 0) {
                        int k = check / arr[0];
                        ans = Math.max(ans, k + i + j);
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
```

This Java code does the same thing as the Python code. It reads the input, splits it into an array of integers, sorts the array, and then iterates over the array to find the maximum number of pieces that can be cut from the ribbon. The result is printed to the console.

