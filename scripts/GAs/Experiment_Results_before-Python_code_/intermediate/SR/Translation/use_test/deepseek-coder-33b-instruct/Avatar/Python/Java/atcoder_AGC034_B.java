```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String t = "";
        int i = 0;
        while (i < s.length()) {
            if (s.charAt(i) == 'A') {
                t += "A";
                i += 1;
            } else if (s.charAt(i) == 'B') {
                if (i < s.length() - 1) {
                    if (s.charAt(i + 1) == 'C') {
                        t += "D";
                        i += 2;
                    } else {
                        t += "X";
                        i += 1;
                    }
                } else {
                    t += "X";
                    i += 1;
                }
            } else {
                t += "X";
                i += 1;
            }
        }
        long total = 0;
        long numA = 0;
        for (i = 0; i < t.length(); i++) {
            if (t.charAt(i) == 'X') {
                numA = 0;
            } else {
                if (t.charAt(i) == 'A') numA += 1;
                else total += numA;
            }
        }
        System.out.println(total);
    }
}
```

