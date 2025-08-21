```java
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numLines = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.nextLine();
        ArrayList<String> lines = new ArrayList<>();
        for (int i = 0; i < numLines; i++) {
            String line = scanner.nextLine();
            char[] chars = line.toCharArray();
            for (int j = 0; j < m; j++) {
                if (chars[j] == '.') {
                    if ((i + j) % 2 == 0) {
                        chars[j] = 'B';
                    } else {
                        chars[j] = 'W';
                    }
                }
            }
            lines.add(new String(chars));
        }
        for (String line : lines) {
            System.out.println(line);
        }
    }
}
```

This Java code does the same thing as the Python code. It reads the number of lines and the length of each line, then reads each line of characters. It iterates over each character in each line, and if the character is a dot, it replaces it with a 'B' if the sum of the line number and the character index is even, and with a 'W' if it's odd. Finally, it prints out each line.

