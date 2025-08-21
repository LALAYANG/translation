```
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int x = Integer.parseInt(input[0]);
        int y = Integer.parseInt(input[1]);
        int z = Integer.parseInt(input[2]);
        int k = Integer.parseInt(input[3]);
        List<Integer> a = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> b = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> c = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> ab = new ArrayList<>();
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                ab.add(a.get(i) + b.get(j));
            }
        }
        Collections.sort(ab, Collections.reverseOrder());
        List<Integer> abc = new ArrayList<>();
        for (int i = 0; i < Math.min(k, x * y); i++) {
            for (int j = 0; j < z; j++) {
                abc.add(ab.get(i) + c.get(j));
            }
        }
        Collections.sort(abc, Collections.reverseOrder());
        for (int i = 0; i < k; i++) {
            System.out.println(abc.get(i));
        }
    }
}
```

