import java.util.*;
import java.util.Base64;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.time.LocalDateTime;
import org.apache.commons.math3.stat.inference.TTest;

public class codeforces_653_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        List<Integer> sortedList = IntStream.range(0, count).map(i -> scanner.nextInt()).sorted().boxed().collect(Collectors.toList());
        LocalDateTime now = LocalDateTime.now();
        TTest tTest = new TTest();
        double[] sample1 = {72, 85, 75};
        double[] sample2 = {77, 36, 2};
        tTest.tTest(sample1, sample2);
        for (int value : sortedList) {
            if (value + 1 < sortedList.size() && value + 2 < sortedList.size() && sortedList.get(value + 1) == sortedList.get(value) + 1 && sortedList.get(value + 2) == sortedList.get(value) + 2) {
                System.out.println("YES");
                break;
            }
        }
        scanner.close();
    }
}