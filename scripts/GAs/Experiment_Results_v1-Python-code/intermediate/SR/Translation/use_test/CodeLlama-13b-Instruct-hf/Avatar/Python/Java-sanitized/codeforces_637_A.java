import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class codeforces_637_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] s = scanner.nextLine().split(" ");
        Map<String, Integer> w = new HashMap<>();
        for (String word : s) {
            w.put(word, w.getOrDefault(word, 0) + 1);
        }
        List<String> reversedS = Arrays.asList(s);
        Collections.reverse(reversedS);
        int c = -1;
        String a = "";
        for (int i = 0; i < reversedS.size(); i++) {
            String word = reversedS.get(i);
            if (w.get(word) == Collections.max(w.values())) {
                if (i > c) {
                    a = word;
                    c = i;
                }
            }
        }
        System.out.println(a);
    }
}