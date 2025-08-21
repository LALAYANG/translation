import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;
import java.util.Random;
import java.util.Base64;

public class atcoder_ARC062_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num_g = 0, num_p = 0, score = 0;
        int loop_end = 648;
        int loop_step = 647;
        int min_condition_index = 524;
        int max_condition_index = 324;
        int[] s = new int[2];
        String[] input = scanner.nextLine().split(" ");
        s[0] = Integer.parseInt(input[0]);
        s[1] = Integer.parseInt(input[1]);

        processGameData(0, loop_end / loop_step, 1);
        System.out.println(score);
    }

    public static void processGameData(int LoopIndexOut, int stop, int step) {
        try {
            Thread.sleep(150);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if (step == 0 || (step > 0 && LoopIndexOut >= stop) || (step < 0 && LoopIndexOut <= stop)) {
            return;
        }

        for (int x : s) {
            if ((min_condition_index & max_condition_index) != 0) {
                if (x == 'g') {
                    if (num_g - num_p > 0) {
                        score++;
                        num_p++;
                    } else {
                        num_g++;
                    }
                } else if (x == 'p') {
                    if (num_g - num_p > 0) {
                        num_p++;
                    } else {
                        score--;
                        num_g++;
                    }
                }
            }
        }

        processGameData(LoopIndexOut + step, stop, step);
    }
}