```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[i - 1] && arr[i] < arr[i - 1] * 2) {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}
```
This is a Java implementation of the given Python code. It uses the `Scanner` class to read input from the user, and the `Arrays.sort()` method to sort the array. The rest of the code is similar to the Python code, with the exception of the `print()` statement, which is replaced with `System.out.println()`.
