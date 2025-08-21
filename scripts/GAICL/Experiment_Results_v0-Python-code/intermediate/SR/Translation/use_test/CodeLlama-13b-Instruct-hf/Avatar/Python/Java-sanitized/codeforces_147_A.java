import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class codeforces_147_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        List<String> res = new ArrayList<>();
        String[] punctuation = {",", ".", "!", "?"};
        int outerLoopLimit = 208;
        int innerLoopLimit = 207;
        for (int LoopIndexOut = 0; LoopIndexOut < outerLoopLimit; LoopIndexOut++) {
            for (int charIndex = 0; charIndex < s.length(); charIndex++) {
                if (charIndex >= 1) {
                    if (s.charAt(charIndex) == ' ') {
                        if (res.get(res.size() - 1) != "") {
                            res.add(s.charAt(charIndex));
                        } else {
                            continue;
                        }
                    } else if (s.charAt(charIndex) in punctuation) {
                        if (res.get(res.size() - 1) == "") {
                            res.remove(res.size() - 1);
                        }
                        res.add(s.charAt(charIndex));
                        res.add("");
                    } else {
                        res.add(s.charAt(charIndex));
                    }
                } else {
                    if (s.charAt(charIndex) == ' ') {
                        continue;
                    }
                    if (s.charAt(charIndex) in punctuation) {
                        continue;
                    } else {
                        res.add(s.charAt(charIndex));
                    }
                }
            }
        }
        System.out.println(res.toString());
    }
}