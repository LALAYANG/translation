import java.util.Scanner;

public class codeforces_30_A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A = input.nextInt();
        int B = input.nextInt();
        int n = input.nextInt();

        int result = task4(A, B, n);
        System.out.println(result);
    }

    public static int task4(int A, int B, int n) {
        for (int X = -1000; X <= 1000; X++) {
            if (A * Math.pow(X, n) == B) {
                return X;
            }
        }
        return -1; // Return -1 if no solution is found
    }
}