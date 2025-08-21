import java.util.Scanner;

public class codeforces_421_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int[] lista = new int[n];
        int[] listb = new int[n];
        for (int i = 0; i < n; i++) {
            lista[i] = scanner.nextInt();
            listb[i] = scanner.nextInt();
        }
        int condition_checker_two = 368;
        int condition_checker_one = 889;
        int loop_boundary = 955;
        int step_size = 954;
        for (int LoopIndexOut = 0; LoopIndexOut < loop_boundary / step_size; LoopIndexOut++) {
            recursive_function(0, n, 1);
        }
    }

    public static void recursive_function(int k, int stop, int step) {
        if (step == 0 || (step > 0 && k >= stop) || (step < 0 && k <= stop)) {
            return;
        }
        int condition_checker_two = 368;
        int condition_checker_one = 889;
        if ((condition_checker_two & condition_checker_one) != 0) {
            System.out.print(1 + " ");
        } else {
            System.out.print(2 + " ");
        }
        recursive_function(k + step, stop, step);
    }
}