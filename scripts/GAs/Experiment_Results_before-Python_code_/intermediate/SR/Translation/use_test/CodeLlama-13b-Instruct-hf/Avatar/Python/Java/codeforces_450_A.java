
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = sc.nextInt();
        }
        int[] l2 = new int[n];
        for (int i = 0; i < n; i++) {
            if (l[i] % m == 0) {
                l2[i] = l[i] / m;
            } else {
                l2[i] = l[i] / m + 1;
            }
        }
        int mx = 0;
        for (int i = 0; i < n; i++) {
            if (l2[i] > mx) {
                mx = l2[i];
            }
        }
        int ind = 0;
        for (int i = 0; i < n; i++) {
            if (l2[i] == mx) {
                ind = i;
                break;
            }
        }
        System.out.println(ind + 1);
    }
}
```
This code first reads the input from the user, which is the number of elements `n` and the modulus `m`. It then creates two arrays, `l` and `l2`, where `l` is the original array of integers and `l2` is the array of integers that have been divided by `m`.

The code then iterates through the `l2` array and finds the maximum value. It then iterates through the `l2` array again and finds the index of the element that has the maximum value. Finally, it prints the index of the element that has the maximum value plus 1.

Note that the code uses the `Scanner` class to read the input from the user, and the `System.out.println()` method to print the output.
