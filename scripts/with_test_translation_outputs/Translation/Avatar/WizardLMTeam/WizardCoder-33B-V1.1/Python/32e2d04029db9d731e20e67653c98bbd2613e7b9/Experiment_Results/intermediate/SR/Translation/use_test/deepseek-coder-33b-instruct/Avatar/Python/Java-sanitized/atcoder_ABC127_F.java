import java.util.*;

public class atcoder_ABC127_F {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        long sum_b = 0;
        long sum_p1 = 0;
        long sum_p2 = 0;
        PriorityQueue<Long> p1 = new PriorityQueue<>();
        PriorityQueue<Long> p2 = new PriorityQueue<>();
        for (int i = 0; i < q; i++) {
            int ql = scanner.nextInt();
            if (ql == 2) {
                if (p1.size() == p2.size()) {
                    System.out.println(-p2.peek() + " " + (sum_p1 - p1.size() * -p2.peek() + p2.size() * -p2.peek() - sum_p2 + sum_b));
                } else {
                    System.out.println(p1.peek() + " " + (sum_p1 - p1.size() * p1.peek() + p2.size() * p1.peek() - sum_p2 + sum_b));
                }
            } else {
                long b = scanner.nextLong();
                sum_b += b;
                if (p1.isEmpty()) {
                    p1.add(b);
                    sum_p1 += b;
                } else if (p1.peek() <= b) {
                    p1.add(b);
                    sum_p1 += b;
                } else {
                    p2.add(-b);
                    sum_p2 += b;
                }
                if (p1.size() < p2.size()) {
                    long k = p2.poll();
                    p1.add(-k);
                    sum_p2 -= k;
                    sum_p1 += k;
                }
                if (p1.size() - 1 > p2.size()) {
                    long k = p1.poll();
                    p2.add(-k);
                    sum_p1 -= k;
                    sum_p2 += k;
                }
            }
        }
    }
}