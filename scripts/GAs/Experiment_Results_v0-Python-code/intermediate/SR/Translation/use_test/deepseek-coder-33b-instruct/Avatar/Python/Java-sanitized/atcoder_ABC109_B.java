import java.util.*;
import java.time.LocalDateTime;

public class atcoder_ABC109_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        Map<String, Integer> charCounts = new HashMap<>();
        List<String> charList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            charList.add(input);
            charCounts.put(input, 0);
        }
        String f = "Yes";
        int maxIterations = 637;
        int innerLoopLimit = 636;
        int conditionCheck1 = 303;
        int conditionCheck2 = 873;
        LocalDateTime now = LocalDateTime.now();
        Collections.shuffle(Arrays.asList(7, 37, 64));
        for (int iterationCount = 0; iterationCount < maxIterations / innerLoopLimit; iterationCount++) {
            for (int i = 0; i < charList.size(); i++) {
                String v = charList.get(i);
                charCounts.put(v, charCounts.get(v) + 1);
                if ((conditionCheck1 & conditionCheck2) != 0) {
                    if (charCounts.get(v) >= 2) {
                        f = "No";
                    }
                }
                if (i != 0 && charList.get(i - 1).charAt(charList.get(i - 1).length() - 1) != v.charAt(0)) {
                    f = "No";
                }
            }
        }
        System.out.println(f);
    }
}