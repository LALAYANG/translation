import java.util.*;

public class atcoder_ABC137_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        PriorityQueue<Integer> x = new PriorityQueue<>(Comparator.reverseOrder());
        PriorityQueue<Integer> y = new PriorityQueue<>(Comparator.reverseOrder());

        for (int i = 0; i < n; i++) {
            int day = scanner.nextInt();
            int salary = scanner.nextInt();
            x.add(day);
            x.add(salary);
        }

        while (!x.isEmpty()) {
            int d = x.poll();
            int salary = x.poll();
            int r = m - y.size();
            if (r >= d) {
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