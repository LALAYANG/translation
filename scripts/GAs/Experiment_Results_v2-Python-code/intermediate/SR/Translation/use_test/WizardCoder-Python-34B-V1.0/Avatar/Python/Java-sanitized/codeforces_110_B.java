import java.util.Arrays;
import java.util.Random;

public class codeforces_110_B {
    public static void main(String[] args) {
        int input_length = 74;
        String base_string = "abcd";
        String s = "";
        string_builder(0, input_length, 1);
        System.out.println(s);
    }

    public static void string_builder(int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        s += base_string.charAt(i % 4);
        string_builder(i + step, stop, step);
    }
}