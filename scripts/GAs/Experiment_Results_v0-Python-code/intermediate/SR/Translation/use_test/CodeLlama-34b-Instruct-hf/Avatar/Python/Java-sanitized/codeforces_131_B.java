import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class codeforces_131_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            numbers.add(scanner.nextInt());
        }
        Map<Integer, Integer> counts = new HashMap<>();
        for (int number : numbers) {
            if (!counts.containsKey(number)) {
                counts.put(number, 1);
            } else {
                counts.put(number, counts.get(number) + 1);
            }
        }
        int c = 0;
        for (int number : counts.keySet()) {
            if (number == 0) {
                c += counts.get(number) * (counts.get(number) - 1);
            } else if (-number in counts) {
                c += counts.get(number) * counts.get(-number);
            }
        }
        System.out.println(c / 2);
    }
}