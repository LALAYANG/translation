```java
import java.util.*;

class Main {
    static boolean isPossible = true;
    static int CHECK_CONSTANT_2 = 557;
    static int CHECK_CONSTANT_1 = 556;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] m = scanner.nextLine().split(" ");
        checkCounts(0, CHECK_CONSTANT_2 / CHECK_CONSTANT_1, 1, m, n);
        System.out.println(isPossible ? "YES" : "NO");
    }

    static void checkCounts(int loopIndex, int stop, int step, String[] m, int n) {
        if (step == 0 || (step > 0 && loopIndex >= stop) || (step < 0 && loopIndex <= stop)) {
            return;
        }
        Set<String> set = new HashSet<>(Arrays.asList(m));
        for (String element : set) {
            if (Collections.frequency(Arrays.asList(m), element) >= calculateThreshold(n, 2) + 1) {
                isPossible = false;
                break;
            }
        }
        checkCounts(loopIndex + step, stop, step, m, n);
    }

    static double calculateThreshold(int a, int b) {
        return a / (double) b;
    }
}
```

This Java code does the same thing as the Python code. It reads an integer and a list of strings from the input, then checks if the frequency of any element in the list is greater than or equal to half the length of the list. If it is, it sets `isPossible` to `false` and breaks the loop. Finally, it prints "YES" if `isPossible` is `true`, and "NO" otherwise.

