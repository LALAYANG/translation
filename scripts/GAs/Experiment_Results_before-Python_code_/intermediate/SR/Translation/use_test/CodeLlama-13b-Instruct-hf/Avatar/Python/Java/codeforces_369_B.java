Here is the Java code that implements the same logic as the Python code:
```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int l = scanner.nextInt();
        int r = scanner.nextInt();
        int sa = scanner.nextInt();
        int sk = scanner.nextInt();

        int[] ans = getNums(k, sk) + getNums(n - k, sa - sk);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    public static int[] getNums(int num, int t) {
        int[] result = new int[num];
        for (int i = 0; i < num; i++) {
            if (i < t % num) {
                result[i] = t / num + 1;
            } else {
                result[i] = t / num;
            }
        }
        return result;
    }
}
```
This code uses the `Scanner` class to read the input from the user, and then it calls the `getNums` method to get the array of numbers. The `getNums` method takes two arguments: `num` and `t`, and it returns an array of `num` elements, where each element is the result of the division of `t` by `num` plus 1 if the index is less than `t % num`, and `t` divided by `num` otherwise.

The `main` method then calls the `getNums` method twice, once for the first `k` elements and once for the remaining `n - k` elements, and it adds the two arrays together to get the final result. Finally, it prints the result to the console.

Note that this code assumes that the input is valid and that the user has entered the correct number of arguments. If the input is invalid, the code may throw an exception or produce incorrect results.
