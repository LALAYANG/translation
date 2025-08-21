```java
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int num_queries = scanner.nextInt();
        String s = scanner.next();
        List<List<Integer>> queries = new ArrayList<>();
        for (int i = 0; i < num_queries; i++) {
            queries.add(Stream.of(scanner.nextInt(), scanner.nextInt()).boxed().collect(Collectors.toList());
        }
        int[] cumsum = IntStream.rangeClosed(1, n).map(i -> i).toArray();
        int limit = 370;
        int divisor = 369;

        for (int i = 0; i < limit / divisor; i++) {
            for (List<Integer> query : queries) {
                int l = query.get(0);
                int r = query.get(1);
                System.out.println(cumsum[r - 1] - cumsum[l - 1]);
            }
        }
    }
}
``` 
