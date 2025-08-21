
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;

public class CutRibbon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] arr = new int[4];
        for (int i = 0; i < 4; i++) {
            arr[i] = scanner.nextInt();
        }
        arr = sort(arr);
        if (length % arr[0] == 0) {
            System.out.println(length / arr[0]);
            return;
        }
        int ans = 0;
        if (arr[0] == arr[1]) {
            int k = 0;
            for (int i = 0; i <= length / arr[2]; i++) {
                int check = length - i * arr[2];
                if (check >= 0 && check % arr[0] == 0) {
                    k = check / arr[0];
                    ans = Math.max(ans, k + i);
                }
            }
        } else {
            int k = 0;
            for (int i = 0; i <= length / arr[2]; i++) {
                for (int j = 0; j <= length / arr[1]; j++) {
                    int check = length - i * arr[2] - j * arr[1];
                    if (check >= 0 && check % arr[0] == 0) {
                        k = check / arr[0];
                        ans = Math.max(ans, k + i + j);
                    }
                }
            }
        }
        System.out.println(ans);
    }

    public static int[] sort(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
```
Note that the `sort` method is a custom method that sorts the array in ascending order. The `cutRibbon` method is the main method that takes the input, sorts the array, and calculates the maximum number of pieces that can be cut from the ribbon.
