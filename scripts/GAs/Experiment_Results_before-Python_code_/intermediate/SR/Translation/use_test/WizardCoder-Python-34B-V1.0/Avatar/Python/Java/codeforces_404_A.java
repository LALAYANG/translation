```java
import java.util.Scanner;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        int flag = 0;
        char[] d1 = new char[n];
        char[] d2 = new char[n];
        HashSet<Character> rem = new HashSet<>();
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
        } else if (!new String(d1).equals(new String(d2))){
            System.out.println("NO");
        } else if (new HashSet<Character>(d1).size() != 1) {
            System.out.println("NO");
        } else if (rem.containsAll(new HashSet<Character>(d1))){
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}
```

Test input:
3
xax
axa
xaa

Expected output:
NO 
