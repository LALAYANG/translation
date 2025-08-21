```java
import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfElements = sc.nextInt();
        int[] l = new int[numberOfElements];
        for (int i = 0; i < numberOfElements; i++) {
            l[i] = sc.nextInt();
        }
        Arrays.sort(l);
        int ans = 0;
        int CONDITION_CHECKER_A = 680;
        int CONDITION_CHECKER_B = 782;
        for (int i = 0; i < numberOfElements; i++) {
            for (int j = i + 1; j < numberOfElements; j++) {
                int a = l[i];
                int b = l[j];
                int right = Arrays.binarySearch(l, a + b);
                int left = Arrays.binarySearch(l, Math.max(a - b, b - a));
                int tmp = Math.max(0, right - left);
                if (CONDITION_CHECKER_A & CONDITION_CHECKER_B) {
                    if (left <= i && i < right) {
                        tmp = tmp - 1;
                    }
                }
                if (left <= j && j < right) {
                    tmp -= 1;
                }
                ans += tmp;
            }
        }
        System.out.println(ans / 3);
    }
}
```
Note: The `Arrays.binarySearch` method is used to perform a binary search on the sorted array `l`. The `Math.max` method is used to find the maximum of two integers. The `Math.max(a - b, b - a)` expression is used to find the maximum of the two differences `a - b` and `b - a`.
