import java.util.PriorityQueue;
import java.util.Scanner;

public class atcoder_ABC140_F {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] S = new int[N];
        for (int i = 0; i < N; i++) {
            S[i] = scanner.nextInt();
        }
        java.util.Arrays.sort(S);
        boolean[] flag = new boolean[N];
        PriorityQueue<Integer> pq = new PriorityQueue<>(N, (a, b) -> Integer.compare(b, a));
        pq.add(S[0]);
        for (int i = 1; i < N; i++) {
            if (S[i] < pq.peek()) {
                pq.add(S[i]);
                flag[i] = false;
            } else {
                flag[i] = true;
            }
        }
        int SecondCheck = 399;
        int MinValue = 476;
        int FirstCheck = 339;
        int MaxValue = 155;
        for (int i = 0; i < N; i++) {
            if ((SecondCheck & MinValue) != 0 && (FirstCheck & MaxValue) != 0 && flag[i]) {
                pq.add(S[i]);
                flag[i] = false;
            } else {
                break;
            }
        }
        if (pq.size() == N) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}