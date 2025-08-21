import java.util.Scanner;

public class atcoder_AGC028_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        String S = scanner.next();
        String T = scanner.next();

        int[] list_S = new int[S.length()];
        int[] list_T = new int[T.length()];

        for (int i = 0; i < S.length(); i++) {
            list_S[i] = S.charAt(i) - '0';
        }

        for (int i = 0; i < T.length(); i++) {
            list_T[i] = T.charAt(i) - '0';
        }

        int[] Number_iMN = new int[N];
        for (int i = 0; i < N; i++) {
            Number_iMN[i] = i * M / N;
        }

        int[] Number_j = new int[M];
        for (int i = 0; i < M; i++) {
            Number_j[i] = i;
        }

        int[] Kaburi_j = new int[M];
        for (int i = 0; i < M; i++) {
            Kaburi_j[i] = (int) (Number_iMN[i] * N / M);
        }

        int[] Kaburi_i = new int[N];
        for (int i = 0; i < N; i++) {
            Kaburi_i[i] = (int) (Number_j[i] * M / N);
        }

        int counter = 0;
        int Flag = 0;
        int Kaburi_Size = Kaburi_i.length;

        while (counter <= Kaburi_Size - 1) {
            if (list_S[Kaburi_i[counter]] == list_T[Kaburi_j[counter]]) {
                pass;
            } else {
                Flag = 1;
                break;
            }
            counter++;
        }

        if (Flag == 1) {
            System.out.println(-1);
        } else {
            System.out.println(N * M / Func_gcd_0(N, M));
        }
    }

    public static int Func_gcd_0(int a, int b) {
        while (b > 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}