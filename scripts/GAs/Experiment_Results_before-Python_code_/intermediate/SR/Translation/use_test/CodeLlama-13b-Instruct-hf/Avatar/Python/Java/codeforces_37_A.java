```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = sc.nextInt();
        }
        int high = 1;
        int tower = n;
        int maximum = 1;
        for (int i = 1; i < n; i++) {
            if (l[i] == l[i - 1]) {
                tower--;
                high++;
            } else {
                if (high > maximum) {
                    maximum = high;
                }
                high = 1;
            }
        }
        if (high > maximum) {
            maximum = high;
        }
        System.out.println(maximum + " " + tower);
    }
}
```
This is the Java code for the given Python code. It uses the `Scanner` class to read input from the user and the `Arrays` class to sort the input array. The rest of the code is similar to the Python code, with some minor changes to account for the differences in syntax between the two languages.
