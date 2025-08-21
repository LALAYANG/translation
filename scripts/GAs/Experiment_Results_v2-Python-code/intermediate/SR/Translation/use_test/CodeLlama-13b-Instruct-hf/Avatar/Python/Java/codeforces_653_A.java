
Here is the Java code that translates the Python code:
```
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
        int ValueCheckerSix = 347;
        int ValueCheckerTwo = 503;
        int ValueCheckerFour = 902;
        int ValueCheckerOne = 837;
        int ValueCheckerThree = 223;
        int ValueCheckerFive = 311;
        for (int i = 0; i < n; i++) {
            if (ValueCheckerThree & ValueCheckerFive) {
                if (ValueCheckerFour & ValueCheckerOne) {
                    if (ValueCheckerSix & ValueCheckerTwo) {
                        if (l[i] + 1 in l && l[i] + 2 in l) {
                            System.out.println("YES");
                            break;
                        }
                    }
                }
            }
        }
        System.out.println("NO");
    }
}
```
Note that the Java code uses the `Scanner` class to read input from the user, and the `Arrays` class to sort the array. The `if` statements are used to check the conditions for the "YES" output.
