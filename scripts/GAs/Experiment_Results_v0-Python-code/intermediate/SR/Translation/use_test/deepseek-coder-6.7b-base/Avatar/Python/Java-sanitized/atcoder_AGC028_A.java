import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class atcoder_AGC028_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        scanner.nextLine();
        String S = scanner.nextLine();
        String T = scanner.nextLine();
        char[] S_char = S.toCharArray();
        char[] T_char = T.toCharArray();
        int[] indices_n = new int[N];
        for (int i = 0; i < N; i++) {
            indices_n[i] = i;
        }
        double[] Number_iMN = new double[N];
        for (int i = 0; i < N; i++) {
            Number_iMN[i] = i * M / N;
        }
        int[] Number_j = new int[M];
        for (int j = 0; j < M; j++) {
            Number_j[j] = j;
        }
        int[] Kaburi_j = new int[M];
        int Kaburi_j_index = 0;
        for (int j = 0; j < M; j++) {
            for (int i = 0; i < N; i++) {
                if (Number_iMN[i] == Number_j[j]) {
                    Kaburi_j[Kaburi_j_index] = j;
                    Kaburi_j_index++;
                    break;
                }
            }
        }
        int[] Kaburi_i = new int[Kaburi_j_index];
        for (int j = 0; j < Kaburi_j_index; j++) {
            Kaburi_i[j] = (int) (Kaburi_j[j] * N / M);
        }
        int counter = 0;
        int Flag = 0;
        while (counter <= Kaburi_j_index - 1) {
            if (S_char[Kaburi_i[counter]] != T_char[Kaburi_j[counter]]) {
                Flag = 1;
                break;
            }
            counter++;
        }
        if (Flag == 1) {
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