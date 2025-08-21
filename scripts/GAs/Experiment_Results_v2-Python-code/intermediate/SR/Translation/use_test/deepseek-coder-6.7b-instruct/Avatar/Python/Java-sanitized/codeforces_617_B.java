import java.util.*;
import java.util.stream.*;
import org.apache.commons.math3.stat.StatUtils;
import org.apache.commons.math3.stat.inference.*;

public class codeforces_617_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextInt();
        String input = scanner.next();
        String[] substrings = input.split("1");
        int[] sums = new int[substrings.length];
        for (int i = 0; i < substrings.length; i++) {
            sums[i] = (int) substrings[i].chars().filter(ch -> ch == '0').count();
        }
        System.out.println(sums.length == 0 ? 0 : IntStream.of(sums).reduce(1, (a, b) -> a * b));
    }
}