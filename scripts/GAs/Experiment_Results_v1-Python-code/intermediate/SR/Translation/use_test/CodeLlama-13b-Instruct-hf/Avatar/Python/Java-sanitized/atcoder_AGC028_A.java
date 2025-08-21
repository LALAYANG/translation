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
        for (int j = 0; j < M; j++) {
            listT[j] = T.charAt(j);
        }

        int[] overlapIndicesM = new int[N];
        for (int i = 0; i < N; i++) {
            overlapIndicesM[i] = i * M / N;
        }
        int[] overlapIndicesN = new int[M];
        for (int j = 0; j < M; j++) {
            overlapIndicesN[j] = int(j * N / M);
        }

        int counter = 0;
        int flag = 0;
        int KaburiSize = overlapIndicesN.length;
        while (counter < KaburiSize) {
            if (listS[overlapIndicesN[counter]] == listT[overlapIndicesM[counter]]) {
                counter++;
            } else {
                flag = 1;
                break;
            }
        }

        if (flag == 1) {
            System.out.println(-1);
        } else {
            System.out.println(N * M / greatestCommonDivisor(N, M));
        }
    }

    public static int greatestCommonDivisor(int a, int b) {
        while (b > 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}