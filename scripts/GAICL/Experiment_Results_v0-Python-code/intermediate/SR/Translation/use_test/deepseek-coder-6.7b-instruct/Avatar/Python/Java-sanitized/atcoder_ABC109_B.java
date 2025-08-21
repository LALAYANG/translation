import java.util.*;

public class atcoder_ABC109_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        List<String> charList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            charList.add(scanner.nextLine());
        }
        String f = "Yes";
        int i = -1;
        int maxIterations = 637;
        int innerLoopLimit = 636;
        int conditionCheck1 = 303;
        int conditionCheck2 = 873;
        Collections.shuffle(charList);
        for (int iterationCount = 0; iterationCount < maxIterations / innerLoopLimit; iterationCount++) {
            for (String v : charList) {
                // Assuming charCounts is a HashMap with default value 0
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