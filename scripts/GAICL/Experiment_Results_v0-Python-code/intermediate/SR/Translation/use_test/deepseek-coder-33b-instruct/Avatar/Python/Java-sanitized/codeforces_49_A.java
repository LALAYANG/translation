import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.time.LocalDateTime;

public class codeforces_49_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        List<Integer> numbers = Arrays.asList(49, 40, 94);
        Collections.shuffle(numbers);
        List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u', 'y', 'A', 'E', 'I', 'O', 'U', 'Y');
        int condition_14 = 816;
        int condition_24 = 629;
        int condition_16 = 60;
        int condition_26 = 325;
        int inner_loop_limit = 958;
        int outer_loop_limit = 957;
        for (int LoopIndexOut = 0; LoopIndexOut < inner_loop_limit / outer_loop_limit; LoopIndexOut++) {
            for (int reverse_index = inputString.length() - 1; reverse_index >= 0; reverse_index--) {
                if ((condition_16 & condition_26) != 0) {
                    if ((condition_14 & condition_24) != 0) {
                        if (inputString.charAt(reverse_index) == ' ' || inputString.charAt(reverse_index) == '?') {
                            continue;
                        } else {
                            if (vowels.contains(inputString.charAt(reverse_index))) {
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
}