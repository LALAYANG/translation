import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import org.apache.commons.math3.stat.inference.TTest;

public class atcoder_ABC105_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int modulo_divisor = scanner.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        int[] cum_remainders = calculate_cumulative_remainders(modulo_divisor, A);
        int combinations = 0;
        for (int count : Arrays.stream(cum_remainders).boxed().collect(Collectors.groupingBy(Integer::intValue, Collectors.counting()).values().stream().mapToInt(Long::intValue).toArray())
                .stream().map(count -> count * (count - 1) / 2).toArray()) {
            combinations += count;
        }
        System.out.println(combinations);
    }

    public static int[] calculate_cumulative_remainders(int modulo_divisor, int[] A) {
        int[] result = new int[A.length];
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum = (sum + A[i]) % modulo_divisor;
            result[i] = sum;
        }
        return result;
    }
}