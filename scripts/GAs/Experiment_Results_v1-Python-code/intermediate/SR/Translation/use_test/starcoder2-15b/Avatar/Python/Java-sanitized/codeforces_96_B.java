import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class codeforces_96_B {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        int limit = 1000000000;
        int four = 0;
        int seven = 0;
        int number = 0;
        int target_number = 0;
        int ans = 0;
        int outer_loop_limit = 690;
        int inner_loop_limit = 689;
        int LoopIndexOut = 0;
        int stop = outer_loop_limit / inner_loop_limit;
        int step = 1;
        Scanner scanner = new Scanner(System.in);
        target_number = scanner.nextInt();
        scanner.close();
        while (number <= limit) {
            if (number > 0 && four == seven) {
                l.add(number);
            }
            generate_number_sequence(number * 10 + 4, four + 1, seven);
            generate_number_sequence(number * 10 + 7, four, seven + 1);
        }
        Collections.sort(l);
        for (int val : l) {
            if (val >= target_number) {
                ans = val;
                break;
            }
        }
        while (step == 0 || (step > 0 && LoopIndexOut >= stop) || (step < 0 && LoopIndexOut <= stop)) {
            for (int val : l) {
                if (val >= target_number) {
                    ans = val;
                    break;
                }
            }
            LoopIndexOut += step;
        }
        System.out.println(ans);
    }

    public static void generate_number_sequence(int number, int four, int seven) {
        // TODO
    }
}