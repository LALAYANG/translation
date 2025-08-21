import java.util.Scanner;
import java.util.PriorityQueue;

public class atcoder_ABC127_F {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        int[][] queries = new int[q][3];
        for (int i = 0; i < q; i++) {
            queries[i] = new int[] { scanner.nextInt(), scanner.nextInt(), scanner.nextInt() };
        }

        PriorityQueue<Integer> p1 = new PriorityQueue<>();
        PriorityQueue<Integer> p2 = new PriorityQueue<>();
        int sum_adjustment = 0;
        int sum_p1 = 0;
        int sum_p2 = 0;

        for (int[] query : queries) {
            if (query[0] == 2) {
                if (p1.size() == p2.size()) {
                    System.out.println(-p2.peek() + " " + (sum_p1 - p1.size() * -p2.peek() + p2.size() * -p2.peek() - sum_p2 + sum_adjustment));
                } else {
                    System.out.println(p1.peek() + " " + (sum_p1 - p1.size() * p1.peek() + p2.size() * p1.peek() - sum_p2 + sum_adjustment));
                }
            } else {
                sum_adjustment += query[2];
                if (p1.isEmpty()) {
                    p1.add(query[1]);
                    sum_p1 += query[1];
                } else if (p1.peek() <= query[1]) {
                    p1.add(query[1]);
                    sum_p1 += query[1];
                } else {
                    p2.add(-query[1]);
                    sum_p2 += query[1];
                }
                if (p1.size() < p2.size()) {
                    int k = p2.poll();
                    p1.add(-k);
                    sum_p2 += k;
                    sum_p1 -= k;
                }
                if (p1.size() - 1 > p2.size()) {
                    int k = p1.poll();
                    p2.add(-k);
                    sum_p1 -= k;
                    sum_p2 += k;
                }
            }
        }
    }
}