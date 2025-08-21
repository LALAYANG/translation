import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.stream.Collectors;
import java.util.function.Function;

public class atcoder_ABC118_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        scanner.nextLine();
        String[] numbers = scanner.nextLine().split(" ");
        List<Integer> nums = Arrays.stream(numbers).map(Integer::parseInt).collect(Collectors.toList());
        int greatest_common_divisor = nums.stream().reduce(Main::gcd).get();
        System.out.println(greatest_common_divisor);
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
}