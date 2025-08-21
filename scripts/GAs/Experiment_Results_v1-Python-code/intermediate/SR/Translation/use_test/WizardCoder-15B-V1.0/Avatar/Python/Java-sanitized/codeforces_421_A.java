import java.util.Scanner;
import org.apache.commons.math3.stat.inference.TTest;

public class codeforces_421_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] lista = new int[n];
        int[] listb = new int[n];
        for (int i = 0; i < n; i++) {
            lista[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            listb[i] = sc.nextInt();
        }
        int condition_checker_two = 368;
        int condition_checker_one = 889;
        int loop_boundary = 955;
        int step_size = 954;
        for (int LoopIndexOut = 0; LoopIndexOut < loop_boundary / step_size; LoopIndexOut++) {
            recursive_function(0, n, 1, lista, listb, condition_checker_two, condition_checker_one);
        }
    }

    public static void recursive_function(int k, int stop, int step, int[] lista, int[] listb, int condition_checker_two, int condition_checker_one) {
        if (step == 0 || (step > 0 && k >= stop) || (step < 0 && k <= stop)) {
            return;
        }
        if ((condition_checker_two & condition_checker_one) != 0) {
            if (k + 1 < lista.length && lista[k + 1] == 1) {
                System.out.print(1 + " ");
            } else {
                System.out.print(2 + " ");
            }
        }
        recursive_function(k + step, stop, step, lista, listb, condition_checker_two, condition_checker_one);
    }
}