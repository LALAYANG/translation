```java
import java.util.Scanner;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] remainderList = new int[n];
        for (int i = 0; i < n; i++) {
            remainderList[i] = scanner.nextInt() % 2;
        }
        int sum = Arrays.stream(remainderList).sum();
        if (sum == 1) {
            System.out.println(Arrays.stream(remainderList).indexOf(1) + 1);
        } else {
            System.out.println(Arrays.stream(remainderList).indexOf(0) + 1);
        }
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `Arrays` class to perform operations on arrays. The `indexOf` method is used to find the index of the first element in the array that satisfies a given condition. In this case, the condition is whether the element is equal to 1 or 0. The `sum` method is used to calculate the sum of the elements in the array.

The code first reads the number of elements `n` from the user, and then reads `n` integers from the user and stores them in an array called `remainderList`. The code then calculates the sum of the elements in the array using the `sum` method, and checks if the sum is equal to 1. If it is, the code prints the index of the first element in the array that is equal to 1, plus 1. If the sum is not equal to 1, the code prints the index of the first element in the array that is equal to 0, plus 1.

For example, if the input is:
```
20
88 96 66 51 14 88 2 92 18 72 18 88 20 30 4 82 90 100 24 46
```
The output will be:
```
4
```
This is because the sum of the elements in the array is 1, and the first element that is equal to 1 is at index 3 (since arrays are 0-indexed in Java).
