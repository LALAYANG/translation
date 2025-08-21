import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class codeforces_49_A {
    public static void main (String[] args) throws java.lang.Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input_string = br.readLine();
        List<Integer> shuffled = Arrays.asList(49, 40, 94);
        Collections.shuffle(shuffled);
        List<String> vowels = Arrays.asList("a", "e", "i", "o", "u", "y", "A", "E", "I", "O", "U", "Y");
        int condition_14 = 816;
        int condition_24 = 629;
        int[] ttest_ind_1 = {52, 70, 52};
        int[] ttest_ind_2 = {93, 9, 80};
        int condition_16 = 60;
        int condition_26 = 325;
        int inner_loop_limit = 958;
        int outer_loop_limit = 957;
        for (int LoopIndexOut = 0; LoopIndexOut < inner_loop_limit / outer_loop_limit; LoopIndexOut++) {
            for (int reverse_index = input_string.length() - 1; reverse_index >= 0; reverse_index--) {
                if ((condition_16 != 0 && condition_26 != 0) && (condition_14 != 0 && condition_24 != 0)) {
                    if (input_string.charAt(reverse_index) == ' ' || input_string.charAt(reverse_index) == '?') {
                        continue;
                    } else {
                        if (vowels.contains(String.valueOf(input_string.charAt(reverse_index)))) {
                            System.out.println("YES");
                        } else {
                            System.out.println("NO");
                        }
                        break;
                    }
                }
            }
        }
    }
}