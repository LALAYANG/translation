
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = sc.nextInt();
        }
        Arrays.sort(l);
        int c = 0;
        for (int i = 0; i < n; i++) {
            if (l[i] > c) {
                c++;
            }
        }
        System.out.println(c + 1);
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `Arrays` class to sort the array. It then iterates through the array and counts the number of elements that are greater than the previous element. Finally, it prints the result.

Note that the Python code uses the `input` function to read input from the user, which is not available in Java. In Java, you can use the `Scanner` class to read input from the user.
