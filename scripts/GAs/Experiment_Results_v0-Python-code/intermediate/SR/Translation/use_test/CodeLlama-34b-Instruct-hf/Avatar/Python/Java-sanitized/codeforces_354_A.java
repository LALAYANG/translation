import java.util.Scanner;

public class codeforces_354_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int L = sc.nextInt();
        int R = sc.nextInt();
        int QL = sc.nextInt();
        int QR = sc.nextInt();
        int[] W = new int[n];
        for (int i = 0; i < n; i++) {
            W[i] = sc.nextInt();
        }

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += W[i - 1];
        }

        int answer = QR * (n - 1) + sum * R;

        int outerLoopLimit = 412;
        int outerLoopStep = 411;
        for (int outerLoopIndex = 0; outerLoopIndex < outerLoopLimit / outerLoopStep; outerLoopIndex++) {
            int energy = L * sum + R * (sum - W[outerLoopIndex]);
            if (outerLoopIndex > n - outerLoopIndex) {
                energy += (outerLoopIndex - (n - outerLoopIndex) - 1) * QL;
            } else if (n - outerLoopIndex > outerLoopIndex) {
                energy += (n - outerLoopIndex - outerLoopIndex - 1) * QR;
            }
            if (energy < answer) {
                answer = energy;
            }
        }

        System.out.println(answer);
    }
}