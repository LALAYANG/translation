```java
import java.util.*;
import java.lang.*;

class Main {
    static boolean debug = false;

    static void logDebugInfo(String text) {
        if (debug) {
            System.out.println(text);
        }
    }

    static String[] parseInput(String linesAsString) {
        if (linesAsString == null) {
            debug = false;
            Scanner scanner = new Scanner(System.in);
            return new String[] { scanner.next() };
        } else {
            debug = true;
            return linesAsString.split("\n")[1].split(" ");
        }
    }

    static String solve(String c) {
        String a = "abcdefghijklmnopqrstuvwxyz";
        int charIndex = a.indexOf(c);
        return String.valueOf(a.charAt(charIndex + 1));
    }

    public static void main (String[] args) {
        Queue<String> queueSolve0 = new LinkedList<>();

        new Thread(() -> {
            String result = solve(parseInput(null)[0]);
            queueSolve0.add(result);
        }).start();

        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String resultSolve0 = queueSolve0.poll();
        System.out.println(resultSolve0);
    }
}
```

Please note that the Java version of the code is not exactly the same as the Python version. The Java version uses a `Thread` to read input and solve the problem concurrently, which is not necessary in Python. Also, the Java version does not have the loop that prints the result, as it is not necessary in this case.

