```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] list = new int[n];
        for (int i = 0; i < n; i++) {
            list[i] = sc.nextInt() % 2;
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += list[i];
        }
        if (sum == 1) {
            System.out.println(list.indexOf(1) + 1);
        } else {
            System.out.println(list.indexOf(0) + 1);
        }
    }
}
```
This code first takes an integer input `n` from the user, then it creates an array `list` of size `n` and reads `n` integers from the user and stores them in the array.

Next, it calculates the sum of the elements in the array and checks if the sum is equal to 1. If the sum is equal to 1, it prints the index of the first element in the array that is equal to 1, plus 1. If the sum is not equal to 1, it prints the index of the first element in the array that is equal to 0, plus 1.

Note that the `%` operator is used to get the remainder of the division of each element in the array by 2, which is equivalent to checking if the element is odd or even.
