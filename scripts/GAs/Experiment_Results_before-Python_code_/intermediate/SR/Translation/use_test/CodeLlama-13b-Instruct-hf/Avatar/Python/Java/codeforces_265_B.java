```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = sc.nextInt();
        }
        int ans = n - 1;
        int last = 0;
        for (int i = 0; i < n; i++) {
            ans += Math.abs(last - l[i]) + 1;
            last = l[i];
        }
        System.out.println(ans);
    }
}
```
This is the Java code for the given Python code. It uses the `Scanner` class to read input from the user and the `Math.abs()` method to calculate the absolute difference between the last element and the current element in the array. The `Math.abs()` method returns the absolute value of the difference, which is the distance between the two elements. The `+ 1` at the end of the line is added to account for the fact that the distance between two elements is always at least 1.

The `ans` variable is initialized to `n - 1` because the first element in the array is not included in the calculation. The `last` variable is initialized to 0 because the first element in the array is not included in the calculation.

The `for` loop iterates over the elements in the array and calculates the distance between each element and the previous element. The distance is added to the `ans` variable and the `last` variable is updated to the current element.

The `System.out.println()` method is used to print the final value of the `ans` variable, which is the total distance between all the elements in the array.

Here is a sample test case:
```
Input:
5
2
1
2
1
1

Output:
14
```
This test case is the same as the one provided in the question. The input is the number of elements in the array, followed by the elements themselves. The output is the total distance between all the elements in the array.
