import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class atcoder_ABC178_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input = scanner.nextLine().split(" ").stream().mapToInt(Integer::parseInt).toArray();
        int a = input[0];
        int b = input[1];
        int c = input[2];
        int d = input[3];
        int result = Math.max(a * c, Math.max(b * d, a * d, b * c));
        System.out.println(result);
    }
}