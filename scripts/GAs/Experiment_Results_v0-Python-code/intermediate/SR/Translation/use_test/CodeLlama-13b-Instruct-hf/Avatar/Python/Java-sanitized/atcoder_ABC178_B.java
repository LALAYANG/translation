import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicInteger;

public class atcoder_ABC178_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int multiplier = scanner.nextInt();
        int d = scanner.nextInt();
        int result = Math.max(a * multiplier, b * d);
        System.out.println(result);
    }
}