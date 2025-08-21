```
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }

        String[] march = {"M", "A", "R", "C", "H"};
        int[] marchLis = new int[5];
        for (String str : s) {
            if (str.charAt(0) >= 'A' && str.charAt(0) <= 'Z') {
                marchLis[march.indexOf(str.charAt(0))]++;
            }
        }

        int ans = 0;
        for (int x : marchLis) {
            for (int y : marchLis) {
                for (int z : marchLis) {
                    if (x != y && y != z && z != x) {
                        ans += x * y * z;
                    }
                }
            }
        }

        System.out.println(ans);
    }
}
```
Note: The above code uses the `Scanner` class to read input from the user. If you want to use the `input()` function to read input, you can replace the `Scanner` code with the following:
```
String[] s = new String[n];
for (int i = 0; i < n; i++) {
    s[i] = input();
}
```
Also, the `combinations()` function is not available in Java, so you can use the `combinations()` function from the `java.util.Combinatorics` class to generate the combinations of the elements in the `marchLis` array. Here's the updated code:
```
import java.util.*;
import java.util.Combinatorics;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }

        String[] march = {"M", "A", "R", "C", "H"};
        int[] marchLis = new int[5];
        for (String str : s) {
            if (str.charAt(0) >= 'A' && str.charAt(0) <= 'Z') {
                marchLis[march.indexOf(str.charAt(0))]++;
            }
        }

        int ans = 0;
        for (int[] combination : Combinatorics.combinations(marchLis, 3)) {
            int x = combination[0];
            int y = combination[1];
            int z = combination[2];
            if (x != y && y != z && z != x) {
                ans += x * y * z;
            }
        }

        System.out.println(ans);
    }
}
```
