import java.util.*;

public class atcoder_ABC137_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        PriorityQueue<int[]> x = new PriorityQueue<>((a, b) -> b[0] - a[0]);
        PriorityQueue<Integer> y = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            int day = scanner.nextInt();
            int salary = scanner.nextInt();
            x.offer(new int[]{-day, -salary});
        }
        while (!x.isEmpty()) {
            int[] pair = x.poll();
            int d = -pair[0];
            int s = -pair[1];
            int r = m - y.size();
            if (r >= d) {
                y.offer(s);
            } else if (!y.isEmpty() && y.peek() < s) {
                y.poll();
                y.offer(s);
            }
        }
        int sum = 0;
        while (!y.isEmpty()) {
            sum += y.poll();
        }
        System.out.println(sum);
    }
}