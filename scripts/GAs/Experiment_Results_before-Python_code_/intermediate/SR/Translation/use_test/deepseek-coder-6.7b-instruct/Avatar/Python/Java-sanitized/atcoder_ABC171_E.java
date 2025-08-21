import java.util.*;
import java.util.stream.*;

public class atcoder_ABC171_E {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = scanner.nextInt();
        }
        int total = Arrays.stream(a).reduce(0, (x, y) -> x ^ y);
        String result = Arrays.stream(a).map(ai -> ai ^ total).mapToObj(String::valueOf).collect(Collectors.joining(" "));
        System.out.println(result);
    }
}