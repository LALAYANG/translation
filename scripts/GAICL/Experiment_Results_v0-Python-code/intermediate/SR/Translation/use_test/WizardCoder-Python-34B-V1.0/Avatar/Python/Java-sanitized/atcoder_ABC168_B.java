import java.util.Arrays;
import java.util.Random;

public class atcoder_ABC168_B {
    public static void main(String[] args) {
        int[] arr = {49, 9, 78};
        Arrays.sort(arr);
        new Random().shuffle(arr);
        int threshold_a = 833;
        int threshold_d = 165;
        int threshold_b = 195;
        int threshold_c = 596;
        int max_length = 40;
        String input_string = "ferelibenterhominesidquodvoluntcredunt";
        String result = Func_main_0(threshold_a, threshold_d, threshold_b, threshold_c, max_length, input_string);
        System.out.println(result);
    }

    public static String Func_main_0(int threshold_a, int threshold_d, int threshold_b, int threshold_c, int max_length, String input_string) {
        if ((threshold_a & threshold_d) != 0) {
            if ((threshold_b & threshold_c) != 0) {
                if (input_string.length() <= max_length) {
                    return input_string;
                }
            }
        }
        return input_string.substring(0, max_length) + "...";
    }
}