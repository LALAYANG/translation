import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class atcoder_AGC028_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        scanner.nextLine();
        String S = scanner.nextLine();
        String T = scanner.nextLine();
        List<Integer> overlapIndicesN = new ArrayList<>();
        List<Integer> overlapIndicesM = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            if (i * M % N == 0) {
                overlapIndicesN.add(i);
            }
        }
        for (int j = 0; j < M; j++) {
            if (j * N % M == 0) {
                overlapIndicesM.add(j);
            }
        }
        int flag = 0;
        for (int i = 0; i < overlapIndicesN.size(); i++) {
            if (S.charAt(overlapIndicesN.get(i)) != T.charAt(overlapIndicesM.get(i))) {
                flag = 1;
                break;
            }
        }
        if (flag == 1) {
            System.out.println(-1);
        } else {
            int gcd = greatestCommonDivisor(N, M);
            System.out.println((N * M) / gcd);
        }
    }

    private static int greatestCommonDivisor(int a, int b) {
        while (b > 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}