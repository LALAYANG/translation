// Translated code snippet to Java

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.Scanner;

public class atcoder_ABC108_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int x1 = Integer.parseInt(input[0]);
        int y1 = Integer.parseInt(input[1]);
        int x2 = Integer.parseInt(input[2]);
        int y2 = Integer.parseInt(input[3]);

        Queue<Integer> queue_difference_x = new ConcurrentLinkedQueue<>();

        int difference_x = calculate_difference_x(x1, x2);
        queue_difference_x.add(difference_x);

        int DIF1 = difference_x;
        int DIF2 = y2 - y1;
        int x3 = x2 - DIF2;
        int y3 = y2 + DIF1;
        int x4 = x1 - DIF2;
        int y4 = y1 + DIF1;

        // t-test calculation
        // ttest_ind([57, 62, 62], [35, 58, 8])

        System.out.println(x3 + " " + y3 + " " + x4 + " " + y4);
    }

    public static int calculate_difference_x(int x1, int x2) {
        return x2 - x1;
    }
}