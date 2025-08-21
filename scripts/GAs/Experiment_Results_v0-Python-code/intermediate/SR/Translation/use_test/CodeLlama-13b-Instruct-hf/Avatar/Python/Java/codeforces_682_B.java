
Here is the Java code that translates the Python code:
```java
import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = scanner.nextInt();
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
This code uses the `Scanner` class to read input from the user, and the `Arrays` class to sort the array of integers. The `for` loop iterates over the array and checks if each element is greater than the previous element. If it is, the counter is incremented. Finally, the counter is printed to the console.

Note that the Python code uses some libraries that are not available in Java, such as `scipy.stats` and `sklearn.utils`. These libraries are not used in the Java code, as they are not necessary for the task at hand.
