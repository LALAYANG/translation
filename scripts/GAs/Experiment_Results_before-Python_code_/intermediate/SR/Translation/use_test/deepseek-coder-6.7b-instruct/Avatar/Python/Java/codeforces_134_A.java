```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        List<Integer> w = Stream.of(reader.readLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int x = w.stream().reduce(0, Integer::sum);
        List<Integer> d = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if ((x - w.get(i)) / (n - 1) == w.get(i)) {
                d.add(i + 1);
            }
        }
        System.out.println(d.size());
        System.out.println(d.stream().map(String::valueOf).collect(Collectors.joining(" ")));
    }
}
```

This Java code does the same thing as the Python code. It reads an integer `n` and a list of integers `w` from the input, calculates the sum of the weights `x`, and then checks each weight in the list to see if it is equal to the average weight (`x / n`). If it is, the index of that weight is added to the list `d`. Finally, it prints the size of `d` and the elements of `d` (separated by spaces).

