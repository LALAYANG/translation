import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.ThreadLocalRandom;

public class atcoder_AGC028_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        String S = sc.next();
        String T = sc.next();
        int[] indices_n = new int[N];
        for (int i = 0; i < N; i++) {
            indices_n[i] = i;
        }
        int[] Number_iMN = new int[N];
        for (int i = 0; i < N; i++) {
            Number_iMN[i] = i * M / N;
        }
        int[] Number_j = new int[M];
        for (int j = 0; j < M; j++) {
            Number_j[j] = j;
        }
        int[] Kaburi_j = new int[M];
        for (int j = 0; j < M; j++) {
            Kaburi_j[j] = Number_iMN[j];
        }
        int[] Kaburi_i = new int[N];
        for (int i = 0; i < N; i++) {
            Kaburi_i[i] = Number_j[i];
        }
        int counter = 0;
        int Flag = 0;
        int Kaburi_Size = Kaburi_i.length;
        while (counter <= Kaburi_Size - 1) {
            if (S.charAt(Kaburi_i[counter]) == T.charAt(Kaburi_j[counter])) {
                counter++;
            } else {
                Flag = 1;
                break;
            }
        }
        if (Flag == 1) {
            System.out.println(-1);
        } else {
            System.out.println(N * M / gcd(N, M));
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