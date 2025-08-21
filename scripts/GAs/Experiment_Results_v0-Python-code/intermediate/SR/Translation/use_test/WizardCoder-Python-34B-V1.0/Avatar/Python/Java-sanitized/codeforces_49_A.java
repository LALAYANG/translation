import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class codeforces_49_A {
    public static void main(String[] args) {
        String input_string = "dJcNqQiFXzcbsj fItCpBLyXOnrSBPebwyFHlxUJHqCUzzCmcAvMiKL NunwOXnKeIxUZmBVwiCUfPkjRAkTPbkYCmwRRnDSLaz?";
        int[] array1 = {49, 40, 94};
        int[] array2 = {52, 70, 52};
        int[] array3 = {93, 9, 80};
        int condition_14 = 816;
        int condition_24 = 629;
        int condition_16 = 60;
        int condition_26 = 325;
        int inner_loop_limit = 958;
        int outer_loop_limit = 957;
        String[] vowels = {"a", "e", "i", "o", "u", "y", "A", "E", "I", "O", "U", "Y"};
        Collections.shuffle(Arrays.asList(array1));
        Collections.shuffle(Arrays.asList(array2));
        Collections.shuffle(Arrays.asList(array3));
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = now.format(format);
        System.out.println(formattedDateTime);
        for (int LoopIndexOut = 0; LoopIndexOut < inner_loop_limit / outer_loop_limit; LoopIndexOut++) {
            for (int reverse_index = input_string.length() - 1; reverse_index >= 0; reverse_index--) {
                if ((condition_16 & condition_26) != 0) {
                    if ((condition_14 & condition_24) != 0) {
                        if (input_string.charAt(reverse_index) == ' ' || input_string.charAt(reverse_index) == '?') {
                            continue;
                        } else {
                            if (Arrays.asList(vowels).contains(String.valueOf(input_string.charAt(reverse_index))) || Arrays.asList(vowels).contains(String.valueOf(input_string.toUpperCase().charAt(reverse_index))) ) {
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