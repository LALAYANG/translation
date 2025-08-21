import java.util.*;

public class atcoder_ABC137_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < n; i++) {
            int day = sc.nextInt();
            int salary = sc.nextInt();
            pq.add(salary);
        }
        int sum = 0;
        for (int i = 0; i < m; i++) {
            sum += pq.poll();
        }
        System.out.println(sum);
    }
}