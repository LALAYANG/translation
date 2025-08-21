```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int s = sc.nextInt();
        int f = sc.nextInt();

        if (s < f) {
            int d = 1;
            String c = "R";
        } else {
            int d = -1;
            String c = "L";
        }

        String res = "";
        int i = 1;
        int j = s;
        int t, l, r;
        int k = 1;

        while (j != f) {
            if (i > t && k < m) {
                t = sc.nextInt();
                l = sc.nextInt();
                r = sc.nextInt();
                k++;
            }

            if (i == t && (l <= j && j <= r || l <= j + d && j + d <= r)) {
                res += "X";
            } else {
                res += c;
                j += d;
            }

            i++;
        }

        System.out.println(res);
    }
}
```
Note: This code assumes that the input is in the format specified in the problem statement, with the first line containing the number of test cases, and each subsequent line containing the values for n, m, s, and f. The code also assumes that the input values are valid and within the specified ranges.
