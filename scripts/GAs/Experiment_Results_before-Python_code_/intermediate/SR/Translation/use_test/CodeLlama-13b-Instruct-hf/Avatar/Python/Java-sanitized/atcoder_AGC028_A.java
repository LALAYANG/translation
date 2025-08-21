import java.util.Scanner;

public class atcoder_AGC028_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        String S = scanner.next();
        String T = scanner.next();

        int[] listS = new int[N];
        int[] listT = new int[M];
        for (int i = 0; i < N; i++) {
            listS[i] = S.charAt(i);
        }
        for (int i = 0; i < M; i++) {
            listT[i] = T.charAt(i);
        }

        int[] Number_iMN = new int[N];
        for (int i = 0; i < N; i++) {
            Number_iMN[i] = i * M / N;
        }

        int[] Kaburi_j = new int[M];
        for (int i = 0; i < M; i++) {
            Kaburi_j[i] = i;
        }

        int[] Kaburi_i = new int[N];
        for (int i = 0; i < N; i++) {
            Kaburi_i[i] = (int) (Kaburi_j[i] * N / M);
        }

        int counter = 0;
        int flag = 0;
        while (counter < N && flag == 0) {
            if (listS[Kaburi_i[counter]] == listT[Kaburi_j[counter]]) {
                counter++;
            } else {
                flag = 1;
            }
        }

        if (flag == 1) {
            System.out.println(-1);
        } else {
            int gcd = gcd(N, M);
            System.out.println(N * M / gcd);
        }
    }

    private static int gcd(int a, int b) {
        while (b > 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}