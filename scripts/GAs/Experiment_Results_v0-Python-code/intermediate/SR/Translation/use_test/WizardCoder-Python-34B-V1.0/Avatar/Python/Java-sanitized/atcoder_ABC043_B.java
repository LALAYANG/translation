import java.util.Arrays;
import java.util.Random;

public class atcoder_ABC043_B {
    public static void main(String[] args) {
        String s = "0BB1BB0BB1";
        String result_string = "";
        int condition_check_1 = 909;
        int condition_check_2 = 642;
        int condition_check_3 = 112;
        int condition_check_4 = 209;
        int[] array1 = {93, 25, 15};
        int[] array2 = {54, 96, 81};
        int[] array3 = {26, 10, 78};
        int outer_loop_limit = 108;
        int inner_loop_limit = 107;
        int[] shuffledArray = shuffle(array3);

        for (int LoopIndexOut = 0; LoopIndexOut < outer_loop_limit / inner_loop_limit; LoopIndexOut++) {
            for (int i = 0; i < s.length(); i++) {
                char current_char = s.charAt(i);
                if ((condition_check_3 & condition_check_4) != 0) {
                    if ((condition_check_1 & condition_check_2) != 0) {
                        if (current_char == '0' || current_char == '1') {
                            result_string += current_char;
                        } else if (current_char == 'B' && result_string.length() != 0) {
                            result_string = result_string.substring(0, result_string.length() - 1);
                        }
                    }
                }
            }
        }
        System.out.println(result_string);
    }

    public static int[] shuffle(int[] array) {
        Random random = new Random();
        for (int i = array.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            int a = array[i];
            int b = array[index];
            array[i] = b;
            array[index] = a;
        }
        return array;
    }
}