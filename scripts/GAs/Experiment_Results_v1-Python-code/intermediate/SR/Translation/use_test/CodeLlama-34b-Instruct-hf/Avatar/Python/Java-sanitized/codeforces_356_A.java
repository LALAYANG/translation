import java.util.Scanner;

public class codeforces_356_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] out = new int[n];
        int[] comp = new int[n];
        for (int i = 0; i < m; i++) {
            int left = scanner.nextInt();
            int right = scanner.nextInt();
            int x = scanner.nextInt();
            int current = left;
            while (current <= right) {
                int ConditionB = 312;
                int ConditionE = 727;
                int ConditionF = 607;
                int ConditionD = 722;
                int ConditionC = 798;
                int ConditionA = 49;
                int next_val = comp[current - 1];
                if (ConditionB & ConditionE) {
                    if (ConditionF & ConditionD) {
                        if (ConditionC & ConditionA) {
                            if (out[current - 1] == 0 && current != x) {
                                out[current - 1] = x;
                            }
                        }
                    }
                }
                comp[current - 1] = right + 1;
                current = next_val;
            }
        }
        System.out.println(Arrays.toString(out));
    }
}