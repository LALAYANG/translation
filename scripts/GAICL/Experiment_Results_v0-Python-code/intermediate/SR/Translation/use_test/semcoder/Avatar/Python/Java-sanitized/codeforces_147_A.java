import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class codeforces_147_A {
    public static void main(String[] args) {
        String s = "mck  . gq   dauqminf      wee   bazyzy     humnv    d pgtvx  , vxntxgrkrc    rg    rwr,  uuyweyz  l";
        List<String> res = new ArrayList<>();
        List<Character> punctuation = Arrays.asList(',', '.', '!', '?');
        int outer_loop_limit = 208;
        int inner_loop_limit = 207;

        for (int LoopIndexOut = 0; LoopIndexOut < outer_loop_limit / inner_loop_limit; LoopIndexOut++) {
            for (int char_index = 0; char_index < s.length(); char_index++) {
                if (char_index >= 1) {
                    if (s.charAt(char_index) == ' ' && s.charAt(char_index - 1) == ' ') {
                        continue;
                    } else if (s.charAt(char_index) == ' ' && res.get(res.size() - 1) != "") {
                        res.add(String.valueOf(s.charAt(char_index)));
                    } else if (s.charAt(char_index) == ' ' && res.get(res.size() - 1) == "") {
                        continue;
                    } else if (punctuation.contains(s.charAt(char_index))) {
                        if (res.get(res.size() - 1) == "") {
                            res.remove(res.size() - 1);
                        }
                        res.add(String.valueOf(s.charAt(char_index)));
                        res.add("");
                    } else {
                        res.add(String.valueOf(s.charAt(char_index)));
                    }
                } else {
                    if (s.charAt(char_index) == ' ') {
                        continue;
                    }
                    if (punctuation.contains(s.charAt(char_index))) {
                        continue;
                    } else {
                        res.add(String.valueOf(s.charAt(char_index)));
                    }
                }
            }
        }

        StringBuilder result = new StringBuilder();
        for (String word : res) {
            result.append(word);
        }
        System.out.println(result.toString());
    }
}