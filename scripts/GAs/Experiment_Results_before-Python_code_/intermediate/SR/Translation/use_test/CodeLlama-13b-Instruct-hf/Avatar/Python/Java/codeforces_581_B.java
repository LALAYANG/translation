```java
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int[] ans = new int[n];
        int mx = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            ans[i] = Math.max(0, mx - arr[i] + 1);
            if (arr[i] > mx) {
                mx = arr[i];
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
```
Explanation:

* The code first takes input `n` and an array `arr` of size `n` from the user.
* It then initializes an array `ans` of size `n` with all elements set to 0.
* It then sets `mx` to the last element of `arr`.
* It then iterates from `n - 2` to 0 (inclusive) and for each element `i`, it calculates the maximum value that can be obtained by taking the maximum of 0 and the difference between `mx` and `arr[i]` plus 1.
* It then updates `mx` to the current element `arr[i]` if it is greater than the current `mx`.
* Finally, it prints the elements of `ans` separated by spaces.

Note: The code assumes that the input is valid and that the user enters the correct number of elements for the array.
