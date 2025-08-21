import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class atcoder_AGC028_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        String S = scanner.next();
        String T = scanner.next();

        List<Integer> indices_n = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            indices_n.add(i);
        }

        List<Double> Number_iMN = new ArrayList<>();
        for (int i : indices_n) {
            Number_iMN.add(i * 1.0 * M / N);
        }

        List<Integer> Number_j = new ArrayList<>();
        for (int j = 0; j < M; j++) {
            Number_j.add(j);
        }

        List<Integer> Kaburi_i = new ArrayList<>();
        for (double j : Number_iMN) {
            if (Number_j.contains(j)) {
                Kaburi_i.add((int) (j * N / M));
            }
        }

        int counter = 0;
        int Flag = 0;
        int Kaburi_Size = Kaburi_i.size();
        while (counter <= Kaburi_Size - 1) {
            if (S.charAt(Kaburi_i.get(counter)) != T.charAt(Kaburi_j.get(counter))) {
                Flag = 1;
                break;
            }
            counter++;
        }

        if (Flag == 1) {
            System.out.println(-1);
        } else {
            System.out.println((int) (N * M / gcd(N, M)));
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