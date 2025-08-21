```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] lines = {input};
        boolean debug = false;

        void log(String text) {
            if (debug) {
                System.out.println(text);
            }
        }

        String[] parseInput(String[] linesAsString) {
            String[] lines = new String[linesAsString.length];
            if (linesAsString == null) {
                debug = false;
                lines[0] = scanner.nextLine();
            } else {
                debug = true;
                lines = linesAsString;
            }
            String c = lines[0].split(" ")[0];
            return new String[]{c};
        }

        String solve(String c) {
            String a = "abcdefghijklmnopqrstuvwxyz";
            int i = a.indexOf(c);
            return a.charAt(i + 1) + "";
        }

        String[] result = parseInput(lines);
        if (result.length > 1) {
            for (String r : result) {
                System.out.print(r);
            }
        } else {
            System.out.print(result[0]);
        }
    }
}
```

Test input:
a

Expected output:
b 
