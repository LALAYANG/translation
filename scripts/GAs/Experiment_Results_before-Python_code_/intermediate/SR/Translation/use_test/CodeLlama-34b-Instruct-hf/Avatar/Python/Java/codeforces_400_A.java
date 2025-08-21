```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            String x = sc.next();
            int[] s = new int[x.length()];
            for (int j = 0; j < x.length(); j++) {
                if (x.charAt(j) == 'O') {
                    s[j] = 0;
                } else {
                    s[j] = 1;
                }
            }
            int[] tot = new int[12];
            for (int a = 1; a <= 12; a++) {
                if (12 % a == 0) {
                    int b = 12 / a;
                    if (help(a, b, s)) {
                        tot[a - 1] = b;
                    }
                }
            }
            System.out.print(tot.length + " ");
            for (int a : tot) {
                System.out.print(a + "x" + (12 / a) + " ");
            }
            System.out.println();
        }
    }

    public static boolean help(int a, int b, int[] s) {
        int[][] tot = new int[b][a];
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
                tot[i][j] = s[i * a + j];
            }
        }
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
                if (tot[i][j] == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
```
Note: The above code is a Java implementation of the Python code you provided. It uses the same logic and algorithms as the Python code, but is written in Java.
