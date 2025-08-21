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

        int sumEL = 0;
        for (int i = 1; i <= n; i++) {
            sumEL += W[i - 1];
        }

        int answer = QR * (n - 1) + sumEL * R;

        for (int i = 1; i <= n; i++) {
            int energy = L * sumEL + R * (sumEL - sumEL);
            if (i > (n - i)) {
                energy += (i - (n - i) - 1) * QL;
            } else if ((n - i) > i) {
                energy += ((n - i) - i - 1) * QR;
            }
            if (energy < answer) {
                answer = energy;
            }
        }

        System.out.println(answer);
    }
}