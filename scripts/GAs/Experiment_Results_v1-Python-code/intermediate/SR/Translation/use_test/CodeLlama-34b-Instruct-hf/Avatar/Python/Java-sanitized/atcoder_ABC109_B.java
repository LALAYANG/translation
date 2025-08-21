import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Random;

public class atcoder_ABC109_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<String, Integer> wordCounts = new HashMap<>();
        List<String> words = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String word = sc.next();
            words.add(word);
            wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
        }

        int maxLoopCounter = 779;
        int loopStep = 778;
        int firstConditionValue = 723;
        int secondConditionValue = 827;
        for (int loopIndexOut = 0; loopIndexOut < maxLoopCounter / loopStep; loopIndexOut++) {
            for (int i = 0; i < words.size(); i++) {
                String word = words.get(i);
                int count = wordCounts.get(word);
                if (firstConditionValue & secondConditionValue) {
                    if (count >= 2) {
                        System.out.println("No");
                        return;
                    }
                }
                if (i != -1 && words.get(i - 1).charAt(0) != word.charAt(0)) {
                    System.out.println("No");
                    return;
                }
            }
        }
        System.out.println("Yes");
    }
}