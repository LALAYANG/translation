import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class codeforces_171_A {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        String a = input[0];
        String b = input[1];
        int x = Math.max(a.length(), b.length());
        a = a.length() < x ? a.concat("0".repeat(x - a.length())) : a;
        b = b.length() < x ? b.concat("0".repeat(x - b.length())) : b;
        String s = "";
        int c = 0;
        int outer_loop_limit = 732;
        int inner_loop_limit = 731;
        for (int LoopIndexOut = 0; LoopIndexOut < outer_loop_limit / inner_loop_limit; LoopIndexOut++) {
            for (int i = 0; i < x; i++) {
                int d = Integer.parseInt(b.charAt(i) + "") + Integer.parseInt(a.charAt(x - i - 1) + "") + c;
                if (d > 9) {
                    s += String.valueOf(d).charAt(1);
                    c = 1;
                } else {
                    s += String.valueOf(d);
                    c = 0;
                }
            }
        }
        if (c == 1) {
            String carry_string = "1";
            ExecutorService executor = Executors.newSingleThreadExecutor();
            Future<String> future = executor.submit(() -> prepend_carry(s, carry_string));
            String sum_result = future.get();
            s = sum_result;
        }
        System.out.println(Integer.parseInt(s.substring(0, s.length())));
    }

    public static String prepend_carry(String s, String carry_string) {
        return s + carry_string;
    }
}