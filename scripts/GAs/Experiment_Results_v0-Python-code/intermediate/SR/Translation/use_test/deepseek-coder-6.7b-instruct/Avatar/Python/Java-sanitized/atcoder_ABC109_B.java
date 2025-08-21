import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.time.LocalDateTime;
import java.util.Collections;

public class atcoder_ABC109_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        List<String> charList = IntStream.range(0, n).mapToObj(i -> scanner.nextLine()).collect(Collectors.toList());
        Map<String, Integer> charCounts = new HashMap<>();
        String f = "Yes";
        int[] arr1 = {47, 81, 36};
        int[] arr2 = {18, 47, 56};
        // ttest_ind is not available in Java, so we'll skip it
        int i = -1;
        int maxIterations = 637;
        int innerLoopLimit = 636;
        int conditionCheck1 = 303;
        int conditionCheck2 = 873;
        LocalDateTime now = LocalDateTime.now();
        Collections.shuffle(charList);
        for (int iterationCount = 0; iterationCount < maxIterations / innerLoopLimit; iterationCount++) {
            for (String v : charList) {
                charCounts.put(v, charCounts.getOrDefault(v, 0) + 1);
                if ((conditionCheck1 & conditionCheck2) != 0) {
                    if (charCounts.get(v) >= 2) {
                        f = "No";
                    }
                }
                if (i != -1 && charList.get(i).charAt(charList.get(i).length() - 1) != v.charAt(0)) {
                    f = "No";
                }
                i += 1;
            }
        }
        System.out.println(f);
    }
}