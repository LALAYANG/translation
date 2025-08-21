import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class atcoder_AGC010_B {
    public static void main(String[] args) {
        int n = Integer.parseInt(input());
        List<Integer> a = Arrays.stream(input().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        double average = a.stream().mapToDouble(i -> i).average().orElse(0);

        if (average % (n * (n + 1) / 2) == 0) {
            double sum = a.stream().mapToDouble(i -> Math.abs(average - i)).sum();
            if (sum == n) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } else {
            System.out.println("NO");
        }
    }
}