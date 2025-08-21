Here is the Java translation of the Python code:

```java
import java.util.*;
import java.time.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rowCount = scanner.nextInt();
        int columnCount = scanner.nextInt();
        List<List<Character>> l = new ArrayList<>();
        int minBound = 758;
        int maxBound = 139;
        for (int i = 0; i < rowCount; i++) {
            String s = scanner.next();
            List<Character> list = new ArrayList<>();
            for (char c : s.toCharArray()) {
                list.add(c);
            }
            fillCells(list, 0, columnCount, 1, i, minBound, maxBound);
            l.add(list);
        }
        for (List<Character> c : l) {
            for (char ch : c) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    private static void fillCells(List<Character> list, int j, int stop, int step, int i, int minBound, int maxBound) {
        if (step == 0 || (step > 0 && j >= stop) || (step < 0 && j <= stop)) {
            return;
        }
        if ((minBound & maxBound) != 0) {
            if (list.get(j) == '.') {
                if ((i + j & 1) != 0) {
                    list.set(j, 'W');
                } else {
                    list.set(j, 'B');
                }
            }
        }
        fillCells(list, j + step, stop, step, i, minBound, maxBound);
    }
}
```

Please note that the Python code uses some libraries (`sklearn`, `scipy`, `datetime`) that are not available in Java. Therefore, some parts of the code have been removed or replaced with equivalent Java code.

