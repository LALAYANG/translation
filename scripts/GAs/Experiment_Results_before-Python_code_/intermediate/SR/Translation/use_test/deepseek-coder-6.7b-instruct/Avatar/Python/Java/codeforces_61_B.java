Here is the Java version of your Python code:

```java
import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static boolean valid(int i, int j, int n, int m) {
        if (i < n && i >= 0 && j >= 0 && j < m) {
            return true;
        }
        return false;
    }

    public static int sumn(int i, int n) {
        return (n - i) * (i + n) / 2;
    }

    public static double sqfun(int a, int b, int c) {
        return (-b + Math.sqrt(b * b - 4 * a * c)) / 2 * a;
    }

    public static String f(String s) {
        String r = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '-' && s.charAt(i) != ';' && s.charAt(i) != '_') {
                r += Character.toLowerCase(s.charAt(i));
            }
        }
        return r;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> l = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            l.add(f(scanner.next()));
        }
        List<String> permutations = new ArrayList<>();
        permutations(l, 0, l.size(), permutations);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            String input = scanner.next();
            if (permutations.contains(f(input))) {
                System.out.println("ACC");
            } else {
                System.out.println("WA");
            }
        }
    }

    public static void permutations(List<String> arr, int i, int n, List<String> permutations) {
        if (i == n - 1) {
            StringBuilder sb = new StringBuilder();
            for (String s : arr) {
                sb.append(s);
            }
            permutations.add(sb.toString());
        } else {
            for (int j = i; j < n; j++) {
                Collections.swap(arr, i, j);
                permutations(arr, i + 1, n, permutations);
                Collections.swap(arr, i, j);
            }
        }
    }
}
```

This Java code does the same thing as your Python code. It reads in a list of three strings, generates all permutations of these strings, and then checks if a given string is in the list of permutations. If it is, it prints "ACC", otherwise it prints "WA".

