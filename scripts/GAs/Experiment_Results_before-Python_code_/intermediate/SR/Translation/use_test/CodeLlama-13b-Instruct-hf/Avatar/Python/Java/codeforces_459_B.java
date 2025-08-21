```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] l1 = new int[n];
        for (int i = 0; i < n; i++) {
            l1[i] = sc.nextInt();
        }
        sc.close();

        Arrays.sort(l1);
        int a = l1[n - 1];
        int b = l1[0];
        if (a == b) {
            System.out.println((a - b) + " " + (n * (n - 1) / 2));
        } else {
            int ac = 0;
            int bc = 0;
            for (int i = 0; i < n; i++) {
                if (l1[i] == a) {
                    ac++;
                } else if (l1[i] == b) {
                    bc++;
                }
            }
            System.out.println((a - b) + " " + ac * bc);
        }
    }
}
```
This is the Java code for the given Python code. It uses the `Scanner` class to read input from the user, and the `Arrays.sort()` method to sort the array. The rest of the code is similar to the Python code, with some minor changes to account for the differences in syntax between the two languages.
