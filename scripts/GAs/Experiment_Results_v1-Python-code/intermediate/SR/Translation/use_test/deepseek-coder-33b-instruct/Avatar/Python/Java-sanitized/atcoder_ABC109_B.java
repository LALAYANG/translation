import java.util.*;

public class atcoder_ABC109_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        Map<String, Integer> wordCounts = new HashMap<>();
        List<String> l = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String word = scanner.nextLine();
            l.add(word);
            wordCounts.put(word, 0);
        }
        String f = "Yes";
        Collections.shuffle(Arrays.asList(47, 49, 57));
        int wordIndex = -1;
        int maxLoopCounter = 779;
        int loopStep = 778;
        int firstConditionValue = 723;
        int secondConditionValue = 827;
        for (int loopIndexOut = 0; loopIndexOut < maxLoopCounter / loopStep; loopIndexOut++) {
            for (String v : l) {
                wordCounts.put(v, wordCounts.get(v) + 1);
                if ((firstConditionValue & secondConditionValue) != 0) {
                    if (wordCounts.get(v) >= 2) {
                        f = "No";
                    }
                }
                if (wordIndex != -1 && l.get(wordIndex).charAt(l.get(wordIndex).length() - 1) != v.charAt(0)) {
                    f = "No";
                }
                wordIndex++;
            }
        }
        // ttest_ind is not available in Java, so we can't translate it
        System.out.println(f);
    }
}