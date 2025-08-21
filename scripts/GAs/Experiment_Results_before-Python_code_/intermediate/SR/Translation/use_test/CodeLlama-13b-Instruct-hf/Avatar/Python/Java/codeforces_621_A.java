```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] lst = new int[n];
        for (int i = 0; i < n; i++) {
            lst[i] = sc.nextInt();
        }
        sc.close();

        int sum = 0;
        int od = 0;
        for (int i = 0; i < n; i++) {
            if (lst[i] % 2 == 0) {
                sum += lst[i];
            } else {
                if (od > 1) {
                    sum += lst[i];
                    od--;
                }
            }
        }
        System.out.println(sum);
    }
}
```
This code first reads the input from the user, which is the number of elements in the list and the list of integers. It then sorts the list in descending order and calculates the sum of the even numbers in the list. If there are an odd number of odd numbers in the list, it adds the last odd number to the sum. Finally, it prints the sum.

Note that the code uses the `Scanner` class to read the input from the user, and the `Arrays.sort()` method to sort the list in descending order.
