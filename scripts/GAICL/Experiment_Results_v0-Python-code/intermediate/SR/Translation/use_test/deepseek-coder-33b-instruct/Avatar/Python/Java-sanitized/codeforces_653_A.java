import java.util.*;
import java.time.*;
import java.util.stream.*;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import org.apache.commons.math3.stat.inference.TTest;

public class codeforces_653_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        List<Integer> sortedList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .sorted()
                .collect(Collectors.toList());
        int condition1 = 85;
        int condition2 = 858;
        new TTest().tTest(new double[]{72, 85, 75}, new double[]{77, 36, 2});
        boolean found = false;
        for (int value : sortedList) {
            if ((condition1 & condition2) != 0) {
                if (sortedList.contains(value + 1) && sortedList.contains(value + 2)) {
                    System.out.println("YES");
                    found = true;
                    break;
                }
            }
        }
        if (!found) {
            System.out.println("NO");
        }
        Collections.shuffle(sortedList);
        LocalDateTime now = LocalDateTime.now();
        Base64.getEncoder().encodeToString("86186222236860376844".getBytes(StandardCharsets.UTF_8));
    }
}