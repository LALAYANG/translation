```java
import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static boolean valid(int i, int j, int n, int m) {
        if (i < n && i >= 0 && j >= 0 && j < m) {
            return true;
        }
        return false;
    }

    public static double sumn(int i, int n) {
        return (n - i) * (i + n) / 2.0;
    }

    public static double sqfun(double a, double b, double c) {
        return (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
    }

    public static List<String> value() throws IOException {
        String[] input = new BufferedReader(new InputStreamReader(System.in)).readLine().split(" ");
        List<Integer> list = new ArrayList<>();
        for (String s : input) {
            list.add(Integer.parseInt(s));
        }
        return list;
    }

    public static List<Integer> inlst() throws IOException {
        String[] input = new BufferedReader(new InputStreamReader(System.in)).readLine().split(" ");
        List<Integer> list = new ArrayList<>();
        for (String s : input) {
            list.add(Integer.parseInt(s));
        }
        return list;
    }

    public static int inp() throws IOException {
        return Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
    }

    public static String instr() throws IOException {
        return new BufferedReader(new InputStreamReader(System.in)).readLine();
    }

    public static String f(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c != '-' && c != ';' && c != '_') {
                sb.append(Character.toLowerCase(c));
            }
        }
        return sb.toString();
    }

    public static void solve() throws IOException {
        List<String> l = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            l.add(f(instr()));
        }
        Set<String> set = new HashSet<>(l);
        for (int i = 0; i < inp(); i++) {
            String s = f(instr());
            if (set.contains(s)) {
                System.out.println("ACC");
            } else {
                System.out.println("WA");
            }
        }
    }

    public static void main(String[] args) throws IOException {
        solve();
    }
}
```

Test input:
```
as
av
ax
1
```

Expected output:
```
WA
``` 
