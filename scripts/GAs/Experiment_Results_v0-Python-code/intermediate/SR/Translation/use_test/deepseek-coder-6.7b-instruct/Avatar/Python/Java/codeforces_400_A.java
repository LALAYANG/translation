```java
import java.util.*;
import java.util.stream.*;
import java.lang.*;
import java.io.*;
import java.math.*;
import java.net.*;
import java.text.*;
import java.time.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < t; i++) {
            solve(scanner);
        }
    }

    private static void solve(Scanner scanner) {
        String line = scanner.nextLine();
        List<Integer> list = Stream.of(line.split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> validDimensions = new ArrayList<>();
        for (int i = 1; i <= 12; i++) {
            if (list.size() % i == 0) {
                if (help(i, list.size() / i, list)) {
                    validDimensions.add(list.size() / i);
                    validDimensions.add(i);
                }
            }
        }
        System.out.print(validDimensions.size() / 2 + " ");
        for (int i = 0; i < validDimensions.size(); i += 2) {
            System.out.print(validDimensions.get(i) + "x" + validDimensions.get(i + 1) + " ");
        }
        System.out.println();
    }

    private static boolean help(int a, int b, List<Integer> list) {
        List<List<Integer>> validDimensions = new ArrayList<>();
        for (int i = 0; i < b; i++) {
            validDimensions.add(new ArrayList<>(list.subList(i * a, i * a + a)));
        }
        for (List<Integer> dimension : validDimensions) {
            if (dimension.stream().mapToInt(Integer::intValue).sum() == a) {
                return true;
            }
        }
        return false;
    }
}
```

