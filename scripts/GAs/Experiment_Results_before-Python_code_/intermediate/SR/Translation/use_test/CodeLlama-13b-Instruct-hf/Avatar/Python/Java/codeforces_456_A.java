
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] m = new int[n][2];
        for (int i = 0; i < n; i++) {
            m[i][0] = sc.nextInt();
            m[i][1] = sc.nextInt();
        }
        sc.close();

        // Sort the array in descending order
        Arrays.sort(m, (a, b) -> b[1] - a[1]);

        // Find the first element that is greater than the second element
        for (int i = 1; i < n; i++) {
            if (m[i][1] > m[i - 1][1]) {
                System.out.println("Happy Alex");
                break;
            }
        }

        // If no element is greater than the second element, print "Poor Alex"
        if (i == n) {
            System.out.println("Poor Alex");
        }
    }
}
```
This code first reads the input from the user and stores it in a 2D array `m`. It then sorts the array in descending order based on the second element of each subarray. Finally, it iterates through the array and checks if any element is greater than the second element of the previous element. If such an element is found, it prints "Happy Alex" and breaks out of the loop. If no such element is found, it prints "Poor Alex".
