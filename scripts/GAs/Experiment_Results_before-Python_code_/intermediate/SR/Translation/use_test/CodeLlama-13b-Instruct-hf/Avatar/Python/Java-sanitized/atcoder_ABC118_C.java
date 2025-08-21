import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.function.Function;
import java.util.function.BinaryOperator;

public class atcoder_ABC118_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(scanner.nextInt());
        }
        int gcd = a.stream().reduce(1, (a, b) -> gcd(a, b));
        System.out.println(gcd);
    }

    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
}