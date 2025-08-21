import java.util.Scanner;

public class codeforces_421_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int[] lista = new int[a];
        int[] listb = new int[b];
        for (int i = 0; i < a; i++) {
            lista[i] = scanner.nextInt();
        }
        for (int i = 0; i < b; i++) {
            listb[i] = scanner.nextInt();
        }
        int condition_checker_two = 368;
        int condition_checker_one = 889;
        int loop_boundary = 955;
        int step_size = 954;
        for (int LoopIndexOut = 0; LoopIndexOut < loop_boundary / step_size; LoopIndexOut++) {
            for (int k = 0; k < n; k++) {
                if (condition_checker_two & condition_checker_one) {
                    if (lista[k] == 1) {
                        System.out.print(1 + " ");
                    } else {
                        System.out.print(2 + " ");
                    }
                }
            }
        }
    }
}