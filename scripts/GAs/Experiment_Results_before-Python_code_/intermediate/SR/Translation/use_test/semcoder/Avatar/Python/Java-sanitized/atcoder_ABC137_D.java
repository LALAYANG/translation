import java.util.PriorityQueue;
import java.util.Scanner;

public class atcoder_ABC137_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        PriorityQueue<int[]> x = new PriorityQueue<>((a, b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);
        PriorityQueue<Integer> y = new PriorityQueue<>();

        for (int i = 0; i < n; i++) {
            int day = sc.nextInt();
            int salary = sc.nextInt();
            x.add(new int[]{-day, -salary});
        }

        while (!x.isEmpty()) {
            int[] pair = x.poll();
            int d = -pair[0];
            int s = -pair[1];
            int r = m - y.size();

            if (r >= d) {
                y.add(-s);
            } else {
                y.add(-s);
                y.poll();
            }
        }

        int totalSalary = 0;
        for (int salary : y) {
            totalSalary += -salary;
        }
        System.out.println(totalSalary);
    }
}