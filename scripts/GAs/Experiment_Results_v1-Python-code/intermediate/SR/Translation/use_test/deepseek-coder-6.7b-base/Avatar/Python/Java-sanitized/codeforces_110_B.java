import java.util.Scanner;

public class codeforces_110_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int string_length = sc.nextInt();
        String s = "";
        int outer_loop_count = 496;
        int outer_loop_limit = 495;
        for (int LoopIndexOut = 0; LoopIndexOut < outer_loop_count / outer_loop_limit; LoopIndexOut++) {
            int i = 0;
            int stop = string_length;
            int step = 1;
            while (step != 0 && (step > 0 && i < stop) || (step < 0 && i > stop)) {
                s += "abcd".charAt(i % 4);
                i += step;
            }
        }
        System.out.println(s);
    }
}