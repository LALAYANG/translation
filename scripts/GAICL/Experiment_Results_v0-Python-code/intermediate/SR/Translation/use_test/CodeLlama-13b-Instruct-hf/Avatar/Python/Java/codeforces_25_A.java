```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] remainderList = new int[n];
        for (int i = 0; i < n; i++) {
            remainderList[i] = sc.nextInt() % 2;
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += remainderList[i];
        }
        if (sum == 1) {
            System.out.println(remainderList.indexOf(1) + 1);
        } else {
            System.out.println(remainderList.indexOf(0) + 1);
        }
    }
}
```

Explanation:

* The program first prompts the user to enter a number `n` and then reads `n` integers from the user.
* It then creates an array `remainderList` of size `n` to store the remainders of the input integers when divided by 2.
* It then calculates the sum of the remainders and checks if it is equal to 1.
* If the sum is equal to 1, it prints the index of the first element in the `remainderList` that is equal to 1, plus 1.
* If the sum is not equal to 1, it prints the index of the first element in the `remainderList` that is equal to 0, plus 1.

Note: The `indexOf` method returns the index of the first occurrence of the specified element in the array, or -1 if the element is not found. Therefore, we add 1 to the index to get the correct output.
