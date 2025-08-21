import java.util.*;

public class atcoder_ABC137_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        PriorityQueue<Integer> x = new PriorityQueue<>(n);
        PriorityQueue<Integer> y = new PriorityQueue<>(m);
        for (int i = 0; i < n; i++) {
            int day = sc.nextInt();
            int salary = sc.nextInt();
            x.offer(-day);
            x.offer(-salary);
        }
        while (!x.isEmpty()) {
            int d = -x.poll();
            int s = -x.poll();
            int r = m - y.size();
            if (r >= d) {
                y.offer(s);
            } else {
                y.offer(s);
                y.poll();
            }
        }
        int sum = 0;
        while (!y.isEmpty()) {
            sum += y.poll();
        }
        System.out.println(sum);
    }
}