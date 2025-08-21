import java.util.Scanner;

public class atcoder_AGC028_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        String S = scanner.next();
        String T = scanner.next();
        char[] list_S = S.toCharArray();
        char[] list_T = T.toCharArray();
        int[] Number_iMN = new int[N];
        for (int i = 0; i < N; i++) {
            Number_iMN[i] = i * M / N;
        }
        int[] Number_j = new int[M];
        for (int j = 0; j < M; j++) {
            Number_j[j] = j;
        }
        int[] Kaburi_i = new int[Number_iMN.length];
        int counter = 0;
        boolean Flag = false;
        for (int i : Number_iMN) {
            for (int j : Number_j) {
                if (i == j) {
                    Kaburi_i[counter] = i;
                    counter++;
                }
            }
        }
        for (int i = 0; i < Kaburi_i.length; i++) {
            if (list_S[Kaburi_i[i]] != list_T[i]) {
                Flag = true;
                break;
            }
        }
        if (Flag) {
            System.out.println(-1);
        } else {
            System.out.println(N * M / gcd(N, M));
        }
    }

    public static int gcd(int a, int b) {
        while (b > 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}