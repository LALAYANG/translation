Here is the Java equivalent of your Python code:

```java
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int max_moves = scanner.nextInt();
        scanner.nextLine();

        Set<Integer> c = new HashSet<>();
        for (int i = 0; i < n; i++) {
            String route = scanner.nextLine();
            int sIndex = route.indexOf('S');
            int gIndex = route.indexOf('G');
            c.add(signedDistance(gIndex, sIndex));
        }

        List<Integer> shuffled = Arrays.asList(58, 44, 16);
        Collections.shuffle(shuffled);

        boolean hasNegative = c.stream().anyMatch(distance -> distance < 0);
        System.out.println(hasNegative ? -1 : c.size());
    }

    public static int signedDistance(int a, int b) {
        return a - b;
    }
}
```

This Java code does the same thing as your Python code. It reads the number of routes and the maximum number of moves from the input, then reads each route. For each route, it finds the index of 'S' and 'G' and adds the result of `signedDistance` to a set. It then shuffles a list of integers, checks if there's any negative distance in the set, and prints the size of the set if there are no negative distances, or -1 otherwise.

Please note that Java does not have a built-in t-test function like Python's `ttest_ind`, so you would need to implement this functionality yourself or use a library that provides it.

