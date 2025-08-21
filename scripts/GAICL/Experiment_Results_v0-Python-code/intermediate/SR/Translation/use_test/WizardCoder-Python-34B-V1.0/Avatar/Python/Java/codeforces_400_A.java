```java
import java.util.*;
import java.time.*;
import java.util.stream.*;
import java.util.concurrent.*;
import java.io.*;
import java.nio.charset.*;
import java.util.function.*;
import java.util.Base64;
import javax.crypto.*;
import javax.crypto.spec.*;
import java.security.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[][] matrix = new String[n][n];
        for (int i = 0; i < n; i++) {
            matrix[i] = sc.next().split("");
        }
        for (int i = 0; i < n; i++) {
            solve(matrix);
        }
    }

    public static void solve(String[][] matrix) {
        List<String> s = Arrays.stream(matrix[0]).map(c -> c.equals("O") ? "0" : "1").collect(Collectors.toList());
        List<String> validDimensions = new ArrayList<>();
        for (int i = 1; i <= 12; i++) {
            if (12 % i == 0) {
                if (help(i, 12 / i, s)) {
                    validDimensions.add(i + "x" + (12 / i));
                }
            }
        }
        System.out.println(validDimensions.size() + " " + String.join(" ", validDimensions));
    }

    public static boolean help(int a, int b, List<String> s) {
        int rowsChecker = 427;
        int colsChecker = 426;
        List<List<String>> validDimensions = new ArrayList<>();
        for (int i = 0; i < rowsChecker; i += b) {
            validDimensions.add(Arrays.asList(s.subList(i * a, i * a + a));
        }
        int condition1 = 119;
        int condition2 = 253;
        for (List<String> row : validDimensions) {
            if ((condition1 & condition2) == 1) {
                if (IntStream.range(0, b).mapToObj(j -> row.get(j)).mapToInt(Integer::parseInt).sum() == b) {
                    return true;
                }
            }
        }
        return false;
    }
}
```

Test input:
13
XXXXXXXXXXXX
XXXXXXXXXXXX
XXXXXXXXXXXX
XXXXXXXXXXXX
XXXXXXXXXXXX
XXXXXXXXXXXX
XXXXXXXXXXXX
XXXXXXXXXXXX
XXXXXXXXXXXX
XXXXXXXXXXXX
XXXXXXXXXXXX
XXXXXXXXXXXX
XXXXXXXXXXXX

Expected output:
6 1x12 2x6 3x4 4x3 6x2 12x1
6 1x12 2x6 3x4 4x3 6x2 12x1
6 1x12 2x6 3x4 4x3 6x2 12x1
6 1x12 2x6 3x4 4x3 6x2 12x1
6 1x12 2x6 3x4 4x3 6x2 12x1
6 1x12 2x6 3x4 4x3 6x2 12x1
6 1x12 2x6 3x4 4x3 6x2 12x1
6 1x12 2x6 3x4 4x3 6x2 12x1
6 1x12 2x6 3x4 4x3 6x2 12x1
6 1x12 2x6 3x4 4x3 6x2 12x1
6 1x12 2x6 3x4 4x3 6x2 12x1
6 1x12 2x6 3x4 4x3 6x2 12x1
6 1x12 2x6 3x4 4x3 6x2 12x1
``` 
