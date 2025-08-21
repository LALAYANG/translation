import java.util.*;

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
        List<Integer> Number_i = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            Number_i.add(i);
        }
        List<Integer> Number_iMN = new ArrayList<>();
        for (int i : Number_i) {
            Number_iMN.add(i * M / N);
        }
        List<Integer> Number_j = new ArrayList<>();
        for (int j = 0; j < M; j++) {
            Number_j.add(j);
        }
        Number_i.retainAll(Number_iMN);
        List<Integer> Kaburi_i = new ArrayList<>();
        for (int j : Number_i) {
            Kaburi_i.add(j * N / M);
        }
        int counter = 0;
        int Flag = 0;
        int Kaburi_Size = Kaburi_i.size();
        while (counter <= Kaburi_Size - 1) {
            if (list_S[Kaburi_i.get(counter)] != list_T[counter]) {
                Flag = 1;
                break;
            }
            counter += 1;
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