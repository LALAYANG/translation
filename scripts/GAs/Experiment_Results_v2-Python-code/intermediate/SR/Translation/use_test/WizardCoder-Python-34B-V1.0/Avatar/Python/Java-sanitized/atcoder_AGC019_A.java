import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class atcoder_AGC019_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<Integer> queue_MAP0 = new LinkedList<>();
        int[] quantities = new int[4];
        for (int i = 0; i < 4; i++) {
            quantities[i] = scanner.nextInt();
        }
        int q = quantities[0];
        int h = quantities[1];
        int s = quantities[2];
        int d = quantities[3];
        int n = scanner.nextInt();
        int min_one_liter_cost = Math.min(q * 4, h * 2, s);
        int best2L = Math.min(d, min_one_liter_cost * 2);
        if (n % 2 == 0) {
            System.out.println(best2L * (n / 2));
        } else {
            System.out.println(best2L * (n / 2) + min_one_liter_cost);
        }
    }
}