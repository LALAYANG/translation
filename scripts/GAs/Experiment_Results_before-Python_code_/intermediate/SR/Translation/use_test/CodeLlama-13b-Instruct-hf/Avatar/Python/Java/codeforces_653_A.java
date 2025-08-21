```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = sc.nextInt();
        }
        sc.close();

        // Sort the array
        Arrays.sort(l);

        // Check if there are two consecutive numbers
        for (int i = 0; i < n - 1; i++) {
            if (l[i] + 1 == l[i + 1]) {
                System.out.println("YES");
                return;
            }
        }

        System.out.println("NO");
    }
}
```
This code first reads the input from the user, then it sorts the array and checks if there are two consecutive numbers. If there are, it prints "YES" and exits the program. If there are no consecutive numbers, it prints "NO".

Note that this code assumes that the input is a list of integers, and it sorts the array using the `Arrays.sort()` method. If the input is a list of strings, you will need to modify the code accordingly.
