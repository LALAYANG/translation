To solve this problem, we need to read the input integer `n` and the list of integers `nums`. We then iterate through the list to find the index of the first occurrence of `1` or `0` based on the sum of the list. If the sum is `1`, we print the index of the first occurrence of `1`, otherwise we print the index of the first occurrence of `0`.

Here is the Java solution:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] nums = new int[n];
        
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt() % 2;
        }
        
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        
        if (sum == 1) {
            for (int i = 0; i < n; i++) {
                if (nums[i] == 1) {
                    System.out.println(i + 1);
                    break;
                }
            }
        } else {
            for (int i = 0; i < n; i++) {
                if (nums[i] == 0) {
                    System.out.println(i + 1);
                    break;
                }
            }
        }
    }
}
```

This solution reads the input, processes the list, and outputs the index of the first occurrence of `1` or `0` based on the sum of the list.
