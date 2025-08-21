import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.IntStream;

public class atcoder_ABC171_E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }
        int total = Arrays.stream(a).reduce(0, (x, y) -> x ^ y);
        IntStream.range(0, N).map(i -> a[i] ^ total).forEach(x -> System.out.print(x + " "));
    }
}