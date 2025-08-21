
Here is the Java code that translates the Python code:
```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        boolean flag = false;
        String[] d1 = new String[n];
        String[] d2 = new String[n];
        Set<String> rem = new HashSet<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    d1[i] = s[i].charAt(j);
                }
                if (i == n - j - 1) {
                    d2[i] = s[i].charAt(j);
                }
                if (i != j && i != n - j - 1) {
                    rem.add(s[i].charAt(j));
                }
            }
        }
        if (rem.size() != 1) {
            System.out.println("NO");
        } else if (!d1.equals(d2)) {
            System.out.println("NO");
        } else if (new HashSet<>(d1).size() != 1) {
            System.out.println("NO");
        } else if (new HashSet<>(d1).equals(rem)) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}
```
Note that the code uses the `Scanner` class to read input from the user, and the `HashSet` class to store the characters in the string. The `equals` method is used to compare the arrays and sets.
