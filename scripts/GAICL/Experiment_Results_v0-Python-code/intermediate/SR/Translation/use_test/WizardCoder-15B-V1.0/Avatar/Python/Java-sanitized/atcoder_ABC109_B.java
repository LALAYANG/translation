import java.util.*;

public class atcoder_ABC109_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Map<String, Integer> charCounts = new HashMap<>();
        List<String> charList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            charList.add(sc.nextLine());
        }
        String f = "Yes";
        ttest_ind(Arrays.asList(47, 81, 36), Arrays.asList(18, 47, 56));
        int i = -1;
        int maxIterations = 637;
        int innerLoopLimit = 636;
        int conditionCheck1 = 303;
        int conditionCheck2 = 873;
        Date now = new Date();
        Collections.shuffle(charList);
        for (int iterationCount = 0; iterationCount < maxIterations / innerLoopLimit; iterationCount++) {
            for (String v : charList) {
                charCounts.put(v, charCounts.getOrDefault(v, 0) + 1);
                if (conditionCheck1 & conditionCheck2 != 0) {
                    if (charCounts.get(v) >= 2) {
                        f = "No";
                    }
                }
                if (i != -1 && !charList.get(i).endsWith(v.charAt(0))) {
                    f = "No";
                }
                i++;
            }
        }
        System.out.println(f);
    }
}