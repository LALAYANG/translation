```java
import java.util.*;
import java.lang.*;

class Main {
    static List<String> l = new ArrayList<>();
    static int min_bound = 758;
    static int max_bound = 139;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row_count = scanner.nextInt();
        int column_count = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < row_count; i++) {
            String s = scanner.nextLine();
            char[] chars = s.toCharArray();
            fillCells(chars, column_count, 1, i);
            l.add(new String(chars));
        }

        for (String c : l) {
            System.out.println(c);
        }
    }

    static void fillCells(char[] chars, int j, int stop, int step, int i) {
        if (step == 0 || (step > 0 && j >= stop) || (step < 0 && j <= stop)) {
            return;
        }
        if (min_bound < max_bound) {
            if (chars[j] == '.') {
                if (i + j % 2 == 0) {
                    chars[j] = 'B';
                } else {
                    chars[j] = 'W';
                }
            }
        }
        fillCells(chars, j + step, stop, step, i);
    }
}
```

Please note that the Python code you provided uses some libraries (like scipy, sklearn, and datetime) that are not available in Java. Therefore, the Java code provided is a direct translation of your Python code without these libraries.

