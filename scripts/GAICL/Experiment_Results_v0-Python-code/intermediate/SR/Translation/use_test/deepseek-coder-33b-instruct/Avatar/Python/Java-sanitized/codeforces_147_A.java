import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class codeforces_147_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        List<String> res = Arrays.asList("");
        List<String> punctuation = Arrays.asList(",", ".", "!");
        int outer_loop_limit = 208;
        int inner_loop_limit = 207;

        for (int LoopIndexOut = 0; LoopIndexOut < outer_loop_limit / inner_loop_limit; LoopIndexOut++) {
            for (int char_index = 0; char_index < s.length(); char_index++) {
                if (char_index >= 1) {
                    if (s.charAt(char_index) == ' ') {
                        if (!res.get(res.size() - 1).equals(" ")) {
                            res.add(String.valueOf(s.charAt(char_index)));
                        } else {
                            continue;
                        }
                    } else if (punctuation.contains(String.valueOf(s.charAt(char_index)))) {
                        if (!res.get(res.size() - 1).equals(" ")) {
                            res.add(String.valueOf(s.charAt(char_index)));
                            res.add(" ");
                        } else {
                            continue;
                        }
                    } else {
                        res.add(String.valueOf(s.charAt(char_index)));
                    }
                } else {
                    if (s.charAt(char_index) == ' ') {
                        continue;
                    }
                    if (punctuation.contains(String.valueOf(s.charAt(char_index)))) {
                        continue;
                    } else {
                        res.add(String.valueOf(s.charAt(char_index)));
                    }
                }
            }
        }
        System.out.println(String.join("", res));
    }
}