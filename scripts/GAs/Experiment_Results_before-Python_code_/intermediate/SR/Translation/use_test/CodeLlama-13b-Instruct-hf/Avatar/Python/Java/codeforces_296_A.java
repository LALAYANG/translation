```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] m = sc.nextLine().split(" ");
        boolean possible = true;
        for (String i : m) {
            if (m.length >= n / 2 + 1) {
                possible = false;
                break;
            }
        }
        System.out.println(possible ? "YES" : "NO");
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `String.split()` method to split the input string into an array of strings. The `for` loop iterates over the array and checks if the length of the array is greater than or equal to `n / 2 + 1`. If it is, the `possible` variable is set to `false` and the loop is exited. Finally, the `System.out.println()` method is used to print the result.
