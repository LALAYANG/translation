
Here is the Java code that translates the Python code:
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
        int[] sortedArr = new int[n];
        for (int i = 0; i < n; i++) {
            sortedArr[i] = arr[i];
        }
        Arrays.sort(sortedArr);
        int firstElement = sortedArr[0];
        boolean isDivisible = false;
        for (int i = 1; i < n; i++) {
            if (sortedArr[i] % firstElement == 0) {
                isDivisible = true;
                break;
            }
        }
        if (isDivisible) {
            System.out.println(firstElement);
        } else {
            System.out.println(-1);
        }
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `Arrays.sort()` method to sort the array. It then checks if the first element of the sorted array is divisible by any of the other elements, and prints the first element if it is divisible, or -1 if it is not.

Note that the Python code uses the `map()` function to convert the input to an array of integers, and the `sorted()` function to sort the array. In Java, we can use the `Arrays.sort()` method to sort the array, and the `map()` function is not needed because Java has built-in support for arrays.
