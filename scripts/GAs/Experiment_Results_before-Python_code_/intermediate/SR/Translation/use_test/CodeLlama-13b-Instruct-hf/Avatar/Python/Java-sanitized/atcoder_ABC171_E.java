import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class atcoder_ABC171_E {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = scanner.nextInt();
        }
        int total = Stream.of(a).reduce(0, (x, y) -> x ^ y);
        String result = Stream.of(a).map(ai -> String.valueOf(ai ^ total)).collect(Collectors.joining(" "));
        System.out.println(result);
    }
}