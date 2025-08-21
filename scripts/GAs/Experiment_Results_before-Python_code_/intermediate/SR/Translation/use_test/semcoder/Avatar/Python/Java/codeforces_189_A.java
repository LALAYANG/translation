Thought process:
1. Read the input values for ribbon lengths.
2. Sort the ribbon lengths in ascending order.
3. Check if the total length is divisible by the largest ribbon length.
4. If divisible, print the number of ribbons of the largest length.
5. If not divisible, iterate through different combinations of smaller ribbon lengths to find the maximum number of ribbons that can be cut.

```java
import java.util.Arrays;
import java.util.Scanner;

public class RibbonCutting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int length = arr[0];
        arr = Arrays.stream(arr).skip(1).sorted().toArray();

        if (length % arr[0] == 0) {
            System.out.println(length / arr[0]);
        } else {
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
    }
}
```
