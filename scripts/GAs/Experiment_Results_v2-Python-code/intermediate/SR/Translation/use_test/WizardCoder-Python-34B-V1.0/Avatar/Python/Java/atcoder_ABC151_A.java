```java
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.Scanner;

public class Main {
    private static boolean debug = false;

    public static void debugPrint(String text) {
        if (debug) {
            System.out.println(text);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] parsedInput = parseInput(input);
        String c = parsedInput[0];
        String result = solve(c);
        System.out.println(result);
    }

    public static String[] parseInput(String input) {
        String[] lines = input.split("\n");
        String c = lines[0].split(" ")[0];
        return new String[]{c};
    }

    public static String solve(String c) {
        String a = "abcdefghijklmnopqrstuvwxyz";
        int i = a.indexOf(c);
        return a.charAt(i + 1) + "";
    }
}
```

Test input:
a

Expected output:
b 
