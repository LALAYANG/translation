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
            x.add(new int[]{-day, -salary});
        }
        while (!x.isEmpty()) {
            int[] pop = x.poll();
            int d = pop[0];
            int salary = pop[1];
            int r = m - y.size();
            if (r >= -d) {
                y.add(salary);
            } else {
                y.add(salary);
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