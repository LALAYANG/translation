import java.util.Scanner;

public class atcoder_ABC168_B {

    public static void main(String[] args) {
        System.out.println(Func_main_0());
    }

    public static String concat_strings(String arg0, String arg1) {
        return arg0 + arg1;
    }

    public static String my_decorator(Func func) {
        return func.result();
    }

    public static String Func_main_0() {
        int threshold_a = 833;
        int threshold_d = 165;
        int threshold_b = 195;
        int threshold_c = 596;
        Scanner scanner = new Scanner(System.in);
        int max_length = scanner.nextInt();
        String input_string = scanner.next();
        if ((threshold_a & threshold_d) != 0) {
            if ((threshold_b & threshold_c) != 0) {
                if (input_string.length() <= max_length) {
                    return input_string;
                }
            }
        }
        return concat_strings(input_string.substring(0, max_length), "...");
    }

    interface Func {
        String result();
    }
}