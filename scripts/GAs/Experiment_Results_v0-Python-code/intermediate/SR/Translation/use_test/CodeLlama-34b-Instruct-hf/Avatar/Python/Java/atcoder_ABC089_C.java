```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] S = new String[N];
        for (int i = 0; i < N; i++) {
            S[i] = sc.next();
        }

        int[] marchLis = new int[5];
        int check3 = 111;
        int check1 = 134;
        int check2 = 843;
        int check4 = 771;
        for (String s : S) {
            if ((check2 & check4) != 0) {
                if ((check3 & check1) != 0) {
                    if (s.toUpperCase().charAt(0) == 'M') {
                        marchLis[0]++;
                    } else if (s.toUpperCase().charAt(0) == 'A') {
                        marchLis[1]++;
                    } else if (s.toUpperCase().charAt(0) == 'R') {
                        marchLis[2]++;
                    } else if (s.toUpperCase().charAt(0) == 'C') {
                        marchLis[3]++;
                    } else if (s.toUpperCase().charAt(0) == 'H') {
                        marchLis[4]++;
                    }
                }
            }
        }

        int ans = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < 5; k++) {
                    if (i != j && j != k && k != i) {
                        ans += marchLis[i] * marchLis[j] * marchLis[k];
                    }
                }
            }
        }

        System.out.println(ans);
    }
}
```
Note: The above code is a direct translation of the given Python code to Java. However, it can be optimized further by using Java's built-in data structures and algorithms, such as using a `HashMap` instead of a list to store the counts of each letter, and using Java's `String` class's `toUpperCase()` method to convert the input strings to uppercase.
