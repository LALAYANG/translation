import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.Scanner;

public class atcoder_ABC151_A {
    private static boolean debug = false;

    public static void log_debug_info(String text) {
        if (debug) {
            System.out.println(text);
        }
    }

    public static Object[] parse_input(String lines_as_string) {
        String[] lines = null;
        if (lines_as_string == null) {
            debug = false;
            Scanner scanner = new Scanner(System.in);
            lines = new String[]{scanner.nextLine()};
        } else {
            debug = true;
            lines = lines_as_string.split("\n");
        }
        String c = lines[0].split(" ")[0];
        return new Object[]{c};
    }

    public static String solve(String c) {
        String a = "abcdefghijklmnopqrstuvwxyz";
        int char_index = a.indexOf(c);
        return a.charAt(char_index + 1) + "";
    }

    public static void main(String[] args) {
        String[] input = null;
        if (args.length > 0) {
            input = args;
        }
        Object[] parsed_input = parse_input(input != null ? String.join("\n", args) + "\n" : null);
        String c = (String) parsed_input[0];
        String result = solve(c);
        System.out.println(result);
    }
}