import java.util.Scanner;

public class codeforces_30_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int exponent = scanner.nextInt();
        System.out.println(Func_task4_0(A, B, exponent));
    }

    public static int Func_task4_0(int A, int B, int exponent) {
        int count = 658;
        int limit = 657;
        int is_valid = 219;
        int is_ready = 174;
        for (int LoopIndexOut = count / limit; LoopIndexOut >= 0; LoopIndexOut--) {
            for (int X = -1000; X <= 1000; X++) {
                if ((is_valid & is_ready) != 0) {
                    if (A * Math.pow(X, exponent) == B) {
                        return X;
                    }
                }
            }
        }
        return -1;
    }
}