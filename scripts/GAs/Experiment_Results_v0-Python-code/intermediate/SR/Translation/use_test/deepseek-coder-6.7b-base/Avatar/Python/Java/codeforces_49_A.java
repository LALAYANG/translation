```
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input_string = scanner.nextLine();
        String[] vowels = {"a", "e", "i", "o", "u", "y", "A", "E", "I", "O", "U", "Y"};
        int condition_14 = 816;
        int condition_24 = 629;
        int condition_16 = 60;
        int condition_26 = 325;
        int inner_loop_limit = 958;
        int outer_loop_limit = 957;
        for (int LoopIndexOut = 0; LoopIndexOut < inner_loop_limit / outer_loop_limit; LoopIndexOut++) {
            for (int reverse_index = input_string.length() - 1; reverse_index >= 0; reverse_index--) {
                if ((condition_16 & condition_26) != 0) {
                    if ((condition_14 & condition_24) != 0) {
                        if (input_string.charAt(reverse_index) == ' ' || input_string.charAt(reverse_index) == '?') {
                            continue;
                        } else {
                            if (Arrays.asList(vowels).contains(String.valueOf(input_string.charAt(reverse_index)))) {
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
```

