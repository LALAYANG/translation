Here is the Java version of the provided Python code:

```java
import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        List<String> l = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            String s = sc.next();
            String r = "";
            for (char c : s.toCharArray()) {
                if (c != '-' && c != ';' && c != '_') {
                    r += Character.toLowerCase(c);
                }
            }
            l.add(r);
        }
        List<String> perm = new ArrayList<>();
        permute(l, 0, l.size() - 1, perm);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            String s = sc.next();
            String r = "";
            for (char c : s.toCharArray()) {
                if (c != '-' && c != ';' && c != '_') {
                    r += Character.toLowerCase(c);
                }
            }
            if (perm.contains(r)) {
                System.out.println("ACC");
            } else {
                System.out.println("WA");
            }
        }
    }

    public static void permute(List<String> l, int lx, int rx, List<String> perm) {
        if (lx == rx) {
            StringBuilder sb = new StringBuilder();
            for (String s : l) {
                sb.append(s);
            }
            perm.add(sb.toString());
        } else {
            for (int i = lx; i <= rx; i++) {
                Collections.swap(l, lx, i);
                permute(l, lx + 1, rx, perm);
                Collections.swap(l, lx, i);
            }
        }
    }
}
```

Please note that this Java code does not contain all the functions from the Python code. The functions `isValid`, `calculateSum`, `sqfun`, `value`, `values`, `inlst`, `inlsts`, `inp`, `inps`, `instr`, `stlst` are not included in the Java version because they are not used in the main logic of the program.

