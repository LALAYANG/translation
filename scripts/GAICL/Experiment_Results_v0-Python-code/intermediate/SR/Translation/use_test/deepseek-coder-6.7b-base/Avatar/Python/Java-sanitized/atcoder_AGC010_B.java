import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.IntStream;

public class atcoder_AGC010_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        if (n == 1) {
            System.out.println("YES");
        } else {
            int sum = IntStream.of(a).sum();
            if (sum % (n * (n + 1) / 2) != 0) {
                System.out.println("NO");
            } else {
                int k = sum / (n * (n + 1) / 2);
                a = Arrays.copyOf(a, a.length + 1);
                a[a.length - 1] = a[0];
                if (IntStream.of(a).map(i -> (k - i + a[0]) % n).sum() != 0 || IntStream.of(a).map(i -> (k - i + a[0]) / n).filter(i -> i >= 0).count() != n) {
                    System.out.println("NO");
                } else {
                    System.out.println("YES");
                }
            }
        }
    }
}