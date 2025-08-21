import java.util.*;

public class atcoder_AGC028_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        String S = scanner.next();
        String T = scanner.next();
        List<Character> list_S = new ArrayList<>();
        List<Character> list_T = new ArrayList<>();
        for (char c : S.toCharArray()) {
            list_S.add(c);
        }
        for (char c : T.toCharArray()) {
            list_T.add(c);
        }
        List<Integer> Number_i = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            Number_i.add(i);
        }
        List<Double> Number_iMN = new ArrayList<>();
        for (int i : Number_i) {
            Number_iMN.add((double) i * M / N);
        }
        List<Integer> Number_j = new ArrayList<>();
        for (int j = 0; j < M; j++) {
            Number_j.add(j);
        }
        List<Double> Kaburi_j = new ArrayList<>(new HashSet<>(Number_iMN));
        Kaburi_j.retainAll(Number_j);
        List<Integer> Kaburi_i = new ArrayList<>();
        for (double j : Kaburi_j) {
            Kaburi_i.add((int) (j * N / M));
        }
        int counter = 0;
        int Flag = 0;
        int Kaburi_Size = Kaburi_i.size();
        while (counter <= Kaburi_Size - 1) {
            if (list_S.get(Kaburi_i.get(counter)) == list_T.get(Kaburi_j.get(counter))) {
                // pass
            } else {
                Flag = 1;
                break;
            }
            counter = counter + 1;
        }
        if (Flag == 1) {
            System.out.println(-1);
        } else {
            System.out.println((int) (N * M / greatest_common_divisor(N, M)));
        }
    }

    public static int greatest_common_divisor(int a, int b) {
        while (b > 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}