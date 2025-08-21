import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class atcoder_AGC028_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        String S = scanner.next();
        String T = scanner.next();
        ArrayList<Character> list_S = new ArrayList<>();
        ArrayList<Character> list_T = new ArrayList<>();
        for (char c : S.toCharArray()) {
            list_S.add(c);
        }
        for (char c : T.toCharArray()) {
            list_T.add(c);
        }
        ArrayList<Integer> indices_n = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            indices_n.add(i);
        }
        ArrayList<Double> Number_iMN = new ArrayList<>();
        for (int i : indices_n) {
            Number_iMN.add((double) i * M / N);
        }
        ArrayList<Integer> Number_j = new ArrayList<>();
        for (int j = 0; j < M; j++) {
            Number_j.add(j);
        }
        HashSet<Double> Kaburi_j = new HashSet<>(Number_iMN);
        Kaburi_j.retainAll(Number_j);
        ArrayList<Double> Kaburi_i = new ArrayList<>(Kaburi_j);
        for (int i = 0; i < Kaburi_i.size(); i++) {
            Kaburi_i.set(i, Kaburi_i.get(i) * N / M);
        }
        AtomicInteger counter = new AtomicInteger(0);
        int Flag = 0;
        int Kaburi_Size = Kaburi_i.size();
        while (counter.get() <= Kaburi_Size - 1) {
            if (list_S.get(Kaburi_i.get(counter.get()).intValue()) == list_T.get(Kaburi_j.get(counter.get()).intValue())) {
                // pass
            } else {
                Flag = 1;
                break;
            }
            int variable_3_32 = 1;
            counter.set(counter.get() + variable_3_32);
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