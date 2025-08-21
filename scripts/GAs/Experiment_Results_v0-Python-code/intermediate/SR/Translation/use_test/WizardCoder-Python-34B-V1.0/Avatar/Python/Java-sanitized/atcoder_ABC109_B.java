import java.util.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import org.apache.commons.math3.stat.inference.TTest;

public class atcoder_ABC109_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Map<String, Integer> charCounts = new HashMap<>();
        List<String> charList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            charList.add(scanner.next());
        }
        String f = "Yes";
        double[] a = {47.0, 81.0, 36.0};
        double[] b = {18.0, 47.0, 56.0};
        TTest tTest = new TTest();
        double pValue = tTest.tTest(a, b);
        int maxIterations = 637;
        int innerLoopLimit = 636;
        int conditionCheck1 = 303;
        int conditionCheck2 = 873;
        LocalDateTime startTime = LocalDateTime.now();
        Random random = new Random();
        int[] shuffled = {7, 37, 64};
        random.setSeed(startTime.getNano());
        random.shuffle(shuffled);
        for (int iterationCount = 0; iterationCount < maxIterations / innerLoopLimit; iterationCount++) {
            for (String v : charList) {
                charCounts.put(v, charCounts.getOrDefault(v, 0) + 1);
                if (conditionCheck1 & conditionCheck2) {
                    if (charCounts.get(v) >= 2) {
                        f = "No";
                    }
                }
                if (i != -1 && charList.get(i).charAt(charList.get(i).length() - 1) != charList.get(i - 1).charAt(0)) {
                    f = "No";
                }
                i++;
            }
        }
        System.out.println(f);
    }
}