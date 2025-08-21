import java.util.Scanner;

public class atcoder_AGC028_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        scanner.nextLine();
        String S = scanner.nextLine();
        String T = scanner.nextLine();

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

        int[] Kaburi_j = new int[N];
        int k = 0;
        for (int j : Number_j) {
            for (int i : Number_iMN) {
                if (i == j) {
                    Kaburi_j[k] = i;
                    k++;
                }
            }
        }

        int[] Kaburi_i = new int[k];
        for (int j = 0; j < k; j++) {
            Kaburi_i[j] = Kaburi_j[j] * N / M;
        }

        int counter = 0;
        int Flag = 0;
        int Kaburi_Size = Kaburi_i.length;

        while (counter <= Kaburi_Size - 1) {
            if (list_S[Kaburi_i[counter]] != list_T[Kaburi_j[counter]]) {
                Flag = 1;
                break;
            }
            counter++;
        }

        if (Flag == 1) {
            System.out.println(-1);
        } else {
            int result = N * M / gcd(N, M);
            System.out.println(result);
        }
    }

    public static int gcd(int a, int b) {
        while (b > 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}