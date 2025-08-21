import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class codeforces_134_A {
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