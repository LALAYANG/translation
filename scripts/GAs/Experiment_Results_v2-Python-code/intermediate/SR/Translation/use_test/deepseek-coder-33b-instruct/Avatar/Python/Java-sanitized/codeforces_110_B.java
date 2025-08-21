import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class codeforces_110_B {
    static String s = "";
    static String base_string = "abcd";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input_length = scanner.nextInt();
        stringBuilder(0, input_length, 1);
        System.out.println(s);
    }

    public static void stringBuilder(int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        s += base_string.charAt(i % 4);
        stringBuilder(i + step, stop, step);
    }
}