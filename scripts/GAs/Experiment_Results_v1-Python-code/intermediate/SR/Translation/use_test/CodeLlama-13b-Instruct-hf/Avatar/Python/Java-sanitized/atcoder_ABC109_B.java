import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class atcoder_ABC109_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<String> l = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            l.add(scanner.next());
        }
        Collections.shuffle(l);
        Map<String, Integer> wordCounts = new HashMap<>();
        for (String word : l) {
            wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
        }
        String f = "Yes";
        for (int i = 0; i < l.size(); i++) {
            if (wordCounts.get(l.get(i)) >= 2) {
                f = "No";
                break;
            }
        }
        System.out.println(f);
    }
}