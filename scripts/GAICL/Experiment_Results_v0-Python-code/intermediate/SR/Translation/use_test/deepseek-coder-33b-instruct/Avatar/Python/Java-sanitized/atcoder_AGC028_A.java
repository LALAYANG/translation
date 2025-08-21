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
        char[] list_S = S.toCharArray();
        char[] list_T = T.toCharArray();
        ArrayList<Integer> newNumber_i_1 = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            newNumber_i_1.add(i);
        }
        ArrayList<Double> Number_iMN = new ArrayList<>();
        for (int i : newNumber_i_1) {
            Number_iMN.add((double) i * M / N);
        }
        ArrayList<Integer> Number_j = new ArrayList<>();
        for (int j = 0; j < M; j++) {
            Number_j.add(j);
        }
        HashSet<Double> Kaburi_j = new HashSet<>(Number_iMN);
        Kaburi_j.retainAll(new HashSet<>(Number_j));
        ArrayList<Integer> Kaburi_i = new ArrayList<>();
        for (double j : Kaburi_j) {
            Kaburi_i.add((int) (j * N / M));
        }
        AtomicInteger counter = new AtomicInteger(0);
        int Flag = 0;
        int Kaburi_Size = Kaburi_i.size();
        while (counter.get() <= Kaburi_Size - 1) {
            if (list_S[Kaburi_i.get(counter.get())] == list_T[Kaburi_i.get(counter.get())]) {
                // pass
            } else {
                Flag = 1;
                break;
            }
            counter.incrementAndGet();
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