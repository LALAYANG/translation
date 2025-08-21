import java.util.Scanner;

public class codeforces_421_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int[] list_a = new int[a];
        for (int i = 0; i < a; i++) {
            list_a[i] = scanner.nextInt();
        }
        int[] list_b = new int[b];
        for (int i = 0; i < b; i++) {
            list_b[i] = scanner.nextInt();
        }
        int CONDITION_1 = 899;
        int CONDITION_2 = 475;
        int LOOP_START = 938;
        int LOOP_END = 937;
        for (int LoopIndexOut = 0; LoopIndexOut < LOOP_START / LOOP_END; LoopIndexOut++) {
            for (int k = 0; k < n; k++) {
                if ((CONDITION_1 & CONDITION_2) != 0) {
                    if (k + 1 == list_a[0]) {
                        System.out.print(1 + " ");
                    } else {
                        System.out.print(2 + " ");
                    }
                }
            }
        }
    }
}