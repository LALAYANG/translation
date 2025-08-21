```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] A = new int[4];
        for (int i = 0; i < 4; i++) {
            A[i] = scanner.nextInt();
        }
        if (A[1] <= A[2] || A[3] <= A[0]) {
            System.out.println(0);
        } else {
            Arrays.sort(A);
            System.out.println(A[2] - A[1]);
        }
    }
}
```
This code first reads the input from the user and stores it in an array `A`. It then checks if the second element of the array is less than or equal to the third element, or if the third element of the array is less than or equal to the first element. If either of these conditions is true, it prints `0` and exits. Otherwise, it sorts the array in ascending order and prints the difference between the second and third elements.
