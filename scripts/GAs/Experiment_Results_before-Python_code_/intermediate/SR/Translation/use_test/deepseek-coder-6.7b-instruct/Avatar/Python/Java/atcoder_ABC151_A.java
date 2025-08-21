```java
import java.util.*;

public class Main {
    static boolean debug = false;

    public static void log(String text) {
        if (debug) {
            System.out.println(text);
        }
    }

    public static String[] parseInput(String linesAsString) {
        debug = (linesAsString != null);
        List<String> lines = new ArrayList<>();
        if (linesAsString != null) {
            lines = Arrays.asList(linesAsString.split("\\n"));
        } else {
            Scanner scanner = new Scanner(System.in);
            lines.add(scanner.nextLine());
        }
        String[] c = lines.get(0).split(" ");
        return new String[] { c[0] };
    }

    public static String solve(String c) {
        String a = "abcdefghijklmnopqrstuvwxyz";
        int i = a.indexOf(c);
        return String.valueOf(a.charAt(i + 1));
    }

    public static void main(String[] args) {
        String result = solve(parseInput(null)[0]);
        System.out.println(result);
    }
}
```

This Java code does the same thing as the Python code. It reads a single character from the input, finds the next character in the alphabet, and prints it. If the input is "a", it prints "b".

