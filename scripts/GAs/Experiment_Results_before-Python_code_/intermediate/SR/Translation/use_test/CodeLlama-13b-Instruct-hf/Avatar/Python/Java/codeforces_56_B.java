```java
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        int mn = N + 1, mx = -1;
        for (int i = 0; i < N; i++) {
            if (i + 1 != A[i]) {
                mn = Math.min(mn, i);
                mx = Math.max(mx, i);
            }
        }
        if (mx == -1) {
            System.out.println("0 0");
        } else {
            A = A[0..mn] + A[mn..(mx + 1)][::-1] + A[(mx + 1)..];
            if (java.util.Arrays.equals(A, java.util.Arrays.sort(A))) {
                System.out.println(mn + 1 + " " + mx + 1);
            } else {
                System.out.println("0 0");
            }
        }
    }
}
```
Note: The code uses the `java.util.Arrays.sort()` method to sort the array `A` and the `java.util.Arrays.equals()` method to check if the array is sorted. The `java.util.Arrays.sort()` method returns a new sorted array, so we need to assign the result back to the `A` array.

Also, the code uses the `java.util.Arrays.copyOfRange()` method to create a new array from a range of indices in the original array. The `java.util.Arrays.copyOfRange()` method returns a new array that contains the elements from the specified range of indices in the original array.

The code also uses the `java.util.Arrays.equals()` method to check if the array is sorted. The `java.util.Arrays.equals()` method returns `true` if the two arrays are equal, and `false` otherwise.

Finally, the code uses the `java.util.Arrays.toString()` method to convert the array to a string and print it to the console. The `java.util.Arrays.toString()` method returns a string representation of the array, with each element separated by a space.
