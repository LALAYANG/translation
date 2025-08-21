import java.util.Scanner;

public class atcoder_AGC028_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        String S = sc.next();
        String T = sc.next();

        int[] listS = new int[N];
        int[] listT = new int[M];

        for (int i = 0; i < N; i++) {
            listS[i] = S.charAt(i) - 'a';
        }

        for (int i = 0; i < M; i++) {
            listT[i] = T.charAt(i) - 'a';
        }

        int[] overlapIndicesM = new int[M];
        int[] overlapIndicesN = new int[N];

        for (int i = 0; i < M; i++) {
            overlapIndicesM[i] = i * N / M;
        }

        for (int i = 0; i < N; i++) {
            overlapIndicesN[i] = i * M / N;
        }

        int counter = 0;
        int flag = 0;
        int kaburiSize = overlapIndicesN.length;

        while (counter <= kaburiSize - 1) {
            if (listS[overlapIndicesN[counter]] == listT[overlapIndicesM[counter]]) {
                pass;
            } else {
                flag = 1;
                break;
            }
            counter++;
        }

        if (flag == 1) {
            System.out.println(-1);
        } else {
            System.out.println(N * M / greatestCommonDivisor(N, M));
        }
    }

    public static int greatestCommonDivisor(int a, int b) {
        while (b > 0) {
            (a, b) = (b, a % b);
        }
        return a;
    }
}