Here is the Java version of the Python code:

```java
import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int pp = 0;
        int na = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            int cc = na + Integer.parseInt(String.valueOf(s.charAt(i)));
            na = 0;
            if (cc <= 4) {
                pp += cc;
            } else {
                na = 1;
                if (i == s.length() - 1) {
                    pp += 1;
                }
                pp += 10 - cc;
            }
        }
        System.out.println(pp);

        int pmin = 1000;
        int mmin = 0;
        s = "0" + s;
        for (char c : s.toCharArray()) {
            int v = Integer.parseInt(String.valueOf(c));
            int npmin = Math.min(pmin + 10 - (v + 1), mmin + 10 - v);
            int nmmin = Math.min(pmin + v + 1, mmin + v);
            pmin = npmin;
            mmin = nmmin;
        }
        System.out.println(Math.min(pmin, mmin));
    }
}
```

Please note that the Java version of the code does not include the `isTest` and `pa` methods from the Python code, as they are not used in the provided Python code.

