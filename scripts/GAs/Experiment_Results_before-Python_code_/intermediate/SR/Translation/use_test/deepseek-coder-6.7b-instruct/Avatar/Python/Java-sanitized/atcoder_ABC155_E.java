import java.util.*;

public class atcoder_ABC155_E {
    static Scanner in = new Scanner(System.in);
    static String[] input_methods = {"clipboard", "file", "key"};
    static int using_method = 0;
    static String input_method = input_methods[using_method];
    static boolean isTest = false;

    public static void main(String[] args) {
        if (input_method.equals("clipboard")) {
            in = new Scanner(System.in);
        }
        int ret = main();
        if (ret != -1) {
            System.out.println(ret);
        }
    }

    static int main() {
        String s = in.next();
        int pp = 0;
        int na = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            int cc = na + Character.getNumericValue(c);
            na = 0;
            if (cc <= 4) {
                pp += cc;
            } else {
                na = 1;
                if (i == s.length() - 1) {
                    pp += 1;
                }
                pp += 10 - cc;
            }
        }
        return pp;
    }
}